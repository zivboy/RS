package com.ssm.business.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ssm.business.entity.Item;
import com.ssm.business.service.ItemService;
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
 * Created by xecoder on Tue Sep 22 23:55:11 GMT+08:00 2015.
 */
@Controller
@SuppressWarnings("unchecked")
@RequestMapping(value = "/business/item")
public class ItemController extends BaseAction {
    protected Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    ItemService itemService;

    private static final String INDEX = "/business/item/list";
    private static final String EDIT = "/business/item/edit";

    @RequestMapping(value="/index", method= RequestMethod.GET)
    public String index() {
        return INDEX;
    }


    /**
     * 表格模板字段
     * @return GridModel
     */
    @RequestMapping(value="/list", method= RequestMethod.GET)
    @ResponseBody
    public GridModel list() {
        Item item = SearchForm(Item.class);
        Page info = itemService.findByPage(page(), item);
        GridModel m = new GridModel();
        m.setRows(info.getRows());
        m.setTotal(info.getCount());
        return m;
    }


    /**
     * 添加模板字段
     * @return ModelAndView
     */
    @RequestMapping(value="/add")
    @ResponseBody
    public ModelAndView add() {
        ModelAndView mav = new ModelAndView(EDIT);
        Item item = new Item();
        try {
            ObjectMapper mapper = JacksonMapper.getInstance();
            String json =mapper.writeValueAsString(item);
            mav.addObject("message", "完成");
            mav.addObject("item",json);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return mav;
    }

    /**
     * 编辑模板字段
     * @return ModelAndView
     */
    @RequestMapping(value="/edit/{id}", method = RequestMethod.GET)
    @ResponseBody
    public ModelAndView edit(@PathVariable Integer id) {
        logger.debug("edit id = " + id);
        ModelAndView mav = new ModelAndView(EDIT);
        try {
            Item item =  itemService.get(id);
            ObjectMapper mapper = JacksonMapper.getInstance();
            String json =mapper.writeValueAsString(item);
            mav.addObject("message", "完成");
            mav.addObject("item",json);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return mav;
    }



    /**
     * 保存模板字段
     * @param item
     * @return Result
     */
    @RequestMapping(value="/save")
    @ResponseBody
    public Result saveAddItem(@ModelAttribute Item item) {
        Result result = new Result();
        try {
            if (item.getItemId() != null)
            {
                itemService.update(item);
                result.setMsg("成功");
                result.setSuccessful(true);
            }
            else
            {
                itemService.save(item);
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
     * 查询单个模板字段
     * @param id
     * @return
     */
    @RequestMapping(value="/get/{id}")
    @ResponseBody
    public Item getInfo(@PathVariable Integer id) {
        return  itemService.get(id);
    }

    /**
     * 删除模板字段
     * @param id
     * @return
     */
    @RequestMapping(value="/delete/{id}")
    @ResponseBody
    public Result deleteInfo(@PathVariable Integer id) {
        Result result = new Result();
        itemService.delete(id);
        result.setSuccessful(true);
        result.setMsg("删除成功");
        return result;
    }
}

