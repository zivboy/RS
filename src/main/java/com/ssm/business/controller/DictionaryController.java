package com.ssm.business.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ssm.business.entity.Dictionary;
import com.ssm.business.service.DictionaryService;
import com.ssm.common.baseaction.BaseAction;
import com.ssm.common.mybatis.Page;
import com.ssm.common.util.JacksonMapper;
import com.ssm.common.util.Result;
import com.ssm.viewModel.GridModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by xecoder on Sat Oct 17 10:30:06 GMT+08:00 2015.
 */
@Controller
@SuppressWarnings("unchecked")
@RequestMapping(value = "/business/dictionary")
public class DictionaryController extends BaseAction {
    protected Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    DictionaryService dictionaryService;

    private static final String INDEX = "/business/dictionary/list";
    private static final String EDIT = "/business/dictionary/edit";

    @RequestMapping(value="/index", method= RequestMethod.GET)
    public String index() {
        return INDEX;
    }


    /**
     * 表格字典维护
     * @return GridModel
     */
    @RequestMapping(value="/list", method= RequestMethod.GET)
    @ResponseBody
    public GridModel list() {
        Dictionary dictionary = SearchForm(Dictionary.class);
        dictionary.setDicCode("bus-san");
        Page info = dictionaryService.findByPage(page(), dictionary);
        GridModel m = new GridModel();
        m.setRows(info.getRows());
        m.setTotal(info.getCount());
        return m;
    }


    /**
     * 添加字典维护
     * @return ModelAndView
     */
    @RequestMapping(value="/add")
    @ResponseBody
    public ModelAndView add() {
        ModelAndView mav = new ModelAndView(EDIT);
        Dictionary dictionary = new Dictionary();
        try {
            ObjectMapper mapper = JacksonMapper.getInstance();
            String json =mapper.writeValueAsString(dictionary);
            mav.addObject("message", "完成");
            mav.addObject("dictionary",json);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return mav;
    }

    /**
     * 编辑字典维护
     * @return ModelAndView
     */
    @RequestMapping(value="/edit/{id}", method = RequestMethod.GET)
    @ResponseBody
    public ModelAndView edit(@PathVariable Integer id) {
        logger.debug("edit id = " + id);
        ModelAndView mav = new ModelAndView(EDIT);
        try {
            Dictionary dictionary =  dictionaryService.get(id);
            ObjectMapper mapper = JacksonMapper.getInstance();
            String json =mapper.writeValueAsString(dictionary);
            mav.addObject("message", "完成");
            mav.addObject("dictionary",json);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return mav;
    }



    /**
     * 保存字典维护
     * @param dictionary
     * @return Result
     */
    @RequestMapping(value="/save")
    @ResponseBody
    public Result saveAddDictionary(@ModelAttribute Dictionary dictionary) {
        Result result = new Result();
        try {
            if (dictionary.getPkId() != null)
            {
                dictionaryService.update(dictionary);
                result.setMsg("成功");
                result.setSuccessful(true);
            }
            else
            {
                dictionaryService.save(dictionary);
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
     * 查询单个字典维护
     * @param id
     * @return
     */
    @RequestMapping(value="/get/{id}")
    @ResponseBody
    public Dictionary getInfo(@PathVariable Integer id) {
        return  dictionaryService.get(id);
    }

    /**
     * 删除字典维护
     * @param id
     * @return
     */
    @RequestMapping(value="/delete/{id}")
    @ResponseBody
    public Result deleteInfo(@PathVariable Integer id) {
        Result result = new Result();
        dictionaryService.delete(id);
        result.setSuccessful(true);
        result.setMsg("删除成功");
        return result;
    }
}

