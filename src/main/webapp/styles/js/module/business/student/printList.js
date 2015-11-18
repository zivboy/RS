
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
                doBulkPrint(primod,priitemsList,student);
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
    LODOP.PRINT();
}
var LODOP=getLodop(document.getElementById('LODOP'),document.getElementById('LODOP_EM'));
function CreatePrintPage(primod,priitemsList,student) {
    var title = "通知书"
    if(primod.modState=="2"){
        title = "EMS";
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
function getLodop(oOBJECT,oEMBED){
    /**************************
     本函数根据浏览器类型决定采用哪个对象作为控件实例：
     IE系列、IE内核系列的浏览器采用oOBJECT，
     其它浏览器(Firefox系列、Chrome系列、Opera系列、Safari系列等)采用oEMBED。
     **************************/
    var strHtml1="<br><font color='#FF00FF'>打印控件未安装!点击这里<a href='install_lodop.exe'>执行安装</a>,安装后请刷新页面或重新进入。</font>";
    var strHtml2="<br><font color='#FF00FF'>打印控件需要升级!点击这里<a href='install_lodop.exe'>执行升级</a>,升级后请重新进入。</font>";
    var strHtml3="<br><br><font color='#FF00FF'>注意：<br>1：如曾安装过Lodop旧版附件npActiveXPLugin,请在【工具】->【附加组件】->【扩展】中先卸它;<br>2：如果浏览器表现出停滞不动等异常，建议关闭其“plugin-container”(网上搜关闭方法)功能;</font>";
    var LODOP=oEMBED;
    try{
        if (navigator.appVersion.indexOf("MSIE")>=0) LODOP=oOBJECT;

        if ((LODOP==null)||(typeof(LODOP.VERSION)=="undefined")) {
            if (navigator.userAgent.indexOf('Firefox')>=0)
                document.documentElement.innerHTML=strHtml3+document.documentElement.innerHTML;
            if (navigator.appVersion.indexOf("MSIE")>=0) document.write(strHtml1); else
                document.documentElement.innerHTML=strHtml1+document.documentElement.innerHTML;
            return LODOP;
        } else if (LODOP.VERSION<"6.0.5.8") {
            if (navigator.appVersion.indexOf("MSIE")>=0) document.write(strHtml2); else
                document.documentElement.innerHTML=strHtml2+document.documentElement.innerHTML;
            return LODOP;
        }
        //*****如下空白位置适合调用统一功能:*********


        //*******************************************
        return LODOP;
    }catch(err){
        document.documentElement.innerHTML="Error:"+strHtml1+document.documentElement.innerHTML;
        return LODOP;
    }
}


