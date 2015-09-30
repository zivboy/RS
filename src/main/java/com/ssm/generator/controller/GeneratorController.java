package com.ssm.generator.controller;

import com.alibaba.fastjson.JSON;
import com.ssm.common.baseaction.BaseAction;
import com.ssm.common.mybatis.Page;
import com.ssm.common.util.FileUtil;
import com.ssm.common.util.Result;
import com.ssm.common.util.StringUtil;
import com.ssm.generator.entity.*;
import com.ssm.generator.service.ColumnsService;
import com.ssm.generator.service.TablesService;
import com.ssm.viewModel.GridModel;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 代码生成
 * Created by ZHEJIANG RUIZHENG  on 2014/10/13.
 */
@Controller
@RequestMapping("/generator")
@SuppressWarnings("unchecked")
public class GeneratorController extends BaseAction {
    protected Logger logger = LoggerFactory.getLogger(getClass());

    private static final String T_LIST = "generator/tablesList";
    private static final String T_EDIT = "generator/tablesEdit";


    @Autowired
    private ColumnsService columnsService;

    @Autowired
    private TablesService tablesService;

    @RequestMapping(value="/tablesList", method= RequestMethod.GET)
    public ModelAndView tablesList() {
        ModelAndView modelAndView = new ModelAndView(T_LIST);
        return modelAndView;
    }

    /**
     * 所有的列和表名
     * @param tableName
     * @return
     */
    @RequestMapping(value="/tablesEdit/{tableName}", method= RequestMethod.GET)
    public ModelAndView tablesEdit(@PathVariable String tableName) {
        ModelAndView modelAndView = new ModelAndView(T_EDIT);
        Tables tables = new Tables();
        tables.setTableName(tableName);
        List<Tables> list =  tablesService.selectByExample(page(),tables );
        for(Tables tables1 : list) {
            modelAndView.addObject("tableName", StringUtils.lowerCase(tableName));
            modelAndView.addObject("tableComment", StringUtils.lowerCase(tables1.getTableComment()));
        }
        return modelAndView;
    }


    /**
     * 表列表
     * @return
     */
    @RequestMapping(value="/tablesDataList")
    @ResponseBody
    public GridModel tablesDataList(){
        Tables tables = SearchForm(Tables.class);
        Page info = tablesService.findByPage(page(), tables);
        GridModel m = new GridModel();
        m.setRows(info.getRows());
        m.setTotal(info.getCount());
        return m;
    }


