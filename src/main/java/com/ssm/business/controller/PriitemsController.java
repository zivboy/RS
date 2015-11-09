package com.ssm.business.controller;

import com.ssm.business.entity.Dictionary;
import com.ssm.business.entity.Priitems;
import com.ssm.business.entity.Primod;
import com.ssm.business.service.DictionaryService;
import com.ssm.business.service.PriitemsService;
import com.ssm.business.service.PrimodService;
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

import java.util.Date;
import java.util.List;

/**
 * Created by xecoder on Sat Oct 03 17:25:39 GMT+08:00 2015.
 */
@Controller
@SuppressWarnings("unchecked")
@RequestMapping(value = "/business/priitems")
public class PriitemsController extends BaseAction {
    protected Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    PriitemsService priitemsService;
    @Autowired
    PrimodService primodService;
    @Autowired
    DictionaryService dictionaryService;

    private static final String INDEX = "/business/priitems/list";
    private static final String EDIT = "/business/priitems/edit";

    @RequestMapping(value="/index", method= RequestMethod.GET)
    public String index() {
        return INDEX;
    }


    /**
     * 表格打印项
     * @return GridModel
     */
    @RequestMapping(value="/list", method= RequestMethod.GET)
    @ResponseBody
    public GridModel list() {
        Priitems priitems = SearchForm(Priitems.class);
        Page info = priitemsService.findByPage(page(), priitems);
        GridModel m = new GridModel();
        m.setRows(info.getRows());
        m.setTotal(info.getCount());
        return m;
    }


    /**
     * 添加打印项
     * @return ModelAndView
     */
    @RequestMapping(value="/add")
    @ResponseBody
    public ModelAndView add() {
        ModelAndView mav = new ModelAndView(EDIT);
        Priitems priitems = new Priitems();
        try {
            ObjectMapper mapper = JacksonMapper.getInstance();
            String json =mapper.writeValueAsString(priitems);
            mav.addObject("message", "完成");
            mav.addObject("priitems",json);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return mav;
    }

    /**
     * 编辑打印项
     * @return ModelAndView
     */
    @RequestMapping(value="/edit/{id}", method = RequestMethod.GET)
    @ResponseBody
    public ModelAndView edit(@PathVariable Integer id) {
        logger.debug("edit id = " + id);
        ModelAndView mav = new ModelAndView(EDIT);
        try {
            Priitems priitems =  priitemsService.get(id);
            ObjectMapper mapper = JacksonMapper.getInstance();
            String json =mapper.writeValueAsString(priitems);
            mav.addObject("message", "完成");
            mav.addObject("priitems",json);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return mav;
    }



    /**
     * 保存打印项
     * @param priitems
     * @return Result
     */
    @RequestMapping(value="/save")
    @ResponseBody
    public Result saveAddPriitems(@ModelAttribute Priitems priitems) {
        Result result = new Result();
        priitems.setStateTime(new Date());
        try {
            if (priitems.getPriId() != null)
            {
                priitemsService.update(priitems);
                result.setMsg("成功");
                result.setSuccessful(true);
            }
            else
            {
                priitemsService.save(priitems);
                result.setMsg("成功");
                result.setSuccessful(true);
            }
        }catch(Exception e){
                e.printStackTrace();
                result.setMsg("失败");
                result.setSuccessful(false);
        }
        return result;
    }

    /**
     * 查询单个打印项
     * @param id
     * @return
     */
    @RequestMapping(value="/get/{id}")
    @ResponseBody
    public Priitems getInfo(@PathVariable Integer id) {
        return  priitemsService.get(id);
    }

    /**
     * 删除打印项
     * @param id
     * @return
     */
    @RequestMapping(value="/delete/{id}")
    @ResponseBody
    public Result deleteInfo(@PathVariable Integer id) {
        Result result = new Result();
        priitemsService.delete(id);
        result.setSuccessful(true);
        result.setMsg("删除成功");
        return result;
    }

    /**
     * 获取打印模板集合
     */
    @RequestMapping(value="/getAllPrimod")
    @ResponseBody
    public List<Primod> getAllPrimod() {
        Primod primod = new Primod();
        List<Primod> list = primodService.findAll(null,primod);
        return list;
    }

    /**
     * 打印项下拉
     * @param dicName
     * @param modId
     * @return
     */
    @RequestMapping(value="/getPriCodeDown")
    @ResponseBody
    public List<Dictionary> getPriCodeDown(@RequestParam String dicName,@RequestParam String modId) {
        System.out.println("###################:"+dicName+":"+modId);
        Dictionary dictionary = new Dictionary();
        dictionary.setDicName(dicName);
        Primod primod = primodService.get(Integer.parseInt(modId));
        if(primod!=null&&primod.getModState().length()>0){
            dictionary.setDicCode(primod.getModState());
        }
        List<Dictionary> list = dictionaryService.findAll(null,dictionary);
        return list;
    }
}

