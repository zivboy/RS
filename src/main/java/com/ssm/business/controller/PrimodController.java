package com.ssm.business.controller;

import com.ssm.business.entity.Primod;
import com.ssm.business.service.PrimodService;
import com.ssm.common.baseaction.BaseAction;
import com.ssm.common.mybatis.Page;
import com.ssm.common.util.JacksonMapper;
import com.ssm.common.util.Result;
import com.ssm.common.util.SimpleDate;
import com.ssm.common.util.UploadUtils;
import com.ssm.viewModel.GridModel;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.InputStream;

/**
 * Created by xecoder on Sat Oct 03 17:24:55 GMT+08:00 2015.
 */
@Controller
@SuppressWarnings("unchecked")
@RequestMapping(value = "/business/primod")
public class PrimodController extends BaseAction {
    protected Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    PrimodService primodService;

    private static final String INDEX = "/business/primod/list";
    private static final String EDIT = "/business/primod/edit";

    @RequestMapping(value="/index", method= RequestMethod.GET)
    public String index() {
        return INDEX;
    }


    /**
     * 表格打印模板
     * @return GridModel
     */
    @RequestMapping(value="/list", method= RequestMethod.GET)
    @ResponseBody
    public GridModel list() {
        Primod primod = SearchForm(Primod.class);
        Page info = primodService.findByPage(page(), primod);
        GridModel m = new GridModel();
        m.setRows(info.getRows());
        m.setTotal(info.getCount());
        return m;
    }


    /**
     * 添加打印模板
     * @return ModelAndView
     */
    @RequestMapping(value="/add")
    @ResponseBody
    public ModelAndView add() {
        ModelAndView mav = new ModelAndView(EDIT);
        Primod primod = new Primod();
        try {
            ObjectMapper mapper = JacksonMapper.getInstance();
            String json =mapper.writeValueAsString(primod);
            mav.addObject("message", "完成");
            mav.addObject("primod",json);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return mav;
    }

    /**
     * 编辑打印模板
     * @return ModelAndView
     */
    @RequestMapping(value="/edit/{id}", method = RequestMethod.GET)
    @ResponseBody
    public ModelAndView edit(@PathVariable Integer id) {
        logger.debug("edit id = " + id);
        ModelAndView mav = new ModelAndView(EDIT);
        try {
            Primod primod =  primodService.get(id);
            ObjectMapper mapper = JacksonMapper.getInstance();
            String json =mapper.writeValueAsString(primod);
            mav.addObject("message", "完成");
            mav.addObject("primod",json);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return mav;
    }



    /**
     * 保存打印模板
     * @param primod
     * @return Result
     */
    @RequestMapping(value="/save")
    @ResponseBody
    public Result saveAddPrimod(@ModelAttribute Primod primod,@RequestParam("file") MultipartFile file) {
        Result result = new Result();
        try {
            if(!file.isEmpty()){
                String path = UploadUtils.upload(file, request);
                primod.setFilePath(path);
                primod.setUrl(path);
            }
            primod.setStateTime(SimpleDate.getDateTime());
            if (primod.getModId() != null) primodService.update(primod);
            else primodService.save(primod);
            result.setMsg("操作成功");
            result.setSuccessful(true);
        }catch (Exception e) {
            e.printStackTrace();
            result.setMsg("操作失败");
            result.setSuccessful(false);
        }
        return result;
    }

    /*@RequestMapping(value="/save", method = RequestMethod.POST)
    public String saveAddPrimod(@ModelAttribute Primod primod,@RequestParam("file") MultipartFile file) {
        String page = INDEX;
        try {
            if (primod.getModId() != null)
            {
                primod.setStateTime(SimpleDate.getDateTime());
                primodService.update(primod);
            }
            else
            {
                if(!file.isEmpty()){
                    String path = UploadUtils.upload(file, request);
                    primod.setFilePath(path);
                    primod.setUrl(path);
                }
                primod.setStateTime(SimpleDate.getDateTime());
                primodService.save(primod);
            }
        }catch (Exception e){
            page = EDIT;
        }
        return page;
    }*/

    /**
     * 查询单个打印模板
     * @param id
     * @return
     */
    @RequestMapping(value="/get/{id}")
    @ResponseBody
    public Primod getInfo(@PathVariable Integer id) {
        return  primodService.get(id);
    }

    /**
     * 删除打印模板
     * @param id
     * @return
     */
    @RequestMapping(value="/delete/{id}")
    @ResponseBody
    public Result deleteInfo(@PathVariable Integer id) {
        Result result = new Result();
        primodService.delete(id);
        result.setSuccessful(true);
        result.setMsg("删除成功");
        return result;
    }


}

