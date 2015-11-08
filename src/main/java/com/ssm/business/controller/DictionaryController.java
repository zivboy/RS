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

import java.util.Date;
import java.util.List;

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

    @RequestMapping(value="/index/{type}", method= RequestMethod.GET)
    public ModelAndView index(@PathVariable String type) {
        ModelAndView mav = new ModelAndView(INDEX);
        mav.addObject("type", type);
        return mav;
    }


    /**
     * 表格字典维护
     * @return GridModel
     */
    @RequestMapping(value="/list/{type}", method= RequestMethod.GET)
    @ResponseBody
    public GridModel list(@PathVariable String type) {
        Dictionary dictionary = SearchForm(Dictionary.class);
        dictionary.setDicCode("bus-san");
        dictionary.setDicName(type);
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
    @RequestMapping(value="/add/{type}")
    @ResponseBody
    public ModelAndView add(@PathVariable String type) {
        ModelAndView mav = new ModelAndView(EDIT);
        Dictionary dictionary = new Dictionary();
        try {
            ObjectMapper mapper = JacksonMapper.getInstance();
            dictionary.setType(type);
            dictionary.setState("A");
            String json =mapper.writeValueAsString(dictionary);
            mav.addObject("message", "完成");
            mav.addObject("type", type);
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
            mav.addObject("type",dictionary.getDicName());
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
            Dictionary dictionaryS = new Dictionary();
            if (dictionary.getPkId() != null)
            {

                dictionaryS.setDicValue(dictionary.getDicValue());
                dictionaryS.setDicKey(dictionary.getDicKey());
                dictionaryS.setState("A");
                List<Dictionary> list = dictionaryService.findAll(page(),dictionaryS);
                if(list.size()==1)
                {
                    for(Dictionary d:list){
                        if(d.getPkId()!=dictionary.getPkId())
                        {
                            result.setMsg("数据重复");
                            result.setSuccessful(false);
                        }
                    }
                }
                else if(list.size()>1)
                {
                    result.setMsg("数据重复");
                    result.setSuccessful(false);
                }
                else {
                    dictionaryService.update(dictionary);
                    result.setMsg("成功");
                    result.setSuccessful(true);
                }
            }
            else
            {
                dictionaryS.setDicValue(dictionary.getDicValue());
                dictionaryS.setDicKey(dictionary.getDicKey());
                dictionaryS.setState("A");
                List<Dictionary> list = dictionaryService.findAll(page(),dictionaryS);
                if(list.size()>=1)
                {
                            result.setMsg("数据重复");
                            result.setSuccessful(false);
                }
                else {
                    dictionary.setDicCode("bus-san");
                    dictionary.setDicName(dictionary.getType());
                    Dictionary dictionaryP = dictionaryService.findByKeyAndName("0", dictionary.getType());
                    dictionaryS.setDicCode("bus-san");
                    dictionaryS.setDicName(dictionary.getType());
                    dictionary.setStateTime(new Date());
                    int count = dictionaryService.countByExample(page(), dictionaryS);
                    dictionary.setDicId(count);
                    dictionary.setDicParentId(dictionaryP.getDicId());
                    dictionaryService.save(dictionary);
                    result.setMsg("成功");
                    result.setSuccessful(true);
                }
            }
        }
        catch (Exception e)
        {
            result.setMsg("失败"+e.getMessage());
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


    /**
     * 通用下拉
     * @param dicName
     * @return
     */
    @RequestMapping(value="/getDropDown")
    @ResponseBody
    public List<Dictionary> getDropDown(@RequestParam String dicName) {
        Dictionary dictionary = new Dictionary();
        dictionary.setDicName(dicName);
        List<Dictionary> list = dictionaryService.findAll(null,dictionary);
        return list;
    }

    /**
     * 省份
     * @param type
     * @return
     */
    @RequestMapping(value="/find/{type}")
    @ResponseBody
    public List<Dictionary> findAllRole(@PathVariable String type) {
        Dictionary dictionary = new Dictionary();
        dictionary.setDicCode("bus-san");
        dictionary.setDicName(type);
        Page info = dictionaryService.findByPage(page(), dictionary);
        return info.getRows();
    }

}

