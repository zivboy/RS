//加载插件
requirejs(['jquery','bootstrap', 'select', 'selectCN', 'validator', 'vb', 'validatorLAG', 'comm', 'form', 'message'],
    function ($, _) {

        //返回
        $("#back").bind("click", function () {
            window.history.go(-1);
        });


        //提示框
        var $OK = $.scojs_message.TYPE_OK;
        var $ERROR = $.scojs_message.TYPE_ERROR;
        //修改页面结束

        parent.Loading.modal('hide');

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

                if (($("#img").val() == '' )&&( $("#file").val() == '')) {
                    highlight_error($("#file"));
                    return false;
                }
                else if($("#file").val() != ''){
                    var $form = $(e.target),
                        formData = new FormData(),
                        params = $form.serializeArray(),
                        files = $form.find('[name="file"]')[0].files;

                    $.each(files, function (i, file) {
                        formData.append('file', file);
                    });

                    $.each(params, function (i, val) {
                        formData.append(val.name, val.value);
                    });

                    $.ajax({
                        url: $form.attr('action'),
                        data: formData,
                        cache: false,
                        contentType: false,
                        processData: false,
                        type: 'POST',
                        success: function (rsp) {
                            if (rsp.successful) {
                                $("#save").toggleClass("disabled");
                                    $.scojs_message(rsp.msg, $OK);
                                    setTimeout("window.location.href='" + WEB_GLOBAL_CTX + "/business/model/index'", 1000);
                            } else {
                                $.scojs_message(rsp.msg, $ERROR);
                            }
                        }
                    });
                    return true;
                }
                else{
                    var $form = $(e.target);
                    var params = $form.serialize();
                    $.post(WEB_GLOBAL_CTX + "/business/model/update", params, function (rsp) {
                        if (rsp.successful) {
                            $.scojs_message(rsp.msg, $OK);
                            $("#save").toggleClass("disabled");
                            setTimeout("window.location.href='" + WEB_GLOBAL_CTX + "/business/model/index'", 1000);
                        } else {
                            $.scojs_message(rsp.msg, $ERROR);
                        }
                    }).error(function () {
                    });
                    return true;
                }

            });



    });


