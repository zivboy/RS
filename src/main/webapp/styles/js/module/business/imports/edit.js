//加载插件

requirejs(['jquery', 'switchs', 'fuelux', 'bootstrap', 'select', 'selectCN', 'validator', 'vb', 'validatorLAG', 'comm', 'form', 'message'],
    function ($, _) {

        //列表
        var fieldList;//行数据
        var importsBean;//导入bean
        var columnCount;//dbf行数
        var columnsList;//表字段
        var isModelFlag = false;

        //返回
        $("#back").bind("click", function () {
            window.history.go(-1);
        });

        //提示框
        var $OK = $.scojs_message.TYPE_OK;
        var $ERROR = $.scojs_message.TYPE_ERROR;

        initSelect("modelList", WEB_GLOBAL_CTX + "/business/model/modelList", '', '', "modelId", "name", true);

        //初始化下拉框 //可做异步下拉框选择
        initSelect("sfdm", WEB_GLOBAL_CTX+"/business/dictionary/find/sfdm", {description: ''}, "", "dicKey", "dicValue",true);
        initSelect("pc", WEB_GLOBAL_CTX+"/business/batch/lists", {description: ''}, "", "id", "batchName",true);
        initSelect("xqdm", WEB_GLOBAL_CTX+"/business/dictionary/find/xqdm", {description: ''}, "", "dicKey", "dicValue",true);

        //选择模板
        $( "#modelList").change(function(){

            $("select[name='fieldHtml']").each(function() {
                    $(this).selectpicker('val',"");
            });

            var id = jQuery(this).find('option:selected').val();
            $.ajax({
                async: false,
                cache: false,
                type: 'POST',
                url: WEB_GLOBAL_CTX + "/business/item/model/list/"+id,
                error: function () {// 请求失败处理函数
                    $.scojs_message("获取失败,请重新登陆!", $ERROR);
                },
                success: function (result) {
                    $(result).each(function () {
                        var options_value = this.targetTable+"."+this.targetField;
                        var select_value = this.sourceField;
                        var i =0;
                        $("input[name='columnHtml']").each(function() {
                            if($(this).val()==  options_value)
                            {
                                $("#fieldHtml_"+i).selectpicker('val',select_value);
                            }
                            i++;
                        });

                    });
                }
            });
        });

        var msg = "文件限于dbf格式，请重新选择";
        var type = ".DBF";
        $("#file").change(function () {
            var filepath = $("#file").val();
            var extStart = filepath.lastIndexOf(".");
            var ext = filepath.substring(extStart, filepath.length).toUpperCase();
            if (ext != type) {
                $("#file").val("");
                $.scojs_message(msg, $ERROR);
                highlight_error($("#file"));
                return false;
            }
            else
                return true;
        });

        if (imports != undefined && imports != null && imports != "") {
            //初始化页面
            meForm($('#formSubmit'), imports);
        }
        else {

        }
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
        }).on('success.form.fv', function (e) {
            e.preventDefault();
            $("#xq").val($("#xqdm option:selected").text());
            $("#sf").val($("#sfdm option:selected").text());
            var $form = $(e.target);
            var params = $form.serialize();
            var selectedCount =$("select[name='fieldHtml']").length;
            var fv = $form.data('formValidation');

            if ($("#name").val() == '' && isModelFlag) {
                highlight_error($("#name"));
                return false;
            }
            else if (selectedCount==0) {
                $.scojs_message("未选择字段匹配", $ERROR);
                return false;
            } else {

                $.post(WEB_GLOBAL_CTX + "/business/imports/saveModel", params, function (rsp) {
                    if (rsp.successful) {
                        $.scojs_message(rsp.msg, $OK);
                        $("#save").toggleClass("disabled");
                        setTimeout("window.location.href='" + WEB_GLOBAL_CTX + "/business/imports/index'", 1000);
                    } else {
                        $.scojs_message(rsp.msg, $ERROR);
                    }
                }).error(function () {
                });
                return true;
            }
        });


        // WIZARD
        var wizard = $('#myWizard');
        wizard.on('changed.fu.wizard', function (e, data) {
            console.log('changed');
            console.log(data);

            if (data.step === 2) {
                var alertMsg = true;
                if ($("#file").val() == '') {
                    alertMsg = false;
                }
                else {
                    var filepath = $("#file").val();
                    var extStart = filepath.lastIndexOf(".");
                    var ext = filepath.substring(extStart, filepath.length).toUpperCase();
                    if (ext != type) {
                        alertMsg = false;
                    }
                }
                if (!alertMsg) {
                    wizard.wizard('selectedItem', {
                        step: 1
                    });
                    $("#file").val("");
                    $.scojs_message(msg, $ERROR);
                    highlight_error($("#file"));
                    return false;
                }
                else {
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
                        url: WEB_GLOBAL_CTX + "/business/imports/save",
                        data: formData,
                        cache: false,
                        contentType: false,
                        processData: false,
                        type: 'POST',
                        success: function (rsp) {
                            if (rsp.successful) {
                                importsBean = rsp.data;

                                fieldList = importsBean.itemList;
                                columnCount = importsBean.fieldCount;
                                columnsList = importsBean.column;
                                $("#filePath").val(importsBean.filePath);
                                $("#title").val(importsBean.title);
                                initFields(columnsList, fieldList);//以数据库列为第一列页面字段
                                $.scojs_message(rsp.msg, $OK);
                                parent.Loading.modal('hide');
                                setHeight();
                            } else {
                                $.scojs_message(rsp.msg, $ERROR);
                            }
                        }
                    });
                }
            }
        });

        function initFields(vColumnsList, vFieldList) {
            var i = 0;
            $.each(vColumnsList, function (n, value) {
                if (value.columnKey == "") {
                    var options = "";
                    options += "                        <div class='row control-group' >\n";
                    options += "                            <div class='col-sm-2 controls col-sm-offset-1'><h4><span class='label label-success'>" + value.columnComment + "</span></h4></div>\n";
                    options += "                            <div class='col-sm-4 controls'><input type='text' class='form-control' id='column_" + i + "' name='columnHtml' tabindex='" + i + "' value='" + value.tableName + "." + value.columnName + "' readonly/></div>\n";
                    options += "                            <div class='col-sm-4 controls'><select id='fieldHtml_" + i + "' name='fieldHtml' class='form-control selectpicker show-tick'  required ></select></div>\n";
                    options += "                        </div>\n\n";
                    $("#fields").append(options);
                    initSelectByData(vFieldList, "fieldHtml_" + i, "sourceField", "sourceField");
                    i++;
                }
            });
        }

        wizard.on('actionclicked.fu.wizard', function (e, data) {
            console.log('action clicked');
            console.log(data);

            if (data.step === 2 && $("#filePath").val() != "") {
                $("#formSubmit").submit();
            }
            //$("#formSubmit").submit();
        });
        wizard.on('stepclicked.fu.wizard', function (e, data) {
            parent.Loading.modal('show');
        });

        var modelNameDiv = '<input type="text" class="form-control" id="name" name="name" maxlength="50" placeholder="输入模板名称" size="100" required/>';

        //状态插件
        $("input[type=\"checkbox\"]").not("[data-switch-no-init]").bootstrapSwitch()
            .on('switchChange.bootstrapSwitch', function (event, state) {
                if (state) {
                    $("#modelFlag").val(state)
                    $("#saveOne").append(modelNameDiv);
                }
                else {
                    $("#modelFlag").val(state)
                    $("#saveOne").empty();
                }
                isModelFlag = state;
            });

    });


