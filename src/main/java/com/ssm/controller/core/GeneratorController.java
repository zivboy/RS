package com.ssm.controller.core;

import com.alibaba.fastjson.JSON;
import com.ssm.business.entity.Dictionary;
import com.ssm.business.service.DictionaryService;
import com.ssm.common.baseaction.BaseAction;
import com.ssm.common.mybatis.Page;
import com.ssm.common.util.FileUtil;
import com.ssm.common.util.Result;
import com.ssm.common.util.StringUtil;
import com.ssm.entity.*;
import com.ssm.service.core.ColumnsService;
import com.ssm.service.core.ModuleService;
import com.ssm.service.core.TablesService;
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
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 代码生成
 * Created by vincent on 2014/10/13.
 */
@Controller
@RequestMapping("/generator")
@SuppressWarnings("unchecked")
public class GeneratorController extends BaseAction {
    protected Logger logger = LoggerFactory.getLogger(getClass());

    private static final String T_LIST = "generator/list";
    private static final String T_EDIT = "generator/edit";
    @Autowired
    private ColumnsService columnsService;
    @Autowired
    private TablesService tablesService;

    @Autowired
    private ModuleService moduleService;

    @Autowired
    private DictionaryService dictionaryService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ModelAndView tablesList() {
        ModelAndView modelAndView = new ModelAndView(T_LIST);
        return modelAndView;
    }

    /**
     * 所有的列和表名
     *
     * @param tableName
     * @return
     */
    @RequestMapping(value = "/tablesEdit/{tableName}/{schema}", method = RequestMethod.GET)
    public ModelAndView tablesEdit(@PathVariable String tableName,@PathVariable String schema) {
        ModelAndView modelAndView = new ModelAndView(T_EDIT);
        Tables tables = new Tables();
        tables.setTableName(tableName);
        tables.setTableSchema(schema);
        List<Tables> list = tablesService.selectByExample(page(), tables);
        for (Tables tables1 : list) {
            modelAndView.addObject("tableName", StringUtils.lowerCase(tableName));
            modelAndView.addObject("schema", StringUtils.lowerCase(schema));
            modelAndView.addObject("tableComment", StringUtils.lowerCase(tables1.getTableComment()));
        }
        return modelAndView;
    }


    /**
     * 表列表
     *
     * @return
     */
    @RequestMapping(value = "/tablesDataList")
    @ResponseBody
    public GridModel tablesDataList() {
        Tables tables = SearchForm(Tables.class);
        Page info = tablesService.findByPage(page(), tables);
        GridModel m = new GridModel();
        m.setRows(info.getRows());
        m.setTotal(info.getCount());
        return m;
    }


