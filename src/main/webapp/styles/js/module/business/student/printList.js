
/**
 * Created by xecoder on Sat Oct 17 14:49:26 GMT+08:00 2015.
 */

requirejs(['jquery', 'bootstrap', 'table', 'tablezn', 'tExport', 'tExportS', 'base64', 'comm', 'message'],
    function () {

        //导出编码
        $.base64.utf8encode = true;
        var $OK = $.scojs_message.TYPE_OK;
        var $ERROR = $.scojs_message.TYPE_ERROR;

        //列表
        var $table = $('#tableB').bootstrapTable({
            url: WEB_GLOBAL_CTX + '/business/student/list',
            dataType: 'json',
            cache:false,
            showToggle:true,
            showExport:true,
            showRefresh:true,
            showColumns:true,
            exportTypes:"['excel']",
            toolbar:'#custom-toolbar',
            toolbarAlign:'left',
            sidePagination:'server',
            clickToSelect:true,
            singleSelect:false,
            smartDisplay: false,
            queryParams: 'queryParamsF',
            pagination: true,
            pageSize: 5,
            pageList: [5, 10, 20, 100]
        }).on('check.bs.table', function (e, row) {
            showEdit($table, 'to', 'do', 'in');
        }).on('uncheck.bs.table', function (e, row) {
            showEdit($table, 'to', 'do', 'in');
        }).on('page-change.bs.table', function (e, size, number) {
            setHeightSelf(200*number/10);
        });

        //初始化UL列表
        initUl("primods", WEB_GLOBAL_CTX+"/business/student/findPrimod", "modId", "modName");

        //查询动作
        $('#query').click(function () {
            $table.bootstrapTable('refresh', {
                url: WEB_GLOBAL_CTX + '/business/student/list',
                queryParams: 'queryParamsF'
            });
        });

        //删除
        $('#delete').click(function () {
            var objects = $table.bootstrapTable('getSelections');
            console.debug('Selected values: ' + objects.length);
            $.each(objects, function () {
                $.post(WEB_GLOBAL_CTX + "/business/student/delete/" + this.id, function (rsp) {
                    if (rsp.successful) {
                        $.scojs_message(rsp.msg, $OK);
                        flashTable('tableB', '/business/student/list');
                    } else {
                        $.scojs_message(rsp.msg, $ERROR);
                    }
                }).error(function () {
                    $.scojs_message("更新失败,请重新登陆!", $ERROR);
                });
            });
        });

        //添加
        $('#add').click(function () {
            parent.Loading.modal('show');
            self.location = WEB_GLOBAL_CTX + "/business/student/add";
        });

        //修改
        $('#modify').click(function () {
            parent.Loading.modal('show');
            var objects = $table.bootstrapTable('getSelections');
            $.each(objects, function () {
                self.location = WEB_GLOBAL_CTX + "/business/student/edit/"+this.id;
            });
        });

        parent.Loading.modal('hide');

    });


//本页查询拼装
function queryParamsF(params) {
    var name = $("#search_select").val();
    var value = $("#search").val();
    var str = "{\"" + name + "\":\"" + value + "\"}";
    var data = eval('(' + str + ')');
    //params.sortName = "";
    //params.sortOrder = "";
    return $.extend({}, params, data);
}

//初始化UL下拉函数
function initUl(id, ajaxUrl, vModId, vModName) {
    //同步
    $.ajax({
        async: false,
        cache: false,
        type: 'POST',
        url: ajaxUrl,
        data: {},
        success: function (result) {
            var lis = "";
            $(result).each(function () {
                lis += selectLi($(this), vModId, vModName);
            });
            $("#" + id).append(lis);
        }
    });
}

function selectLi(obj, vModId, vModName) {
    var modName = (vModName != undefined && vModName != null && vModName != "") ? vModName : "modName";
    var modId = (vModId != undefined && vModId != null && vModId != "") ? vModId : "modId";
    return "<li><a onclick='toPrint("+obj[0][modId]+")'>"+obj[0][modName]+"</a></li>\n";
}