    /**
     * 字段列表
     * @param tableName
     * @return
     */
    @RequestMapping(value="/columnsDataList/{tableName}")
    @ResponseBody
    public GridModel columnsDataList(@PathVariable String tableName)  {
        Columns columns = SearchForm(Columns.class);
        columns.setTableName(tableName);
        Page info = columnsService.findByPage(page(), columns);
        GridModel m = new GridModel();
        List<CodeColumn> CodeColumn = new ArrayList<>();
        List<Columns> columnsList = info.getRows();
        int i=0;
        for(Columns columns1 : columnsList )
        {
            i+=1;
            CodeColumn column = new CodeColumn();

            column.setKey(StringUtils.equals(columns1.getColumnKey(),"PRI")?true:false);
            column.setColumnCode(columns1.getColumnName());
            column.setColumnName(columns1.getColumnComment()!=null?columns1.getColumnComment():column.getColumnCode());


            if(StringUtils.indexOf(columns1.getDataType(),"int")>-1) {
                column.setType("number");
                column.setValidate("numeric");
            }
            else if(StringUtils.indexOf(columns1.getDataType(),"date")==0) {
                column.setType("date");
                column.setValidate("date");
            }
            else if(StringUtils.indexOf(columns1.getDataType(),"time")>-1) {
                column.setType("time");
            }
            else if(StringUtils.indexOf(columns1.getDataType(),"varchar")>-1&&columns1.getCharacterMaximumLength()<=20) {
                column.setType("text");
            }
            else if(StringUtils.indexOf(columns1.getDataType(),"varchar")>-1&&columns1.getCharacterMaximumLength()>20&&columns1.getCharacterMaximumLength()<=100) {
                column.setType("longText");
            }
            else if(StringUtils.indexOf(columns1.getDataType(),"varchar")>-1&&columns1.getCharacterMaximumLength()>100) {
                column.setType("bigText");
            }
            else
            {
                column.setType("text");
            }
            if(column.isKey())
                column.setType("hidden");

            column.setList("");
            column.setGroupId(i <= 6 ? 1 : (i >12?2:3));
            column.setEssential(StringUtils.equals(columns1.getIsNullable(), "YES") ? false : true);

            column.setQuery(false);
            if(StringUtils.equals(column.getType(),"number")&&column.isEssential()) {
                column.setMinLength(1);
                column.setMaxLength(columns1.getCharacterMaximumLength()!=null?Integer.parseInt(columns1.getCharacterMaximumLength().toString()):0);
            }
            else if((StringUtils.equals(column.getType(),"text")||StringUtils.equals(column.getType(),"longText")||StringUtils.equals(column.getType(),"bigText"))&&column.isEssential()) {
                column.setMinLength(2);
                column.setMaxLength(Integer.parseInt(columns1.getCharacterMaximumLength().toString()));
            }
            else {
                column.setMinLength(0);
                column.setMaxLength(0);
            }
            column.setMinValue(0);
            column.setMaxValue(0);


            column.setIsNullable(columns1.getIsNullable());
            column.setCharacterMaximumLength(columns1.getCharacterMaximumLength()!=null?columns1.getCharacterMaximumLength():20);
            column.setDataType(columns1.getDataType());

            CodeColumn.add(column);
        }
        m.setRows(CodeColumn);
        m.setTotal(info.getCount());
        return m;
    }


    /**
     * 数据库
     * @return
     */
    @RequestMapping(value="/dataBase")
    @ResponseBody
    public List<DataBase> dataBase(){
        List<DataBase> list = tablesService.dataBaseGenerator();
        return list;
    }

