/**
 * Created by Vincent on 2015/3/1.
 */
requirejs(['jquery', 'bootstrap', 'table', 'tablezn', 'select','selectCN','tExport', 'tExportS', 'base64', 'comm', 'message'],
    function () {

        //导出编码
        $.base64.utf8encode = true;
        var $OK = $.scojs_message.TYPE_OK;
        var $ERROR = $.scojs_message.TYPE_ERROR;

        //列表
        var $table = $('#tableB').bootstrapTable({
            url: WEB_GLOBAL_CTX + '/generator/tablesDataList',
            dataType: 'json',
            cache:false,
            showToggle:true,
            showExport:true,
            showRefresh:true,
            showColumns:true,
            exportTypes:"['doc', 'excel']",
            toolbar:'#custom-toolbar',
            toolbarAlign:'left',
            sidePagination:'server',
            clickToSelect:true,
            singleSelect:true,
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

        //初始化下拉框 //可做异步下拉框选择
        initSelect("search_tableSchema", WEB_GLOBAL_CTX+"/generator/dataBase", {description: ''}, ''.split(","), "database", "database",false);

        //查询动作
        $('#query').click(function () {
            $table.bootstrapTable('refresh', {
                url: WEB_GLOBAL_CTX + '/generator/tablesDataList',
                queryParams: 'queryParamsF'
            });
        });

        $('#compressed').click(function () {
            parent.Loading.modal('show');
            var objects = $table.bootstrapTable('getSelections');
            $.each(objects, function () {
                self.location = WEB_GLOBAL_CTX + "/generator/tablesEdit/"+this.tableName+"/"+this.tableSchema;
            });

        });

    });


//本页查询拼装
function queryParamsF(params) {
    var name = $("#search_select").val();
    var tableSchema = $("#search_tableSchema").val();
    var value = $("#search").val();
    var str = '"' + name + '":"' + value + '"';
    str += ',"search_tableSchema":"' + tableSchema +  '"';
    var data = eval('({' + str + '})');
    params.sortName = "TABLE_NAME";
    params.sortOrder = "asc";
    return $.extend({}, params, data);
}
