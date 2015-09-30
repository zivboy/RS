package com.ssm.business.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.linuxense.javadbf.DBFField;
import com.linuxense.javadbf.DBFReader;
import com.ssm.business.entity.Model;
import com.ssm.business.service.ModelService;
import com.ssm.common.baseaction.BaseAction;
import com.ssm.common.mybatis.Page;
import com.ssm.common.util.JacksonMapper;
import com.ssm.common.util.Result;
import com.ssm.common.util.SimpleDate;
import com.ssm.common.util.UploadUtils;
import com.ssm.viewModel.GridModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;

/**
 * Created by xecoder on Tue Sep 22 23:54:08 GMT+08:00 2015.
 */
@Controller
@SuppressWarnings("unchecked")
@RequestMapping(value = "/business/model")
public class ModelController extends BaseAction {
    protected Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    ModelService modelService;

    private static final String INDEX = "/business/model/list";
    private static final String EDIT = "/business/model/edit";

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index() {
        return INDEX;
    }


    /**
     * 表格模板
     *
     * @return GridModel
     */
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public GridModel list() {
        Model model = SearchForm(Model.class);
        model.setState(1);
        Page info = modelService.findByPage(page(), model);
        GridModel m = new GridModel();
        m.setRows(info.getRows());
        m.setTotal(info.getCount());
        return m;
    }


    /**
     * 下拉
     *
     * @return GridModel
     */
    @RequestMapping(value = "/modelList")
    @ResponseBody
    public List<Model> modelList() {
        Model model = SearchForm(Model.class);
        model.setState(1);
        List<Model> list =  modelService.findAll(null, model);
        for(Model m: list)
        {
            m.setName(m.getModelId()+"-"+m.getName()+"-"+ SimpleDate.formatZH(m.getCreateDate()));
        }
        return list;
    }



    /**
     * 添加模板
     *
     * @return ModelAndView
     */
    @RequestMapping(value = "/add")
    @ResponseBody
    public ModelAndView add() {
        ModelAndView mav = new ModelAndView(EDIT);
        Model model = new Model();
        try {
            ObjectMapper mapper = JacksonMapper.getInstance();
            String json = mapper.writeValueAsString(model);
            mav.addObject("message", "完成");
            mav.addObject("model", json);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mav;
    }

    /**
     * 编辑模板
     *
     * @return ModelAndView
     */
    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    @ResponseBody
    public ModelAndView edit(@PathVariable Integer id) {
        logger.debug("edit id = " + id);
        ModelAndView mav = new ModelAndView(EDIT);
        try {
            Model model = modelService.get(id);
            ObjectMapper mapper = JacksonMapper.getInstance();
            String json = mapper.writeValueAsString(model);
            mav.addObject("message", "完成");
            mav.addObject("model", json);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mav;
    }

    /**
     * 保存
     *
     * @return Result
     */
    @RequestMapping(value = "/save")
    @ResponseBody
    public Result save(@ModelAttribute Model model, @RequestParam("file") MultipartFile file) {
        Result result = new Result();
        try {

            InputStream fis = null;

            if (!file.isEmpty()) {
                String path = UploadUtils.upload(file, request);
                fis = new FileInputStream(path);
                // 根据输入流初始化一个DBFReader实例，用来读取DBF文件信息
                DBFReader reader = new DBFReader(fis);

                reader.setCharactersetName("GBK");

                // 调用DBFReader对实例方法得到path文件中字段的个数
                int fieldsCount = reader.getFieldCount();

                // 取出字段信息
                for (int i = 0; i < fieldsCount; i++) {
                    DBFField field = reader.getField(i);
                    System.out.println(field.getName());
                }

                Object[] rowValues;

                // 一条条取出path文件中记录
                while ((rowValues = reader.nextRecord()) != null) {
                    for (int i = 0; i < rowValues.length; i++) {
                        System.out.println(rowValues[i]);
                    }
                }
            }
            modelService.save(model);
            result.setMsg("成功");
            result.setSuccessful(true);

        } catch (Exception e) {
            e.printStackTrace();
            result.setMsg("操作失败");
            result.setSuccessful(false);
        }
        return result;
    }


    @RequestMapping(value = "/update")
    @ResponseBody
    public Result updateModel(@ModelAttribute Model model) {
        Result result = new Result();
        try {
            modelService.save(model);
            result.setMsg("成功");
            result.setSuccessful(true);
        } finally {
            result.setMsg("失败");
            result.setSuccessful(false);
        }
        return result;
    }

    /**
     * 查询单个模板
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/get/{id}")
    @ResponseBody
    public Model getInfo(@PathVariable Integer id) {
        return modelService.get(id);
    }

    /**
     * 删除模板
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/delete/{id}")
    @ResponseBody
    public Result deleteInfo(@PathVariable Integer id) {
        Result result = new Result();
        modelService.delete(id);
        result.setSuccessful(true);
        result.setMsg("删除成功");
        return result;
    }
}