    @RequestMapping(value="/saveTableList/{override}")
    @ResponseBody
    @Transactional
    public Result saveTableList(HttpServletRequest req,@PathVariable String override){
        //设置请求编码
        try {
            req.setCharacterEncoding("UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        //获取编辑数据 这里获取到的是json字符串
        String allColumns = req.getParameter("allColumns"),tableKeyColumn;
        String codeTableJson = req.getParameter("codeTable");

        Result result = new Result();

        CodeTable codeTable = JSON.parseObject(codeTableJson, CodeTable.class);
        codeTable.setLowerModuleCode(StringUtil.firstCharacterToLower(codeTable.getModuleCode()));

        //创建基础目录
        try {

            List<CodeColumn> codeColumnList = JSON.parseArray(allColumns, CodeColumn.class);
            tableKeyColumn = findKeyColumn(codeColumnList);

            //目录信息
            String basePath = this.getClass().getResource("/").toString().replaceAll("file:","").replaceFirst("/",""),fileNameExt="New",rootPath="";
            File f = new File(basePath);
            rootPath = f.getParentFile().getParentFile().getParentFile().getParentFile().getPath()+File.separator;


            if(StringUtils.equals(override,"true"))
            {
                fileNameExt = "";
            }
            String templatePath = "mybatisG/template/",
            packagePath = codeTable.getModuleCodeUrl(),
            javaPath = rootPath+"src/main/java/"+StringUtils.replace(packagePath,".",File.separator)+"/",
            webPath = FileUtil.createFolders(rootPath + "src/main/webapp/WEB-INF/views/business/", codeTable.getLowerModuleCode().replaceAll("\\.", "|")),

            //主文件信息
            lowerModuleCode = codeTable.getLowerModuleCode(),
            moduleCode = codeTable.getModuleCode(),
            moduleName = codeTable.getModuleName(),

            //service
            serviceImplName = codeTable.getModuleCode()+"ServiceImpl"+fileNameExt,
            serviceImplTemplate = FileUtil.readTxt(basePath + templatePath + "ServiceImpl.txt", "UTF-8"),

            serviceName = codeTable.getModuleCode()+"Service"+fileNameExt,
            serviceTemplate = FileUtil.readTxt(basePath + templatePath + "Service.txt", "UTF-8"),

            //controller
            controllerName = codeTable.getModuleCode()+"Controller"+fileNameExt,
            controllerTemplate = FileUtil.readTxt(basePath + templatePath + "Controller.txt", "UTF-8"),

            //web页面
            indexPageName = codeTable.getIndexPageName(),
            indexPageTemplate = FileUtil.readTxt(basePath + templatePath + "list.txt", "UTF-8"),
            editPageName = codeTable.getEditPageName(),
            editPageTemplate = FileUtil.readTxt(basePath + templatePath + "edit.txt", "UTF-8"),

            //替换string
                                                    // 查询条件列========
                searchTypeDiv = "",//字符查询组合div========

            searchColumnsList = "",//查询条件列下拉---
                comboboxJavaScript = "",//下拉脚本---
                searchTypeDivText = "",//查询条件名称---

            columnsShowDiv = "",//表头
                columnsFormatterComboboxJavaScript = "",//下拉脚本

            //编辑页面
            hiddenDiv = "", //隐藏
            regionGroup = "", //块

            columnsConditionJavaCode = "";

            //serviceImplTemplate替换
            serviceImplTemplate = StringUtils.replace(serviceImplTemplate,"{Sysdate}",(new Date()).toString());
            serviceImplTemplate = StringUtils.replace(serviceImplTemplate,"{serviceName}",serviceName);
            serviceImplTemplate = StringUtils.replace(serviceImplTemplate,"{serviceImplName}",serviceImplName);
            serviceImplTemplate = StringUtils.replace(serviceImplTemplate,"{javaPath}",packagePath);
            serviceImplTemplate = StringUtils.replace(serviceImplTemplate,"{moduleCode}",moduleCode);
            serviceImplTemplate = StringUtils.replace(serviceImplTemplate,"{fileNameExt}",fileNameExt);
            serviceImplTemplate = StringUtils.replace(serviceImplTemplate,"{moduleName}",moduleName);
            if(allColumns != null){
                columnsConditionJavaCode = columnsConditionJavaCode(codeColumnList);
            }
            serviceImplTemplate = StringUtils.replace(serviceImplTemplate,"{columnsConditionJavaCode}",columnsConditionJavaCode);
            serviceImplTemplate = StringUtils.replace(serviceImplTemplate,"{lowerModuleCode}",lowerModuleCode);

            FileUtil.createFile(javaPath + "service/impl/" + serviceImplName + ".java", serviceImplTemplate);

            //logger.info(serviceImplTemplate);
            logger.info("------------------------------");

            //serviceTemplate替换
            serviceTemplate = StringUtils.replace(serviceTemplate,"{Sysdate}",(new Date()).toString());
            serviceTemplate = StringUtils.replace(serviceTemplate,"{javaPath}",packagePath);
            serviceTemplate = StringUtils.replace(serviceTemplate,"{serviceName}",serviceName);
            serviceTemplate = StringUtils.replace(serviceTemplate,"{moduleCode}",moduleCode);
            serviceTemplate = StringUtils.replace(serviceTemplate,"{fileNameExt}",fileNameExt);
            serviceTemplate = StringUtils.replace(serviceTemplate,"{moduleName}",moduleName);
            serviceTemplate = StringUtils.replace(serviceTemplate,"{lowerModuleCode}",lowerModuleCode);

            FileUtil.createFile(javaPath + "service/" + serviceName + ".java", serviceTemplate, "UTF-8");
            //logger.info(serviceTemplate);
            logger.info("------------------------------");

            //controllerTemplate替换
            controllerTemplate = StringUtils.replace(controllerTemplate,"{Sysdate}",(new Date()).toString());
            controllerTemplate = StringUtils.replace(controllerTemplate,"{javaPath}",packagePath);
            controllerTemplate = StringUtils.replace(controllerTemplate,"{controllerName}",controllerName);
            controllerTemplate = StringUtils.replace(controllerTemplate,"{serviceName}",serviceName);
            controllerTemplate = StringUtils.replace(controllerTemplate,"{indexPage}",indexPageName);
            controllerTemplate = StringUtils.replace(controllerTemplate,"{editPage}",editPageName);
            controllerTemplate = StringUtils.replace(controllerTemplate,"{moduleCode}",moduleCode);
            controllerTemplate = StringUtils.replace(controllerTemplate,"{fileNameExt}",fileNameExt);
            controllerTemplate = StringUtils.replace(controllerTemplate,"{moduleName}",moduleName);
            controllerTemplate = StringUtils.replace(controllerTemplate,"{lowerModuleCode}",lowerModuleCode);

            FileUtil.createFile(javaPath + "controller/" + controllerName + ".java", controllerTemplate, "UTF-8");
            //logger.info(controllerTemplate);
            logger.info("------------------------------");

            //indexPageTemplate替换
            indexPageTemplate = StringUtils.replace(indexPageTemplate,"{Sysdate}",(new Date()).toString());
            indexPageTemplate = StringUtils.replace(indexPageTemplate,"{moduleCode}",moduleCode);
            indexPageTemplate = StringUtils.replace(indexPageTemplate,"{moduleName}",moduleName);
            if(allColumns != null){
                columnsShowDiv = columnsShowDiv(codeColumnList);
                columnsFormatterComboboxJavaScript = columnsFormatterComboboxJavaScript(codeColumnList);
                searchTypeDiv = searchTypeDiv(codeColumnList);
                searchTypeDivText = searchTypeDivText(codeColumnList);
                searchColumnsList = searchColumnsList(codeColumnList);
                comboboxJavaScript = comboboxJavaScript(codeColumnList,"print_form");
            }
            indexPageTemplate = StringUtils.replace(indexPageTemplate,"{columnsFormatterComboboxJavaScript}",columnsFormatterComboboxJavaScript);
            indexPageTemplate = StringUtils.replace(indexPageTemplate,"{columnsShowDiv}",columnsShowDiv);
            indexPageTemplate = StringUtils.replace(indexPageTemplate,"{searchColumns}","<input id=\"searchbox\" name=\"searchbox\" type=\"text\"  style=\"width: 300px\"/>");
            indexPageTemplate = StringUtils.replace(indexPageTemplate,"{tableKeyColumn}",tableKeyColumn);
            indexPageTemplate = StringUtils.replace(indexPageTemplate,"{searchTypeDiv}",searchTypeDiv);
            indexPageTemplate = StringUtils.replace(indexPageTemplate,"{searchTypeDivText}",searchTypeDivText);
            indexPageTemplate = StringUtils.replace(indexPageTemplate,"{searchColumnsList}",searchColumnsList);
            indexPageTemplate = StringUtils.replace(indexPageTemplate,"{comboboxJavaScript}",comboboxJavaScript);
            indexPageTemplate = StringUtils.replace(indexPageTemplate,"{lowerModuleCode}",lowerModuleCode);

            FileUtil.createFile(webPath + "/" + indexPageName + fileNameExt + ".html", indexPageTemplate, "UTF-8");
            //logger.info(indexPageTemplate);
            logger.info("------------------------------");


            //editPageTemplate替换
            editPageTemplate = StringUtils.replace(editPageTemplate,"{Sysdate}",(new Date()).toString());
            editPageTemplate = StringUtils.replace(editPageTemplate,"{moduleCode}",moduleCode);
            editPageTemplate = StringUtils.replace(editPageTemplate,"{moduleName}",moduleName);
            if(allColumns != null){
                hiddenDiv = hiddenDiv(codeColumnList);
                regionGroup = regionGroup(codeColumnList);
                comboboxJavaScript = comboboxEditJavaScript(codeColumnList, "ff");
            }
            editPageTemplate = StringUtils.replace(editPageTemplate,"{hiddenDiv}",hiddenDiv);
            editPageTemplate = StringUtils.replace(editPageTemplate,"{regionGroup}",regionGroup);
            editPageTemplate = StringUtils.replace(editPageTemplate,"{comboboxJavaScript}",comboboxJavaScript);
            editPageTemplate = StringUtils.replace(editPageTemplate,"{lowerModuleCode}",lowerModuleCode);

            FileUtil.createFile(webPath + "/" + editPageName + fileNameExt + ".html", editPageTemplate, "UTF-8");

            //logger.info(editPageTemplate);
            logger.info("------------------------------");


            //后缀
            result.setMsg("添加成功");
            result.setSuccessful(true);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }

    /**
     * 替换Java后台查询条件
     * @param codeColumnList
     * @return
     */
    public String columnsConditionJavaCode(List<CodeColumn> codeColumnList)
    {
        StringBuffer b = new StringBuffer();
        String upperColumnCode;
        for(CodeColumn column : codeColumnList){
            if(column.getColumnCode() != null&&column.isQuery()){
                upperColumnCode = StringUtil.replaceUnderlineAndfirstToUpper(column.getColumnCode(), "_", "");
                upperColumnCode = StringUtil.firstCharacterToUpper(upperColumnCode);
                if(!StringUtils.equals(column.getType(),"number")) {
                    b.append("               if(StringUtils.isNotBlank({lowerModuleCode}.get").append(upperColumnCode).append("())) {\n").append(
                            "                cri.and").append(upperColumnCode).append("EqualTo({lowerModuleCode}.get").append(upperColumnCode).append("());\n").append(
                            "               }\n\n");
                }
                else{//String
                    b.append("               if({lowerModuleCode}.get").append(upperColumnCode).append("()!=null) {\n").append(
                            "                cri.and").append(upperColumnCode).append("EqualTo({lowerModuleCode}.get").append(upperColumnCode).append("());\n").append(
                            "               }\n\n");
                }
            }
        }
        return b.toString();
    }

    /**
     * 替换表头
     * @param codeColumnList
     * @return
     */
    public String columnsShowDiv(List<CodeColumn> codeColumnList)
    {
        StringBuffer b = new StringBuffer();
        String upperColumnCode,lowerColumnCode;
        for(CodeColumn column : codeColumnList){
            if(column.getColumnCode() != null){
                upperColumnCode = StringUtil.replaceUnderlineAndfirstToUpper(column.getColumnCode(), "_", "");
                upperColumnCode = StringUtil.firstCharacterToUpper(upperColumnCode);
                lowerColumnCode = StringUtil.firstCharacterToLower(upperColumnCode);
                if(!StringUtils.equals(column.getType(),"hidden")) {
                    if(StringUtils.isBlank(column.getList())){
                        b.append("            <th data-options=\"field:'").append(lowerColumnCode).append("',width:").append(column.getCharacterMaximumLength()).append("\">").append(column.getColumnName()).append("</th>\n");
                    }
                    else{
                        b.append("            <th data-options=\"field:'").append(lowerColumnCode).append("',width:").append(column.getCharacterMaximumLength()).append(",formatter:formatter").append(upperColumnCode).append("\">").append(column.getColumnName()).append("</th>\n");
                    }
                }
            }
        }
        return b.toString();
    }


    /**
     * 表头翻译脚本
     * @param codeColumnList
     * @return
     */
    public String columnsFormatterComboboxJavaScript(List<CodeColumn> codeColumnList)
    {
        StringBuffer b = new StringBuffer();
        String upperColumnCode,lowerColumnCode;
        for(CodeColumn column : codeColumnList){
            if(column.getColumnCode() != null&&column.isQuery()){
                upperColumnCode = StringUtil.replaceUnderlineAndfirstToUpper(column.getColumnCode(), "_", "");
                upperColumnCode = StringUtil.firstCharacterToUpper(upperColumnCode);
                lowerColumnCode = StringUtil.firstCharacterToLower(upperColumnCode);
                if(!StringUtils.equals(column.getType(),"hidden")) {
                    if(StringUtils.isNotBlank(column.getList())){
                        b.append("    var ").append(lowerColumnCode).append(";\n").append(
                                "    function get").append(upperColumnCode).append("(){\n" ).append(
                                "        $.post(WEB_GLOBAL_CTX+\"/business/dictionary/getJson/").append(column.getList()).append("\", function (rsp) {\n" ).append(
                                "            ").append(lowerColumnCode).append(" = rsp;\n" ).append(
                                "        }).error(function () {\n" ).append(
                                "        });\n" ).append(
                                "    }\n" ).append(
                                "    $(function () {get").append(upperColumnCode).append("();});\n").append(
                                "    function formatter").append(upperColumnCode).append("(values){\n" ).append(
                                "        var obj = eval((JSON.parse(JSON.stringify((").append(lowerColumnCode).append(")))).data);\n" ).append(
                                "        for (var thisO in obj){\n" ).append(
                                "            if (obj[thisO].dicKey == values) {\n" ).append(
                                "                return obj[thisO].dicValue;\n" ).append(
                                "            }\n" +
                                "        }\n" +
                                "        return values;\n" ).append(
                                "    }\n\n");
                    }
                }
            }
        }
        return b.toString();
    }


    /**
     * 多查询条件组合
     * @param codeColumnList
     * @return
     */
    public String searchTypeDiv(List<CodeColumn> codeColumnList)
    {
        StringBuffer b = new StringBuffer();
        String upperColumnCode,lowerColumnCode;
        for(CodeColumn column : codeColumnList){
            if(column.getColumnCode() != null&&column.isQuery()){
                upperColumnCode = StringUtil.replaceUnderlineAndfirstToUpper(column.getColumnCode(), "_", "");
                upperColumnCode = StringUtil.firstCharacterToUpper(upperColumnCode);
                lowerColumnCode = StringUtil.firstCharacterToLower(upperColumnCode);
                if(!StringUtils.equals(column.getType(),"hidden")&&StringUtils.isBlank(column.getList())) {
                    b.append("    <div name=\"search_").append(lowerColumnCode).append("\">").append(column.getColumnName()).append("</div>\n");
                }
            }
        }
        return b.toString();
    }

    /**
     * 多查询条件入参名称
     * @param codeColumnList
     * @return
     */
    public String searchTypeDivText(List<CodeColumn> codeColumnList)
    {
        StringBuffer b = new StringBuffer();
        String upperColumnCode,lowerColumnCode;
        for(CodeColumn column : codeColumnList){
            if(column.getColumnCode() != null&&column.isQuery()){
                upperColumnCode = StringUtil.replaceUnderlineAndfirstToUpper(column.getColumnCode(), "_", "");
                upperColumnCode = StringUtil.firstCharacterToUpper(upperColumnCode);
                lowerColumnCode = StringUtil.firstCharacterToLower(upperColumnCode);
                if(!StringUtils.equals(column.getType(),"hidden")&&StringUtils.isNotBlank(column.getList())) {
                    b.append("                var ").append(lowerColumnCode).append(" = $(\"#").append(lowerColumnCode).append("\").combobox(\"getValue\");\n");
                    b.append("                if(!(").append(lowerColumnCode).append("==null||").append(lowerColumnCode).append(".length==0)){\n" ).append(
                            "                   str1+=\",\"+\"\\\"search_").append(lowerColumnCode).append("\\\":\\\"\" + ").append(lowerColumnCode).append(" + \"\\\"\";\n" ).append(
                            "                }\n");
                }
            }
        }
        return b.toString();
    }

    /**
     * 下拉查询条件html代码
     * @param codeColumnList
     * @return
     */
    public String searchColumnsList(List<CodeColumn> codeColumnList)
    {
        StringBuffer b = new StringBuffer();
        String upperColumnCode,lowerColumnCode;
        for(CodeColumn column : codeColumnList){
            if(column.getColumnCode() != null&&column.isQuery()){
                upperColumnCode = StringUtil.replaceUnderlineAndfirstToUpper(column.getColumnCode(), "_", "");
                upperColumnCode = StringUtil.firstCharacterToUpper(upperColumnCode);
                lowerColumnCode = StringUtil.firstCharacterToLower(upperColumnCode);
                if(!StringUtils.equals(column.getType(),"hidden")&&StringUtils.isNotBlank(column.getList())) {
                    b.append("    <input  name=\"").append(lowerColumnCode).append("\" id=\"").append(lowerColumnCode).append("\" /> \n");
                }
            }
        }
        return b.toString();
    }

    /**
     * 隐藏html代码
     * @param codeColumnList
     * @return
     */
    public String hiddenDiv(List<CodeColumn> codeColumnList)
    {
        StringBuffer b = new StringBuffer();
        String upperColumnCode,lowerColumnCode;
        for(CodeColumn column : codeColumnList){
            if(column.getColumnCode() != null){
                upperColumnCode = StringUtil.replaceUnderlineAndfirstToUpper(column.getColumnCode(), "_", "");
                upperColumnCode = StringUtil.firstCharacterToUpper(upperColumnCode);
                lowerColumnCode = StringUtil.firstCharacterToLower(upperColumnCode);
                if(StringUtils.equals(column.getType(),"hidden")) {
                    b.append("          <input type=\"hidden\" name=\"").append(lowerColumnCode).append("\" id=\"").append(lowerColumnCode).append("\" /> \n");
                }
            }
        }
        return b.toString();
    }

    /**
     * 编辑字段html代码
     * @param codeColumnList
     * @return
     */
    public String regionGroup(List<CodeColumn> codeColumnList)
    {
        StringBuffer b = new StringBuffer();
        String upperColumnCode,lowerColumnCode;
        for(CodeColumn column : codeColumnList){
            if(column.getColumnCode() != null){
                upperColumnCode = StringUtil.replaceUnderlineAndfirstToUpper(column.getColumnCode(), "_", "");
                upperColumnCode = StringUtil.firstCharacterToUpper(upperColumnCode);
                lowerColumnCode = StringUtil.firstCharacterToLower(upperColumnCode);
                if(!StringUtils.equals(column.getType(),"hidden")) {
                    b.append("          <tr>\n                <td >").append(column.getColumnName()).append(":</td>\n                <td>\n");
                     b.append(columnString(lowerColumnCode, column)).append("\n");
                    b.append("                </td> \n");
                    b.append("          </tr> \n");
                }
            }
        }
        return b.toString();
    }

    /**
     * 格式化展示的列
     * @param lowerColumnCode
     * @param column
     * @return
     */
    public String columnString(String lowerColumnCode,CodeColumn column)
    {
        //<input class="easyui-textbox input-long" name="custAddr" id="custAddr" data-options=""/>
        String cd = "                   <input class=\"{easyui-textbox} {input-long}\" name=\""+lowerColumnCode+"\" id=\""+lowerColumnCode+"\" data-options=\"{data-options}\" {bigStyle}/>";
        if(StringUtils.equals(column.getType(),"date"))
        {
            cd = StringUtils.replace(cd,"{easyui-textbox}","easyui-datebox");
        }
        else if(StringUtils.equals(column.getType(),"time"))
        {
            cd = StringUtils.replace(cd,"{easyui-textbox}","easyui-datetimebox");
        }
        else if(StringUtils.equals(column.getType(),"longText"))
        {
            cd = StringUtils.replace(cd,"{input-long}","input-long");
        }
        else if(StringUtils.equals(column.getType(),"bigText"))
        {
            cd = StringUtils.replace(cd,"{bigStyle}","style=\"height:60px;width: 150px\"");
        }
        else
        {
        }
        cd = StringUtils.replace(cd,"{input-long}","");
        cd = StringUtils.replace(cd,"{bigStyle}","");
        cd = StringUtils.replace(cd,"{easyui-textbox}","easyui-textbox");
        cd = StringUtils.replace(cd," \" name","\" name");
        cd = StringUtils.replace(cd,"{data-options}",dataOptions(column));
        return cd;
    }

    /**
     * 验证
     * @param column
     * @return
     */
    public String dataOptions(CodeColumn column)
    {
        //required:true,validType: ['length[6,20]','number','between_int[1,2]']
        StringBuffer data_option = new StringBuffer();
        data_option.append("required:").append(column.isEssential());
        if(StringUtils.equals(column.getType(),"bigText"))
        {
            data_option.append(",multiline:true");
        }
        data_option.append(",validType:[");
        if(StringUtils.equals(column.getType(),"number")&&StringUtils.isBlank(column.getList()))
        {
            data_option.append(",'number'");
        }
        if(StringUtils.equals(column.getType(),"date"))
        {
            data_option.append(",'date'");
        }
        if(StringUtils.equals(column.getType(),"time"))
        {
            data_option.append(",'time'");
        }
        if(column.getMaxLength()!=0)
        {
            data_option.append(",'length[").append(column.getMinLength()).append(",").append(column.getMaxLength()).append("]'");
        }
        if(column.getMaxValue()!=0)
        {
            data_option.append(",'between_int[").append(column.getMinValue()).append(",").append(column.getMaxValue()).append("]'");
        }
        data_option.append("]");
        return StringUtils.replace(data_option.toString(),"[,","[");
    }

    /**
     * 下拉查询条件javascript代码
     * @param codeColumnList
     * @return
     */
    public String comboboxJavaScript(List<CodeColumn> codeColumnList,String formName)
    {
        StringBuffer b = new StringBuffer();
        String upperColumnCode,lowerColumnCode;
        for(CodeColumn column : codeColumnList){
            if(column.getColumnCode() != null&&column.isQuery()){
                upperColumnCode = StringUtil.replaceUnderlineAndfirstToUpper(column.getColumnCode(), "_", "");
                upperColumnCode = StringUtil.firstCharacterToUpper(upperColumnCode);
                lowerColumnCode = StringUtil.firstCharacterToLower(upperColumnCode);
                if(!StringUtils.equals(column.getType(),"hidden")&&StringUtils.isNotBlank(column.getList())) {
                    b.append("    $('#").append(formName).append(" #").append(lowerColumnCode).append("').combobox({\n" +
                            "        url:'${base}/business/dictionary/getList/").append(column.getList()).append("',\n" +
                            "        valueField:'dicKey',textField:'dicValue',editable:false,panelHeight:'auto',width:60\n" +
                            "    }); \n");
                }
            }
        }
        return b.toString();
    }

    /**
     * 下拉javascript代码
     * @param codeColumnList
     * @return
     */
    public String comboboxEditJavaScript(List<CodeColumn> codeColumnList,String formName)
    {
        StringBuffer b = new StringBuffer();
        String upperColumnCode,lowerColumnCode;
        for(CodeColumn column : codeColumnList){
            if(column.getColumnCode() != null){
                upperColumnCode = StringUtil.replaceUnderlineAndfirstToUpper(column.getColumnCode(), "_", "");
                upperColumnCode = StringUtil.firstCharacterToUpper(upperColumnCode);
                lowerColumnCode = StringUtil.firstCharacterToLower(upperColumnCode);
                if(!StringUtils.equals(column.getType(),"hidden")&&StringUtils.isNotBlank(column.getList())) {
                    b.append("$('#").append(formName).append(" #").append(lowerColumnCode).append("').combobox({\n" +
                            "           url:'${base}/business/dictionary/getList/").append(column.getList()).append("',\n" +
                            "           valueField:'dicKey',textField:'dicValue',editable:false,panelHeight:'auto'\n" +
                            "        }); \n");
                }
            }
        }
        return b.toString();
    }

    /**
     * 下拉javascript代码
     * @param codeColumnList
     * @return
     */
    public String findKeyColumn(List<CodeColumn> codeColumnList)
    {
        String upperColumnCode,lowerColumnCode;
        for(CodeColumn column : codeColumnList){
            if(column.getColumnCode() != null){
                upperColumnCode = StringUtil.replaceUnderlineAndfirstToUpper(column.getColumnCode(), "_", "");
                upperColumnCode = StringUtil.firstCharacterToUpper(upperColumnCode);
                lowerColumnCode = StringUtil.firstCharacterToLower(upperColumnCode);
                if(column.isKey())
                {
                    return lowerColumnCode;
                }
            }
        }
        return "id";
    }

}