function toPrint(smodId){
    var $table = $('#tableB');
    var objects = $table.bootstrapTable('getSelections');
    if(objects==undefined||objects==""){
        $.scojs_message("请选择一条记录!",$.scojs_message.TYPE_ERROR);
        return false;
    }
    if(objects.length > 1){
        bulkPrint(objects,smodId);//批打
    }else{
        singlePrint(objects,smodId);//单打
    }
}

function bulkPrint(objects,smodId){
    var primod,priitemsList;
    $.post(WEB_GLOBAL_CTX + "/business/student/getPri/" + smodId, function (data) {
        //data = eval("(" + data + ")");//字符串转成json对象
        primod = eval("(" + data.split("#")[0] + ")");
        priitemsList = eval("(" +data.split("#")[1]+ ")");
        $.each(objects, function () {
            $.post(WEB_GLOBAL_CTX + "/business/student/get/" + this.id, function (student) {
                if(primod.modState==1&&student.tzsbs=="1"){
                    if(confirm("该学生通知书已打印！是否继续打印！")) doBulkPrint(primod,priitemsList,student);
                }else if(primod.modState==2&&student.emsbs=="1"){
                    if(confirm("该学生EMS已打印！是否继续打印！")) doBulkPrint(primod,priitemsList,student);
                }else doBulkPrint(primod,priitemsList,student);
            });
        });
    });
}
function singlePrint(objects,smodId){
    $.each(objects, function () {
        self.location = WEB_GLOBAL_CTX + "/business/student/print/"+this.id+"?modId="+smodId;
    });
}

/**************************
 以下打印专用
 **************************/

