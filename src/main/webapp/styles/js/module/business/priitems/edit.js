//加载插件
requirejs(['jquery',  'bootstrap', 'fuelux', 'select', 'selectCN', 'validator', 'vb', 'validatorLAG', 'comm', 'form', 'message'],
    function ($, _) {

        //返回
        $("#back").bind("click", function () {
            window.history.go(-1);
        });

        //提示框
        var $OK = $.scojs_message.TYPE_OK;
        var $ERROR = $.scojs_message.TYPE_ERROR;
        var modIdVal = "";
        if (priitems != undefined && priitems != null && priitems != "") {
            //初始化页面
            meForm($('#formSubmit'), priitems);
            $('.selectpicker').selectpicker('refresh');
            modIdVal = priitems.modId;
            var priCode = priitems.priCode;
        }
        else {

        }
        //修改页面结束
        initSelect("modId", WEB_GLOBAL_CTX+"/business/priitems/getAllPrimod", {}, [modIdVal], "modId", "modName",false);
        initSelect("priCode", WEB_GLOBAL_CTX+"/business/priitems/getPriCodeDown", {dicName: 'PRI-CODE', modId:$("#modId").val()}, [priCode], "dicKey", "dicValue",false);
        parent.Loading.modal('hide');
        //根据模板确定打印下拉项
        $("#modId").change(function(){
            $("#priCode").empty();
            initSelect("priCode", WEB_GLOBAL_CTX+"/business/priitems/getPriCodeDown", {dicName: 'PRI-CODE', modId:$("#modId").val()}, "", "dicKey", "dicValue",false);
        });
        //提交
        $('#formSubmit').formValidation({
            framework: 'bootstrap',
            icon: {
                valid: 'glyphicon glyphicon-ok',
                invalid: 'glyphicon glyphicon-remove',
                validating: 'glyphicon glyphicon-refresh'
            },
            locale: 'zh_CN',
            excluded: ':disabled'
        }).on('success.field.fv', function (e, data) {
            if (data.fv.getInvalidFields().length > 0) {    // There is invalid field
                data.fv.disableSubmitButtons(true);
            }
        })
            .on('success.form.fv', function (e) {
                e.preventDefault();
                var $form = $(e.target);
                var params = $form.serialize();
                $.post(WEB_GLOBAL_CTX + "/business/priitems/save", params, function (rsp) {
                    if (rsp.successful) {
                        $.scojs_message(rsp.msg, $OK);
                        $("#save").toggleClass("disabled");
                        setTimeout("window.location.href='" + WEB_GLOBAL_CTX + "/business/priitems/index'", 1000);
                    } else {
                        $.scojs_message(rsp.msg, $ERROR);
                    }
                }).error(function () {
                });
                return true;
            });

    });


