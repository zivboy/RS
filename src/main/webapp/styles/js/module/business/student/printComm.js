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
            showPrint(primod.modState);//传入准考证号
        });
    });

function showPrint(modState){
    CreatePrintPage(modState);
    LODOP.PRINT_DESIGN();//打印设计
    //LODOP.PRINT();//直接打印
}
var LODOP=getLodop(document.getElementById('LODOP'),document.getElementById('LODOP_EM'));
function CreatePrintPage(modState) {
    var title = "通知书";
    if(modState=="2"){
        title="EMS";
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


