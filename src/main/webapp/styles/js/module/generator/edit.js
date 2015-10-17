/**
 * Created by Vincent on 2015/2/25.
 */
//加载插件

requirejs(['jquery','bootstrap','fuelux','table', 'tablezn','select','switchs','selectCN','validator','vb','validatorLAG','comm','form','message'],
    function ($) {

        //返回
        $("#back").bind("click",function(){
            window.history.go(-1);
        });


        //删除
        $('#delete').click(function () {
            var selects = $table.bootstrapTable('getSelections');
            ids = $.map(selects, function (row) {
                return row.columnCode;
            });
            $table.bootstrapTable('remove', {
                field: 'columnCode',
                values: ids
            });
            showEdit($table, 'to', 'do', 'in');
        });
        //修改
        $('#modify').click(function () {
            currentRow = JSON.parse(JSON.stringify($table.bootstrapTable('getSelections')));
            $('#row').modal('show');
            updateRowEdit(currentRow[0]);
        });

        //修改
        $('#ok').click(function () {
            currentIndex=currentRow[0].number;
            currentRow.state = $("#state").val();
            currentRow.columnCode = $("#columnCode").val();
            currentRow.columnName = $("#columnName").val();
            currentRow.type = $("#type").val();
            currentRow.list = $("#list").val();
            currentRow.validate = $("#validate").val();
            currentRow.isNullable = $("#isNullable").bootstrapSwitch('state')?"YES":"NO";
            currentRow.key = $("#key").bootstrapSwitch('state');
            currentRow.essential = $("#essential").bootstrapSwitch('state');
            currentRow.query = $("#query").bootstrapSwitch('state');
            updateRow(currentIndex,currentRow);
        });

        //提示框
        var $OK = $.scojs_message.TYPE_OK;
        var $ERROR = $.scojs_message.TYPE_ERROR;

        $table = $('#tableB').bootstrapTable({
            url: WEB_GLOBAL_CTX + '/generator/columnsDataList/'+tableName+"/"+schema,
            dataType: 'json',
            cache:false,
            showRefresh:true,
            toolbar:'#custom-toolbar',
            toolbarAlign:'left',
            sidePagination:'server',
            clickToSelect:true,
            singleSelect:true,
            smartDisplay: false,
            queryParams: 'queryParamsF',
            pagination: false
        }).on('check.bs.table', function (e, row) {
            showEdit($table, 'to', 'do', 'in');
        }).on('uncheck.bs.table', function (e, row) {
            showEdit($table, 'to', 'do', 'in');
        }).on('page-change.bs.table', function (e, size, number) {
            setHeightSelf(500);
        }).on('load-success.bs.table', function (e, data) {
            setHeightSelf(1000);
            parent.Loading.modal('hide');
        });

        //状态插件
        $("input[type=\"checkbox\"], input[type=\"radio\"]").not("[data-switch-no-init]").bootstrapSwitch()
            .on('switchChange.bootstrapSwitch', function(event, state) {
                //console.log(state); // true | false
            });

        $("#moduleName").val(tableComment);
        $("#moduleCode").val(tableName);
        $("#moduleCodeUrl").val("com.ssm.business");
        $("#indexPageName").val("list");
        $("#editPageName").val("edit");

        $('#formSubmit').formValidation({
            framework: 'bootstrap',
            icon: {
                valid: 'glyphicon glyphicon-ok',
                invalid: 'glyphicon glyphicon-remove',
                validating: 'glyphicon glyphicon-refresh'
            },
            locale: 'zh_CN',
            excluded: ':disabled',
            fields: {
            'indexPageName': {
                    validators: {
                        regexp: {
                            regexp: /^[a-zA-Z0-9]+$/,
                            message: '不要包含特殊字符'
                        }
                    }
                },
                'editPageName': {
                    validators: {
                        regexp: {
                            regexp: /^[a-zA-Z0-9]+$/,
                            message: '不要包含特殊字符'
                        }
                    }
                },
                'moduleCode': {
                    validators: {
                        regexp: {
                            regexp: /^[a-zA-Z0-9]+$/,
                            message: '不要包含特殊字符'
                        }
                    }
                },
                'moduleCodeUrl': {
                    validators: {
                        regexp: {
                            regexp: /^[a-zA-Z0-9./]+$/,
                            message: '不要包含特殊字符'
                        }
                    }
                }
            }
        }).on('success.field.fv', function(e, data) {
            if (data.fv.getInvalidFields().length > 0) {    // There is invalid field
                data.fv.disableSubmitButtons(true);
            }
        }).on('success.form.fv', function (e) {
            e.preventDefault();
            var effectRow = new Object();
            effectRow["allColumns"] = JSON.stringify($table.bootstrapTable('getData'));
            if(effectRow["allColumns"].length<5){
                $.scojs_message("没有列信息", $ERROR);
                return false;
            }
            var codeTable="\"moduleName\":\"" + $("#moduleName").val() + "\"";
            codeTable += ","+"\"moduleCode\":\"" + $("#moduleCode").val() + "\"";
            codeTable += ","+"\"moduleCodeUrl\":\"" + $("#moduleCodeUrl").val() + "\"";
            codeTable += ","+"\"indexPageName\":\"" + $("#indexPageName").val() + "\"";
            codeTable += ","+"\"editPageName\":\"" + $("#editPageName").val() + "\"";

            effectRow["codeTable"] = JSON.stringify(JSON.parse("{"+codeTable+"}"));
            console.debug(JSON.stringify(effectRow));
            $.post(WEB_GLOBAL_CTX+"/generator/saveTableList/"+$('#override').is(':checked'), effectRow, function(rsp) {
                    if (rsp.successful) {
                        $.scojs_message(rsp.msg, $OK);
                        $("#save").toggleClass("disabled");
                        //setTimeout("window.location.href='" + WEB_GLOBAL_CTX + "/generator/list'", 1000);
                    } else {
                        $.scojs_message(rsp.msg, $ERROR);
                        return false;
                    }
                }).error(function () {
                });
                return true;
            });

    });