    /**
     * 字段列表
     *
     * @param tableName
     * @return
     */
    @RequestMapping(value = "/columnsDataList/{tableName}/{schema}")
    @ResponseBody
    public GridModel columnsDataList(@PathVariable String tableName,@PathVariable String schema) {
        Columns columns = SearchForm(Columns.class);
        columns.setTableName(tableName);
        columns.setTableSchema(schema);
        Page info = columnsService.findByPage(page(), columns);
        GridModel m = new GridModel();
        List<CodeColumn> CodeColumn = new ArrayList<>();
        List<Columns> columnsList = info.getRows();
        int i = 0;
        for (Columns columns1 : columnsList) {
            i += 1;
            CodeColumn column = new CodeColumn();
            column.setNumber(i - 1);
            column.setKey(StringUtils.equals(columns1.getColumnKey(), "PRI") ? true : false);
            column.setColumnCode(columns1.getColumnName());
            column.setColumnName(columns1.getColumnComment() != null ? columns1.getColumnComment() : column.getColumnCode());


            if (StringUtils.indexOf(columns1.getDataType(), "int") > -1) {
                column.setType("number");
                column.setValidate("numeric");
            } else if (StringUtils.indexOf(columns1.getDataType(), "date") == 0) {
                column.setType("date");
                column.setValidate("date");
            } else if (StringUtils.indexOf(columns1.getDataType(), "time") > -1) {
                column.setType("time");
            } else if (StringUtils.indexOf(columns1.getDataType(), "varchar") > -1 && columns1.getCharacterMaximumLength() <= 20) {
                column.setType("text");
            } else if (StringUtils.indexOf(columns1.getDataType(), "varchar") > -1 && columns1.getCharacterMaximumLength() > 20 && columns1.getCharacterMaximumLength() <= 100) {
                column.setType("longText");
            } else if (StringUtils.indexOf(columns1.getDataType(), "varchar") > -1 && columns1.getCharacterMaximumLength() > 100) {
                column.setType("bigText");
            } else {
                column.setType("text");
            }
            if (column.isKey())
                column.setType("hidden");

            column.setList("");
            column.setGroupId(i <= 6 ? 1 : (i > 12 ? 2 : 3));
            column.setEssential(StringUtils.equals(columns1.getIsNullable(), "YES") ? false : true);

            column.setQuery(false);
            if (StringUtils.equals(column.getType(), "number") && column.isEssential()) {
                column.setMinLength(1);
                column.setMaxLength(columns1.getCharacterMaximumLength() != null ? Integer.parseInt(columns1.getCharacterMaximumLength().toString()) : 0);
            } else if ((StringUtils.equals(column.getType(), "text") || StringUtils.equals(column.getType(), "longText") || StringUtils.equals(column.getType(), "bigText")) && column.isEssential()) {
                column.setMinLength(2);
                column.setMaxLength(Integer.parseInt(columns1.getCharacterMaximumLength().toString()));
            } else {
                column.setMinLength(0);
                column.setMaxLength(0);
            }
            column.setMinValue(0);
            column.setMaxValue(0);


            column.setIsNullable(columns1.getIsNullable());
            column.setCharacterMaximumLength(columns1.getCharacterMaximumLength() != null ? columns1.getCharacterMaximumLength() : 20);
            column.setDataType(columns1.getDataType());

            CodeColumn.add(column);
        }
        m.setRows(CodeColumn);
        m.setTotal(info.getCount());
        return m;
    }


    /**
     * 数据库
     *
     * @return
     */
    @RequestMapping(value = "/dataBase")
    @ResponseBody
    public List<DataBase> dataBase() {
        List<DataBase> list = tablesService.dataBaseGenerator();
        return list;
    }

