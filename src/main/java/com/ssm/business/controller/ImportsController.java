package com.ssm.business.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.linuxense.javadbf.DBFField;
import com.linuxense.javadbf.DBFReader;
import com.ssm.business.entity.Imports;
import com.ssm.business.entity.Item;
import com.ssm.business.entity.Model;
import com.ssm.business.service.ImportService;
import com.ssm.business.service.ItemService;
import com.ssm.business.service.ModelService;
import com.ssm.business.service.StudentService;
import com.ssm.business.service.thread.ImportDateThread;
import com.ssm.business.service.thread.ImportThread;
import com.ssm.common.baseaction.BaseAction;
import com.ssm.common.mybatis.Page;
import com.ssm.common.util.*;
import com.ssm.entity.Columns;
import com.ssm.service.core.ColumnsService;
import com.ssm.viewModel.GridModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.*;

/**
 * Created by xecoder on Sat Sep 26 16:41:04 GMT+08:00 2015.
 */
@Controller
@SuppressWarnings("unchecked")
@RequestMapping(value = "/business/imports")
public class ImportsController extends BaseAction {
    protected Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    ImportService importService;

    @Autowired
    ColumnsService columnsService;

    @Autowired
    ModelService modelService;

    @Autowired
    StudentService studentService;

    @Autowired
    ItemService itemService;

    private static final String INDEX = "/business/imports/list";
    private static final String EDIT = "/business/imports/edit";

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index() {
        return INDEX;
    }


    /**
     * 表格数据导入
     *
     * @return GridModel
     */
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public GridModel list() {
        Imports imports = SearchForm(Imports.class);
        Page info = importService.findByPage(page(), imports);
        GridModel m = new GridModel();
        m.setRows(info.getRows());
        m.setTotal(info.getCount());
        return m;
    }