function nameRule(name)
{
    var obj = $("#"+name);
    if(obj.val().indexOf("_")>-1||obj.val().indexOf("-")>-1){
        showMsg('输入错误',obj.val()+' : 请不要有特殊字符');
        obj.focus();
        return false;
    }
    else
        return true;
}

function updateRowEdit(row)
{
        $("#state").val(row.state);
        $("#columnCode").val(row.columnCode);
        $("#columnName").val(row.columnName);
        $("#type").append(typeFormatter(row.type));
        $("#list").val(row.list);
        $("#validate").val(row.validate);
        $("#isNullable").bootstrapSwitch('state', (row.isNullable == 'YES') ? true : false);
        $("#key").bootstrapSwitch('state', row.key);
        $("#essential").bootstrapSwitch('state', row.essential);
        $("#query").bootstrapSwitch('state', row.query);
}


var typeList= [ {value:'text',text:'文本'},{value:'longText',text:'长文本'},{value:'number',text:'数值'},{value:'bigText',text:'大文本'},{value:'date',text:'日期'},{value:'time',text:'时间'},{value:'checkBox',text:'多选'},{value:'combo',text:'下拉'},{value:'file',text:'上传'},{value:'hidden',text:'隐藏'}];

function typeFormatter(value){
    var temp = '';
    for(var i=0; !(i >= typeList.length); i++){
        if (typeList[i].value == value)
        {
            temp +='<option value="'+typeList[i].value+'" selected>'+typeList[i].text+'</option>';
        }
        else
        {
            temp +='<option value="'+typeList[i].value+'">'+typeList[i].text+'</option>';
        }
    }
    return temp;
}
function updateRow(index,row)
{
    $table.bootstrapTable('updateRow', {
        index: index,
        row: row
    });
    $('#row').modal('hide');
}