function doBulkPrint(primod,priitemsList,student){
    CreatePrintPage(primod,priitemsList,student);
    var printFlag = LODOP.PRINT();//1 true 打印成功 0 false打印失败
    if(printFlag=="true"||printFlag=="1"){
        var params ="id="+student.id;
        if(primod.modState=="1"){
            params = params +"&tzsbs=1";//通知书打印标识
        }else{
            params = params +"&emsbs=1";//EMS打印标识
        }
        $.post(WEB_GLOBAL_CTX + "/business/student/save", params, function (rsp) {
        })
    }
}
var LODOP=getLodop(document.getElementById('LODOP'),document.getElementById('LODOP_EM'));
function CreatePrintPage(primod,priitemsList,student) {
    var title = student.xm+"通知书"
    if(primod.modState=="2"){
        title = student.xm+"EMS";
    }
    LODOP.PRINT_INIT(title);
    LODOP.ADD_PRINT_SETUP_BKIMG("<img border='0' src='"+WEB_GLOBAL_CTX+"/download/getImg?filePath="+primod.url+"'/>");
    LODOP.SET_SHOW_MODE("BKIMG_WIDTH",primod.modWidth);
    LODOP.SET_SHOW_MODE("BKIMG_HEIGHT",primod.modHeight);
    $.each(priitemsList, function () {
        var text = "";
        if(this.priValue==null||this.priValue==""){
            text = student[this.priCode];
        }else{
            text = this.priValue;
        }
        LODOP.ADD_PRINT_TEXT(this.priTop,this.priLeft,this.priWidth,this.priHeight,text);
        LODOP.SET_PRINT_STYLEA(0,"FontName","华文中宋");
        LODOP.SET_PRINT_STYLEA(0,"FontSize",10);
        LODOP.SET_PRINT_STYLEA(0,"Bold",0);
    });
}
var CreatedOKLodop7766=null;
function getLodop(oOBJECT,oEMBED){
    /**************************
     本函数根据浏览器类型决定采用哪个页面元素作为Lodop对象：
     IE系列、IE内核系列的浏览器采用oOBJECT，
     其它浏览器(Firefox系列、Chrome系列、Opera系列、Safari系列等)采用oEMBED,
     如果页面没有相关对象元素，则新建一个或使用上次那个,避免重复生成。
     64位浏览器指向64位的安装程序install_lodop64.exe。
     **************************/
    var strHtmInstall="<br><font color='#FF00FF'>打印控件未安装!点击这里<a href='"+WEB_GLOBAL_CTX+"/download/getImg?filePath=/upload/install_lodop32.exe' target='_self'>执行安装</a>,安装后请刷新页面或重新进入。</font>";
    var strHtmUpdate="<br><font color='#FF00FF'>打印控件需要升级!点击这里<a href='"+WEB_GLOBAL_CTX+"/download/getImg?filePath=/upload/install_lodop32.exe' target='_self'>执行升级</a>,升级后请重新进入。</font>";
    var strHtm64_Install="<br><font color='#FF00FF'>打印控件未安装!点击这里<a href='"+WEB_GLOBAL_CTX+"/download/getImg?filePath=/upload/install_lodop64.exe' target='_self'>执行安装</a>,安装后请刷新页面或重新进入。</font>";
    var strHtm64_Update="<br><font color='#FF00FF'>打印控件需要升级!点击这里<a href='"+WEB_GLOBAL_CTX+"/download/getImg?filePath=/upload/install_lodop64.exe' target='_self'>执行升级</a>,升级后请重新进入。</font>";
    var strHtmFireFox="<br><br><font color='#FF00FF'>（注意：如曾安装过Lodop旧版附件npActiveXPLugin,请在【工具】->【附加组件】->【扩展】中先卸它）</font>";
    var strHtmChrome="<br><br><font color='#FF00FF'>(如果此前正常，仅因浏览器升级或重安装而出问题，需重新执行以上安装）</font>";
    var LODOP;
    try{
        //=====判断浏览器类型:===============
        var isIE	 = (navigator.userAgent.indexOf('MSIE')>=0) || (navigator.userAgent.indexOf('Trident')>=0);
        var is64IE  = isIE && (navigator.userAgent.indexOf('x64')>=0);
        //=====如果页面有Lodop就直接使用，没有则新建:==========
        if (oOBJECT!=undefined || oEMBED!=undefined) {
            if (isIE)
                LODOP=oOBJECT;
            else
                LODOP=oEMBED;
        } else {
            if (CreatedOKLodop7766==null){
                LODOP=document.createElement("object");
                LODOP.setAttribute("width",0);
                LODOP.setAttribute("height",0);
                LODOP.setAttribute("style","position:absolute;left:0px;top:-100px;width:0px;height:0px;");
                if (isIE) LODOP.setAttribute("classid","clsid:2105C259-1E0C-4534-8141-A753534CB4CA");
                else LODOP.setAttribute("type","application/x-print-lodop");
                document.documentElement.appendChild(LODOP);
                CreatedOKLodop7766=LODOP;
            } else
                LODOP=CreatedOKLodop7766;
        };
        //=====判断Lodop插件是否安装过，没有安装或版本过低就提示下载安装:==========
        if ((LODOP==null)||(typeof(LODOP.VERSION)=="undefined")) {
            if (navigator.userAgent.indexOf('Chrome')>=0)
                document.documentElement.innerHTML=strHtmChrome+document.documentElement.innerHTML;
            if (navigator.userAgent.indexOf('Firefox')>=0)
                document.documentElement.innerHTML=strHtmFireFox+document.documentElement.innerHTML;
            if (is64IE) document.write(strHtm64_Install); else
            if (isIE)   document.write(strHtmInstall);    else
                document.documentElement.innerHTML=strHtmInstall+document.documentElement.innerHTML;
            return LODOP;
        } else
        if (LODOP.VERSION<"6.1.9.8") {
            if (is64IE) document.write(strHtm64_Update); else
            if (isIE) document.write(strHtmUpdate); else
                document.documentElement.innerHTML=strHtmUpdate+document.documentElement.innerHTML;
            return LODOP;
        };
        //=====如下空白位置适合调用统一功能(如注册码、语言选择等):====


        //============================================================
        return LODOP;
    } catch(err) {
        if (is64IE)
            document.documentElement.innerHTML="Error:"+strHtm64_Install+document.documentElement.innerHTML;else
            document.documentElement.innerHTML="Error:"+strHtmInstall+document.documentElement.innerHTML;
        return LODOP;
    };
}