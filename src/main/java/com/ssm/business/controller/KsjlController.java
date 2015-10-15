package com.ssm.business.controller;

import com.ssm.business.entity.Ksjl;
import com.ssm.business.service.KsjlService;
import com.ssm.common.baseaction.BaseAction;
import com.ssm.common.mybatis.Page;
import com.ssm.common.util.JacksonMapper;
import com.ssm.common.util.Result;
import com.ssm.viewModel.GridModel;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by xecoder on Thu Oct 15 19:14:20 GMT+08:00 2015.
 */
@Controller
@SuppressWarnings("unchecked")
@RequestMapping(value = "/business/ksjl")
public class KsjlController extends BaseAction {
    protected Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    KsjlService ksjlService;

    private static final String INDEX = "/business/ksjl/list";
    private static final String EDIT = "/business/ksjl/edit";

    @RequestMapping(value="/index", method= RequestMethod.GET)
    public String index() {
        return INDEX;
    }


    /**
     * 表格考生简历表
     * @return GridModel
     */
    @RequestMapping(value="/list", method= RequestMethod.GET)
    @ResponseBody
    public GridModel list() {
        Ksjl ksjl = SearchForm(Ksjl.class);
        Page info = ksjlService.findByPage(page(), ksjl);
        GridModel m = new GridModel();
        m.setRows(info.getRows());
        m.setTotal(info.getCount());
        return m;
    }


    /**
     * 添加考生简历表
     * @return ModelAndView
     */
    @RequestMapping(value="/add")
    @ResponseBody
    public ModelAndView add() {
        ModelAndView mav = new ModelAndView(EDIT);
        Ksjl ksjl = new Ksjl();
        try {
            ObjectMapper mapper = JacksonMapper.getInstance();
            String json =mapper.writeValueAsString(ksjl);
            mav.addObject("message", "完成");
            mav.addObject("ksjl",json);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return mav;
    }

    /**
     * 编辑考生简历表
     * @return ModelAndView
     */
    @RequestMapping(value="/edit/{id}", method = RequestMethod.GET)
    @ResponseBody
    public ModelAndView edit(@PathVariable Integer id) {
        logger.debug("edit id = " + id);
        ModelAndView mav = new ModelAndView(EDIT);
        try {
            Ksjl ksjl =  ksjlService.get(id);
            ObjectMapper mapper = JacksonMapper.getInstance();
            String json =mapper.writeValueAsString(ksjl);
            mav.addObject("message", "完成");
            mav.addObject("ksjl",json);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return mav;
    }



    /**
     * 保存考生简历表
     * @param ksjl
     * @return Result
     */
    @RequestMapping(value="/save")
    @ResponseBody
    public Result saveAddKsjl(@ModelAttribute Ksjl ksjl) {
        Result result = new Result();
        try {
            if (ksjl.getId() != null)
            {
                ksjlService.update(ksjl);
                result.setMsg("成功");
                result.setSuccessful(true);
            }
            else
            {
                ksjlService.save(ksjl);
                result.setMsg("成功");
                result.setSuccessful(true);
            }
        } finally {
                result.setMsg("失败");
                result.setSuccessful(false);
        }
        return result;
    }

    /**
     * 查询单个考生简历表
     * @param id
     * @return
     */
    @RequestMapping(value="/get/{id}")
    @ResponseBody
    public Ksjl getInfo(@PathVariable Integer id) {
        return  ksjlService.get(id);
    }

    /**
     * 删除考生简历表
     * @param id
     * @return
     */
    @RequestMapping(value="/delete/{id}")
    @ResponseBody
    public Result deleteInfo(@PathVariable Integer id) {
        Result result = new Result();
        ksjlService.delete(id);
        result.setSuccessful(true);
        result.setMsg("删除成功");
        return result;
    }
}