    /**
     * 添加数据导入
     *
     * @return ModelAndView
     */
    @RequestMapping(value = "/add")
    @ResponseBody
    public ModelAndView add() {
        ModelAndView mav = new ModelAndView(EDIT);
        Imports imports = new Imports();
        try {
            ObjectMapper mapper = JacksonMapper.getInstance();
            String json = mapper.writeValueAsString(imports);
            mav.addObject("message", "完成");
            mav.addObject("imports", json);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mav;
    }

    /**
     * 编辑数据导入
     *
     * @return ModelAndView
     */
    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    @ResponseBody
    public ModelAndView edit(@PathVariable Integer id) {
        logger.debug("edit id = " + id);
        ModelAndView mav = new ModelAndView(EDIT);
        try {
            Imports imports = importService.get(id);
            ObjectMapper mapper = JacksonMapper.getInstance();
            String json = mapper.writeValueAsString(imports);
            mav.addObject("message", "完成");
            mav.addObject("imports", json);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mav;
    }

    /**
     * 保存数据导入
     *
     * @return Result
     */
    @RequestMapping(value = "/save2")
    @ResponseBody
    public Result save2(@ModelAttribute Imports imports, @RequestParam("file") MultipartFile[] files) {
        Result result = new Result();
        try {
            if (files != null && files.length > 0) {
                //循环获取file数组中得文件
                for (int i = 0; i < files.length; i++) {
                    MultipartFile file = files[i];
                    //保存文件
                    // saveFile(file);
                    String fileName = file.getOriginalFilename();
                    imports.setTitle(fileName);
                    String path = UploadUtils.upload(file, request);
                    System.out.println("path = " + path);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
            result.setMsg("操作失败");
            result.setSuccessful(false);
        }
        return result;
    }


    /**
     * 保存数据导入
     *
     * @return Result
     */
    @RequestMapping(value = "/save")
    @ResponseBody
    public Result save(@ModelAttribute Imports imports, @RequestParam("file") MultipartFile[] files) {
        Result result = new Result();
        try {
            String path;
            Map<String, String> filesMap = new HashMap<>();//存储使用


            //循环获取file数组中得文件
            for (int i = 0; i < files.length; i++) {
                MultipartFile file = files[i];
                filesMap.put(file.getOriginalFilename().split("\\.")[0], UploadUtils.upload(file, request));
            }

            //学生
            if (filesMap.size() > 0 && filesMap.get("T_TDD") != null) {
                doTDD(imports,filesMap.get("T_TDD"));
            }

            //简历
            if (filesMap.size() > 0 && filesMap.get("T_KSJL") != null) {
               /* path = filesMap.get("T_KSJL");

                new Thread(new Runnable() {

                    public String path;

                    InputStream fis;

                    @Override
                    public void run() {
                        try {
                            fis = new FileInputStream(path);
                            DBFReader reader = new DBFReader(fis);
                            reader.setCharactersetName("GBK");
                            while (reader.nextRecord() != null) {//取dbf文件的每一行

                            }

                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }).start();
                */
            }


            result.setMsg("文件加载完成，请对应字段");
            result.setSuccessful(true);
            result.setData(imports);

        } catch (Exception e) {
            e.printStackTrace();
            result.setMsg("操作失败");
            result.setSuccessful(false);
        }
        return result;
    }

//学生主要数据
    private void doTDD(Imports imports,String path)
    {
        List<Item> showList = new ArrayList<>();//配置对应字段使用
        List<Item> dataList = new ArrayList<>();//存储使用

        try{
            String fileName = "T_TDD";
            imports.setFilePath(path);
            Columns columns = new Columns();
            columns.setTableName("business_student");
            columns.setTableSchema("recruits");
            //TODO 只需要对应的字段条件
            columns.setDataType("double");
            List<Columns> columnsList = columnsService.selectByExample(null, columns);
            imports.setTitle(fileName);//文件名称
            imports.setColumn(columnsList);//数据库的表字段

            InputStream fis = new FileInputStream(path);
            // 根据输入流初始化一个DBFReader实例，用来读取DBF文件信息
            DBFReader reader = new DBFReader(fis);
            reader.setCharactersetName("GBK");
            // 调用DBFReader对实例方法得到path文件中字段的个数
            int fieldsCount = reader.getFieldCount();
            imports.setFieldCount(fieldsCount);//字段个数
            // 取出字段信息
            for (int i = 0; i < fieldsCount; i++) {
                DBFField field = reader.getField(i);
                Item item = new Item();
                //item.setModelId(model_id);
                item.setSourceTabel(fileName);
                item.setSourceField(field.getName());
                item.setItemId(i);
                if (field.getName().toString().indexOf("CJ") > -1 || field.getName().toString().indexOf("GK") > -1 || field.getName().toString().indexOf("ZGF") > -1) {
                    showList.add(item);
                }
                dataList.add(item);
            }


            imports.setItemList(showList);//dbf 文件字段
            session.setAttribute("dataList", dataList);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    /**
     * 保存数据和模板
     *
     * @return Result
     */
    @Transactional
    @RequestMapping(value = "/saveModel")
    @ResponseBody
    public Result saveModel(@ModelAttribute Imports imports) {
        Result result = new Result();
        try {

            InputStream fis;
            List<Item> list = new ArrayList<>();
            Model model = new Model();
            if (imports.isModelFlag()) {
                model.setName(request.getParameter("name"));
                model.setState(1);
                model.setCreateDate(new Date());
                model.setUserId(Integer.parseInt(com.ssm.shiro.SecurityUtils.getShiroUser().getId() + ""));
                modelService.save(model);//先增加模板
                imports.setModelId(model.getModelId());
            } else {
                imports.setModelId(0);
            }


            imports.setActionTime(new Date());
            imports.setState(1);
            imports.setMessage("导入中");
            imports.setFieldCount(imports.getFieldHtml().size());
            imports.setTitle(model.getName() + imports.getTitle());
            int importId;
            importService.save(imports);
            importId = imports.getImportId();
            result.setMsg("数据导入中");
            result.setSuccessful(true);
            result.setData(imports);
            List<String> fieldHtml, columnHtml, sourceFieldDBF = new ArrayList<>();
            fieldHtml = imports.getFieldHtml();
            columnHtml = imports.getColumnHtml();

            if (imports.isModelFlag()) {
                //导入模板数据
                ImportThread importThread = new ImportThread(model.getModelId(), imports.getTitle(), fieldHtml, columnHtml);
                try {
                    Thread thread = new Thread(importThread);
                    thread.start();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            //导入表格数据

            fis = new FileInputStream(imports.getFilePath());
            // 根据输入流初始化一个DBFReader实例，用来读取DBF文件信息
            DBFReader reader = new DBFReader(fis);
            reader.setCharactersetName("GBK");
/*            Object[] rowValues;

            for (int i = 0; i < reader.getFieldCount(); i++) {
                DBFField field = reader.getField(i);
                sourceFieldDBF.add(field.getName());
            }*/
            // 一条条取出path文件中记录

            List<Item> dataList = (List<Item>) session.getAttribute("dataList");
            List<Columns> dataColumnsList = (List<Columns>) session.getAttribute("dataColumnsList");

            try {
                ImportDateThread threadData = new ImportDateThread(importId, reader, fieldHtml, columnHtml, dataList);
                Thread thread = new Thread(threadData);
                thread.start();
            } catch (Exception e) {
                e.printStackTrace();
            }

            //fis.close();


        } catch (Exception e) {
            e.printStackTrace();
            result.setMsg("操作失败");
            result.setSuccessful(false);
        }
        return result;
    }

    /**
     * 查询单个数据导入
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/get/{id}")
    @ResponseBody
    public Imports getInfo(@PathVariable Integer id) {
        return importService.get(id);
    }

    /**
     * 删除数据导入
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/delete/{id}")
    @ResponseBody
    public Result deleteInfo(@PathVariable Integer id) {
        Result result = new Result();
        importService.delete(id);
        result.setSuccessful(true);
        result.setMsg("删除成功");
        return result;
    }
}

