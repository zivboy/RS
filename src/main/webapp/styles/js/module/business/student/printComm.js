//加载插件
requirejs(['jquery',  'bootstrap', 'fuelux','switchs', 'select', 'selectCN', 'validator', 'vb', 'validatorLAG', 'comm', 'form', 'message'],
    function ($, _) {

        //返回
        $("#back").bind("click", function () {
            window.history.go(-1);
        });

        //提示框
        var $OK = $.scojs_message.TYPE_OK;
        var $ERROR = $.scojs_message.TYPE_ERROR;

        if (student != undefined && student != null && student != "") {
            //初始化页面
            meForm($('#formSubmit'), student);
            $('.selectpicker').selectpicker('refresh');
            if(primod.modState=="2"){//寄件人信息填充
                $.each(priitemsList, function () {
                    var text = "";
                    if(this.priValue!=null&&this.priValue!=""){
                        text = this.priValue;
                        $("#"+this.priCode).val(text);
                        $("#"+this.priCode).attr("readonly",true);
                    }
                });
            }
        }
        else {

        }
        //修改页面结束

        parent.Loading.modal('hide');
        $("#print").click(function(){
            if(primod.modState==1&&student.tzsbs=="1"){
                if(confirm("该学生通知书已打印！是否继续打印！")) showPrint(primod.modState);
            }else if(primod.modState==2&&student.emsbs=="1"){
                if(confirm("该学生EMS已打印！是否继续打印！")) showPrint(primod.modState);
            }else showPrint(primod.modState);
        });
    });

function showPrint(modState){
    CreatePrintPage(modState);
    //var printDesign = LODOP.PRINT_DESIGN();//打印设计 返回的是程序代码
    var printCount = LODOP.PRINT_SETUP();//打印维护 返回的是打印次数
    if(printCount > 0){
        var params ="id="+student.id;
        if(modState=="1"){
            params = params +"&tzsbs=1";//通知书打印标识
        }else{
            params = params +"&emsbs=1";//EMS打印标识
        }
        $.post(WEB_GLOBAL_CTX + "/business/student/save", params, function (rsp) {
            /*if (rsp.successful) {
                setTimeout("window.location.href='" + WEB_GLOBAL_CTX + "/business/student/printList'", 1000);
            }*/
        })
    }
    //LODOP.PRINT();//直接打印
}
var LODOP=getLodop(document.getElementById('LODOP'),document.getElementById('LODOP_EM'));
function CreatePrintPage(modState) {
    var title = student.xm+"通知书";
    if(modState=="2"){
        title=student.xm+"EMS";
    }
    LODOP.PRINT_INIT(title);
    LODOP.ADD_PRINT_SETUP_BKIMG("<img border='0' src='"+WEB_GLOBAL_CTX+"/download/getImg?filePath="+primod.url+"'/>");
    LODOP.SET_SHOW_MODE("BKIMG_WIDTH",primod.modWidth);
    LODOP.SET_SHOW_MODE("BKIMG_HEIGHT",primod.modHeight);
    $.each(priitemsList, function () {
        var text = "";
        if(modState=="1"){
            if(this.priValue==null||this.priValue==""){
               text = student[this.priCode];
            }else{
               text = this.priValue;
            }
        }else if(modState=="2"){
            text = $("#"+this.priCode).val();
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