    @RequestMapping(value = "/saveTableList/{override}")
    @ResponseBody
    @Transactional
    public Result saveTableList(HttpServletRequest req, @PathVariable String override) {
        //设置请求编码
        try {
            req.setCharacterEncoding("UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        //获取编辑数据 这里获取到的是json字符串
        String allColumns = req.getParameter("allColumns"), tableKeyColumn;
        String codeTableJson = req.getParameter("codeTable");

        Result result = new Result();


        //创建基础目录
        try {

            CodeTable codeTable = JSON.parseObject(codeTableJson, CodeTable.class);
            codeTable.setLowerModuleCode(StringUtil.firstCharacterToLower(codeTable.getModuleCode()));
            List<CodeColumn> codeColumnList = JSON.parseArray(allColumns, CodeColumn.class);
            tableKeyColumn = findKeyColumn(codeColumnList);

            //目录信息
            String basePath = this.getClass().getResource("/").toString().replaceAll("file:", "").replaceFirst("/", ""), fileNameExt = "New", rootPath = "";
            basePath = URLDecoder.decode(basePath, "utf-8");
            File f = new File(basePath);
            rootPath = f.getParentFile().getParentFile().getParentFile().getParentFile().getPath() + File.separator;


            if (StringUtils.equals(override, "true")) {
                fileNameExt = "";
            }
            String templatePath = "mybatisG/template/",
                    packagePath = codeTable.getModuleCodeUrl(),
                    servicePath = rootPath.replace("client", "api") + "src/main/java/" + StringUtils.replace(packagePath, ".", File.separator) + "/",
                    serviceImplPath = rootPath.replace("client", "service") + "src/main/java/" + StringUtils.replace(packagePath, ".", File.separator) + "/",
                    javaPath = rootPath + "src/main/java/" + StringUtils.replace(packagePath, ".", File.separator) + "/",
                    webPath = FileUtil.createFolders(rootPath + "src/main/webapp/WEB-INF/views/business/", codeTable.getLowerModuleCode().replaceAll("\\.", "|")),
                    javaScriptPath = FileUtil.createFolders(rootPath + "src/main/webapp/styles/js/module/business/", codeTable.getLowerModuleCode().replaceAll("\\.", "|")),

                    //主文件信息
                    lowerModuleCode = codeTable.getLowerModuleCode(),
                    moduleCode = codeTable.getModuleCode(),
                    moduleName = codeTable.getModuleName(),

                    //service
                    serviceImplName = codeTable.getModuleCode() + "ServiceImpl" + fileNameExt,
                    serviceImplTemplate = FileUtil.readTxt(basePath + templatePath + "ServiceImpl.txt", "UTF-8"),

                    serviceName = codeTable.getModuleCode() + "Service" + fileNameExt,
                    serviceLowerName = codeTable.getModuleCode().toLowerCase() + "Service" + fileNameExt,
                    serviceTemplate = FileUtil.readTxt(basePath + templatePath + "Service.txt", "UTF-8"),

                    //controller
                    controllerName = codeTable.getModuleCode() + "Controller" + fileNameExt,
                    controllerTemplate = FileUtil.readTxt(basePath + templatePath + "Controller.txt", "UTF-8"),

                    //web页面
                    indexPageName = codeTable.getIndexPageName(),
                    indexPageTemplate = FileUtil.readTxt(basePath + templatePath + "list.txt", "UTF-8"),
                    editPageName = codeTable.getEditPageName(),
                    editPageTemplate = FileUtil.readTxt(basePath + templatePath + "edit.txt", "UTF-8"),

                    //js页面
                    indexPageJSTemplate = FileUtil.readTxt(basePath + templatePath + "list.js.txt", "UTF-8"),
                    editPageJSTemplate = FileUtil.readTxt(basePath + templatePath + "edit.js.txt", "UTF-8"),

                    //替换string
                    // 查询条件列========
                    searchTypeDiv = "",//字符查询组合div========

                    searchColumnsList = "",//查询条件列下拉---
                    comboboxJavaScript = "",//下拉脚本---

                    columnsShowDiv = "",//表头
                    columnsFormatterComboboxJavaScript = "",//下拉脚本

                    //编辑页面
                    hiddenDiv = "", //隐藏
                    regionGroup = "", //块

                    columnsConditionJavaCode = "";

            //serviceImplTemplate替换
            serviceImplTemplate = StringUtils.replace(serviceImplTemplate, "{Sysdate}", (new Date()).toString());
            serviceImplTemplate = StringUtils.replace(serviceImplTemplate, "{serviceName}", serviceName);
            serviceImplTemplate = StringUtils.replace(serviceImplTemplate, "{serviceLowerName}", serviceLowerName);
            serviceImplTemplate = StringUtils.replace(serviceImplTemplate, "{serviceImplName}", serviceImplName);
            serviceImplTemplate = StringUtils.replace(serviceImplTemplate, "{javaPath}", packagePath);
            serviceImplTemplate = StringUtils.replace(serviceImplTemplate, "{moduleCode}", moduleCode);
            serviceImplTemplate = StringUtils.replace(serviceImplTemplate, "{fileNameExt}", fileNameExt);
            serviceImplTemplate = StringUtils.replace(serviceImplTemplate, "{moduleName}", moduleName);
            if (allColumns != null) {
                columnsConditionJavaCode = columnsConditionJavaCode(codeColumnList);
            }
            serviceImplTemplate = StringUtils.replace(serviceImplTemplate, "{columnsConditionJavaCode}", columnsConditionJavaCode);
            serviceImplTemplate = StringUtils.replace(serviceImplTemplate, "{lowerModuleCode}", lowerModuleCode);

            FileUtil.createFile(serviceImplPath + "service/impl/" + serviceImplName + ".java", serviceImplTemplate);

            //logger.info(serviceImplTemplate);
            logger.info("---------------service--impl---------------");

            //serviceTemplate替换
            serviceTemplate = StringUtils.replace(serviceTemplate, "{Sysdate}", (new Date()).toString());
            serviceTemplate = StringUtils.replace(serviceTemplate, "{javaPath}", packagePath);
            serviceTemplate = StringUtils.replace(serviceTemplate, "{serviceName}", serviceName);
            serviceTemplate = StringUtils.replace(serviceTemplate, "{moduleCode}", moduleCode);
            serviceTemplate = StringUtils.replace(serviceTemplate, "{fileNameExt}", fileNameExt);
            serviceTemplate = StringUtils.replace(serviceTemplate, "{moduleName}", moduleName);
            serviceTemplate = StringUtils.replace(serviceTemplate, "{lowerModuleCode}", lowerModuleCode);

            FileUtil.createFile(servicePath + "service/" + serviceName + ".java", serviceTemplate, "UTF-8");
            //logger.info(serviceTemplate);
            logger.info("---------------service---------------");

            //controllerTemplate替换
            controllerTemplate = StringUtils.replace(controllerTemplate, "{Sysdate}", (new Date()).toString());
            controllerTemplate = StringUtils.replace(controllerTemplate, "{javaPath}", packagePath);
            controllerTemplate = StringUtils.replace(controllerTemplate, "{controllerName}", controllerName);
            controllerTemplate = StringUtils.replace(controllerTemplate, "{serviceName}", serviceName);
            controllerTemplate = StringUtils.replace(controllerTemplate, "{indexPage}", indexPageName);
            controllerTemplate = StringUtils.replace(controllerTemplate, "{editPage}", editPageName);
            controllerTemplate = StringUtils.replace(controllerTemplate, "{moduleCode}", moduleCode);
            controllerTemplate = StringUtils.replace(controllerTemplate, "{fileNameExt}", fileNameExt);
            controllerTemplate = StringUtils.replace(controllerTemplate, "{moduleName}", moduleName);
            //FIXME
            controllerTemplate = StringUtils.replace(controllerTemplate, "{tableKeyColumn}", StringUtil.firstCharacterToUpper(tableKeyColumn));
            controllerTemplate = StringUtils.replace(controllerTemplate, "{lowerModuleCode}", lowerModuleCode);

            FileUtil.createFile(javaPath + "controller/" + controllerName + ".java", controllerTemplate, "UTF-8");
            //logger.info(controllerTemplate);
            logger.info("----------------controller--------------");

            //indexPageTemplate替换
            indexPageTemplate = StringUtils.replace(indexPageTemplate, "{Sysdate}", (new Date()).toString());
            indexPageTemplate = StringUtils.replace(indexPageTemplate, "{moduleCode}", moduleCode);
            indexPageTemplate = StringUtils.replace(indexPageTemplate, "{moduleName}", moduleName);
            if (allColumns != null) {
                columnsShowDiv = columnsShowDiv(codeColumnList);
                columnsFormatterComboboxJavaScript = columnsFormatterComboboxJavaScript(codeColumnList);
                searchTypeDiv = searchTypeDiv(codeColumnList);
                comboboxJavaScript = comboboxJavaScript(codeColumnList, "print_form");
            }
            indexPageTemplate = StringUtils.replace(indexPageTemplate, "{columnsFormatterComboboxJavaScript}", columnsFormatterComboboxJavaScript);
            indexPageTemplate = StringUtils.replace(indexPageTemplate, "{columnsShowDiv}", columnsShowDiv);
            indexPageTemplate = StringUtils.replace(indexPageTemplate, "{tableKeyColumn}", tableKeyColumn);
            indexPageTemplate = StringUtils.replace(indexPageTemplate, "{searchTypeDiv}", searchTypeDiv);
            indexPageTemplate = StringUtils.replace(indexPageTemplate, "{comboboxJavaScript}", comboboxJavaScript);
            indexPageTemplate = StringUtils.replace(indexPageTemplate, "{lowerModuleCode}", lowerModuleCode);

            FileUtil.createFile(webPath + "/" + indexPageName + fileNameExt + ".html", indexPageTemplate, "UTF-8");
            //logger.info(indexPageTemplate);
            logger.info("----------------list html--------------");


            //editPageTemplate替换
            editPageTemplate = StringUtils.replace(editPageTemplate, "{Sysdate}", (new Date()).toString());
            editPageTemplate = StringUtils.replace(editPageTemplate, "{moduleCode}", moduleCode);
            editPageTemplate = StringUtils.replace(editPageTemplate, "{moduleName}", moduleName);
            if (allColumns != null) {
                hiddenDiv = hiddenDiv(codeColumnList);
                regionGroup = regionGroup(codeColumnList);
                comboboxJavaScript = comboboxEditJavaScript(codeColumnList, lowerModuleCode);
            }
            editPageTemplate = StringUtils.replace(editPageTemplate, "{hiddenDiv}", hiddenDiv);
            editPageTemplate = StringUtils.replace(editPageTemplate, "{regionGroup}", regionGroup);
            editPageTemplate = StringUtils.replace(editPageTemplate, "{lowerModuleCode}", lowerModuleCode);

            FileUtil.createFile(webPath + "/" + editPageName + fileNameExt + ".html", editPageTemplate, "UTF-8");

            //logger.info(editPageTemplate);
            logger.info("-----------------edit html-------------");

            //indexPageJSTemplate替换
            indexPageJSTemplate = StringUtils.replace(indexPageJSTemplate, "{Sysdate}", (new Date()).toString());
            indexPageJSTemplate = StringUtils.replace(indexPageJSTemplate, "{moduleCode}", moduleCode);
            indexPageJSTemplate = StringUtils.replace(indexPageJSTemplate, "{moduleName}", moduleName);
            indexPageJSTemplate = StringUtils.replace(indexPageJSTemplate, "{lowerModuleCode}", lowerModuleCode);
            indexPageJSTemplate = StringUtils.replace(indexPageJSTemplate, "{tableKeyColumn}", StringUtil.firstCharacterToLower(tableKeyColumn));
            FileUtil.createFile(javaScriptPath + "/list.js", indexPageJSTemplate, "UTF-8");
            logger.info("---------------list js---------------");

            //editPageJSTemplate替换
            if (allColumns != null) {
                comboboxJavaScript = comboboxEditJavaScript(codeColumnList, lowerModuleCode);
            }
            editPageJSTemplate = StringUtils.replace(editPageJSTemplate, "{Sysdate}", (new Date()).toString());
            editPageJSTemplate = StringUtils.replace(editPageJSTemplate, "{moduleCode}", moduleCode);
            editPageJSTemplate = StringUtils.replace(editPageJSTemplate, "{moduleName}", moduleName);
            editPageJSTemplate = StringUtils.replace(editPageJSTemplate, "{comboboxJavaScript}", comboboxJavaScript);
            editPageJSTemplate = StringUtils.replace(editPageJSTemplate, "{lowerModuleCode}", lowerModuleCode);
            FileUtil.createFile(javaScriptPath + "/edit.js", editPageJSTemplate, "UTF-8");
            logger.info("---------------edit js---------------");

            Module module = new Module();
            module.setName(moduleName);
            module.setParentId(Long.valueOf(codeTable.getParentId()));
            module.setClassName(codeTable.getClassName());
            module.setPriority(99);
            module.setUrl("/business/"+lowerModuleCode+"/index");
            module.setDescription(moduleName);
            module.setSn(moduleCode);
            moduleService.save(module);

            //后缀
            result.setMsg("生成成功");
            result.setSuccessful(true);
        } catch (IOException e) {
            result.setMsg("生成失败，见日志");
            result.setSuccessful(false);
            e.printStackTrace();
        }

        return result;
    }

    /**
     * 替换Java后台查询条件
     *
     * @param codeColumnList
     * @return
     */
    public String columnsConditionJavaCode(List<CodeColumn> codeColumnList) {
        StringBuffer b = new StringBuffer();
        String upperColumnCode;
        for (CodeColumn column : codeColumnList) {
            if (column.getColumnCode() != null && column.isQuery()) {
                upperColumnCode = StringUtil.replaceUnderlineAndfirstToUpper(column.getColumnCode(), "_", "");
                upperColumnCode = StringUtil.firstCharacterToUpper(upperColumnCode);
                if (!StringUtils.equals(column.getType(), "number")) {
                    b.append("               if(StringUtils.isNotBlank({lowerModuleCode}.get").append(upperColumnCode).append("())) {\n").append(
                            "                cri.and").append(upperColumnCode).append("EqualTo({lowerModuleCode}.get").append(upperColumnCode).append("());\n").append(
                            "               }\n\n");
                } else {//String
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
     *
     * @param codeColumnList
     * @return
     */
    public String columnsShowDiv(List<CodeColumn> codeColumnList) {
        StringBuffer b = new StringBuffer();
        String upperColumnCode, lowerColumnCode;
        b.append("<th data-field=\"state\" data-radio=\"true\"></th>\n");
        for (CodeColumn column : codeColumnList) {
            if (column.getColumnCode() != null) {
                upperColumnCode = StringUtil.replaceUnderlineAndfirstToUpper(column.getColumnCode(), "_", "");
                upperColumnCode = StringUtil.firstCharacterToUpper(upperColumnCode);
                lowerColumnCode = StringUtil.firstCharacterToLower(upperColumnCode);
                if (!StringUtils.equals(column.getType(), "hidden")) {
                    if (StringUtils.isBlank(column.getList())) {
                        b.append("                    <th data-field=\"").append(lowerColumnCode).append("\" class=\"col-md-").append(column.getCharacterMaximumLength()/10).append("\">").append(column.getColumnName()).append("</th>\n");
                    } else {
                        b.append("                    <th data-field=\"").append(lowerColumnCode).append("\" class=\"col-md-").append(column.getCharacterMaximumLength()).append("\" data-formatter=\"").append(upperColumnCode).append("\">").append(column.getColumnName()).append("建议在service中转换</th>\n");
                    }
                }
            }
        }
        return b.toString();
    }


    /**
     * 表头翻译脚本
     *
     * @param codeColumnList
     * @return
     */
    public String columnsFormatterComboboxJavaScript(List<CodeColumn> codeColumnList) {
        StringBuffer b = new StringBuffer();
        String upperColumnCode, lowerColumnCode;
        for (CodeColumn column : codeColumnList) {
            if (column.getColumnCode() != null && column.isQuery()) {
                upperColumnCode = StringUtil.replaceUnderlineAndfirstToUpper(column.getColumnCode(), "_", "");
                upperColumnCode = StringUtil.firstCharacterToUpper(upperColumnCode);
                lowerColumnCode = StringUtil.firstCharacterToLower(upperColumnCode);
                if (!StringUtils.equals(column.getType(), "hidden")) {
                    if (StringUtils.isNotBlank(column.getList())) {
                        b.append("    var ").append(lowerColumnCode).append(";\n").append(
                                "    function get").append(upperColumnCode).append("(){\n").append(
                                "        $.post(WEB_GLOBAL_CTX+\"/business/dictionary/getJson/").append(column.getList()).append("\", function (rsp) {\n").append(
                                "            ").append(lowerColumnCode).append(" = rsp;\n").append(
                                "        }).error(function () {\n").append(
                                "        });\n").append(
                                "    }\n").append(
                                "    $(function () {get").append(upperColumnCode).append("();});\n").append(
                                "    function formatter").append(upperColumnCode).append("(values){\n").append(
                                "        var obj = eval((JSON.parse(JSON.stringify((").append(lowerColumnCode).append(")))).data);\n").append(
                                "        for (var thisO in obj){\n").append(
                                "            if (obj[thisO].dicKey == values) {\n").append(
                                "                return obj[thisO].dicValue;\n").append(
                                "            }\n" +
                                        "        }\n" +
                                        "        return values;\n").append(
                                "    }\n\n");
                    }
                }
            }
        }
        return b.toString();
    }


    /**
     * 多查询条件组合
     *
     * @param codeColumnList
     * @return
     */
    public String searchTypeDiv(List<CodeColumn> codeColumnList) {
        StringBuffer b = new StringBuffer();
        String upperColumnCode, lowerColumnCode;
        for (CodeColumn column : codeColumnList) {
            if (column.getColumnCode() != null && column.isQuery()) {
                upperColumnCode = StringUtil.replaceUnderlineAndfirstToUpper(column.getColumnCode(), "_", "");
                upperColumnCode = StringUtil.firstCharacterToUpper(upperColumnCode);
                lowerColumnCode = StringUtil.firstCharacterToLower(upperColumnCode);
                //if(!StringUtils.equals(column.getType(),"hidden")&&StringUtils.isBlank(column.getList())) {
                b.append("    <option value=\"search_").append(lowerColumnCode).append("\">").append(column.getColumnName()).append("</option>\n");
                //}
            }
        }
        return b.toString();
    }


    /**
     * 隐藏html代码
     *
     * @param codeColumnList
     * @return
     */
    public String hiddenDiv(List<CodeColumn> codeColumnList) {
        StringBuffer b = new StringBuffer();
        String upperColumnCode, lowerColumnCode;
        for (CodeColumn column : codeColumnList) {
            if (column.getColumnCode() != null) {
                upperColumnCode = StringUtil.replaceUnderlineAndfirstToUpper(column.getColumnCode(), "_", "");
                upperColumnCode = StringUtil.firstCharacterToUpper(upperColumnCode);
                lowerColumnCode = StringUtil.firstCharacterToLower(upperColumnCode);
                if (StringUtils.equals(column.getType(), "hidden")) {
                    b.append("          <input type=\"hidden\" name=\"").append(lowerColumnCode).append("\" id=\"").append(lowerColumnCode).append("\" /> \n");
                }
            }
        }
        return b.toString();
    }

    /**
     * 编辑字段html代码
     *
     * @param codeColumnList
     * @return
     */
    public String regionGroup(List<CodeColumn> codeColumnList) {
        StringBuffer b = new StringBuffer();
        String upperColumnCode, lowerColumnCode;
        for (CodeColumn column : codeColumnList) {
            if (column.getColumnCode() != null) {
                upperColumnCode = StringUtil.replaceUnderlineAndfirstToUpper(column.getColumnCode(), "_", "");
                upperColumnCode = StringUtil.firstCharacterToUpper(upperColumnCode);
                lowerColumnCode = StringUtil.firstCharacterToLower(upperColumnCode);
                if (!StringUtils.equals(column.getType(), "hidden")) {
                    b.append("          <div class=\"row control-group\">\n                <div class=\"col-sm-2 col-sm-offset-1\"><label class=\"control-label\" for=\"").append(lowerColumnCode).append("\">").append(column.getColumnName()).append("</label>\n                </div>\n                    <div class=\"col-sm-8 controls\">\n");
                    if (column.getType().indexOf("combo") == -1) {
                        b.append(columnString(lowerColumnCode, column)).append("\n");
                    } else {
                        b.append(columnStringCombo(lowerColumnCode, column)).append("\n");
                    }
                    b.append("                </div> \n");
                    b.append("          </div> \n");
                }
            }
        }
        return b.toString();
    }

    /**
     * 格式化展示的列
     *
     * @param lowerColumnCode
     * @param column
     * @return
     */
    public String columnString(String lowerColumnCode, CodeColumn column) {
        String cd = "                   <input type=\"{type}\" class=\"form-control\"  id=\"" + lowerColumnCode + "\" name=\"" + lowerColumnCode + "\" maxlength=\"50\" placeholder=\"输入" + column.getColumnName() + "\" size=\"100\" required   />";
        //TODO
        if (StringUtils.equals(column.getType(), "date")) {
            cd = StringUtils.replace(cd, "{type}", "date");
        } else if (StringUtils.contains(column.getType(), "time")) {
            cd = StringUtils.replace(cd, "{type}", "time ");
        } else if (StringUtils.contains(column.getType(), "year")) {
            cd = StringUtils.replace(cd, "{type}", "month ");
        } else if (StringUtils.contains(column.getType(), "int")) {
            cd = StringUtils.replace(cd, "{type}", "number ");
        } else if (StringUtils.contains(column.getType(), "decimal")) {
            cd = StringUtils.replace(cd, "{type}", "number ");
        } else if (StringUtils.contains(column.getType(), "double")) {
            cd = StringUtils.replace(cd, "{type}", "number ");
        } else if (StringUtils.contains(column.getType(), "numeric")) {
            cd = StringUtils.replace(cd, "{type}", "number ");
        } else if (StringUtils.contains(column.getType(), "float")) {
            cd = StringUtils.replace(cd, "{type}", "number ");
        } else if (StringUtils.contains(column.getType(), "email")) {
            cd = StringUtils.replace(cd, "{type}", "email ");
        } else if (StringUtils.contains(column.getType(), "Text")) {
            cd = StringUtils.replace(cd, "{type}", "text");
        } else if (StringUtils.contains(column.getType(), "text")) {
            cd = StringUtils.replace(cd, "{type}", "text");
        } else {
        }
        cd = StringUtils.replace(cd, "{type}", "text");
        cd = StringUtils.replace(cd, " \" name", "\" name");
        return cd;
    }

    /**
     * 格式化下拉列表
     *
     * @param lowerColumnCode
     * @param column
     * @return
     */
    public String columnStringCombo(String lowerColumnCode, CodeColumn column) {
        StringBuffer sb = new StringBuffer();
        sb.append("                   <select  class=\"selectpicker form-control\" required  data-live-search=\"true\" id=\"").append(lowerColumnCode).append("\" name=\"").append(lowerColumnCode).append("\" placeholder=\"选择").append(column.getColumnName()).append("\" >");
        //TODO
        if(column.getList()!=""&&column.getList()!=null)
        {
            Dictionary dictionary = new Dictionary();
            dictionary.setDicName(column.getList());
            List<Dictionary> list = dictionaryService.findAll(null,dictionary);
            for(Dictionary d : list)
                sb.append("                        <option value=\"").append(d.getDicKey()).append("\">").append(d.getDicValue()).append("</option>\n");
        }
        sb.append("                   </select>\n");
        return sb.toString();
    }

    /**
     * 下拉查询条件javascript代码
     *
     * @param codeColumnList
     * @return
     */
    public String comboboxJavaScript(List<CodeColumn> codeColumnList, String formName) {
        StringBuffer b = new StringBuffer();
        String upperColumnCode, lowerColumnCode;
        for (CodeColumn column : codeColumnList) {
            if (column.getColumnCode() != null && column.isQuery()) {
                upperColumnCode = StringUtil.replaceUnderlineAndfirstToUpper(column.getColumnCode(), "_", "");
                upperColumnCode = StringUtil.firstCharacterToUpper(upperColumnCode);
                lowerColumnCode = StringUtil.firstCharacterToLower(upperColumnCode);
                if (!StringUtils.equals(column.getType(), "hidden") && StringUtils.isNotBlank(column.getList())) {
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
     *
     * @param codeColumnList
     * @return
     */
    public String comboboxEditJavaScript(List<CodeColumn> codeColumnList, String formName) {
        StringBuffer b = new StringBuffer();
        String columnCode, lowerColumnCode;
        for (CodeColumn column : codeColumnList) {
            if (column.getColumnCode() != null) {
                columnCode = StringUtil.replaceUnderlineAndfirstToUpper(column.getColumnCode(), "_", "");
                lowerColumnCode = StringUtil.firstCharacterToLower(columnCode);
                if (!StringUtils.equals(column.getType(), "hidden") && StringUtils.isNotBlank(column.getList())) {
                    b.append("$('.selectpicker').selectpicker(").append(formName).append((".")).append(lowerColumnCode).append(");\n");
                }
            }
        }
        b.append("            $('.selectpicker').selectpicker('refresh');\n");
        return b.toString();
    }

    /**
     * 下拉javascript代码
     *
     * @param codeColumnList
     * @return
     */
    public String findKeyColumn(List<CodeColumn> codeColumnList) {
        String upperColumnCode, lowerColumnCode;
        for (CodeColumn column : codeColumnList) {
            if (column.getColumnCode() != null) {
                upperColumnCode = StringUtil.replaceUnderlineAndfirstToUpper(column.getColumnCode(), "_", "");
                upperColumnCode = StringUtil.firstCharacterToUpper(upperColumnCode);
                lowerColumnCode = StringUtil.firstCharacterToLower(upperColumnCode);
                if (column.isKey()) {
                    return lowerColumnCode;
                }
            }
        }
        return "id";
    }

}
