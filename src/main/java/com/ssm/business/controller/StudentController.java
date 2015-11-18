package com.ssm.business.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonEncoding;
import com.ssm.business.entity.Priitems;
import com.ssm.business.entity.Primod;
import com.ssm.business.entity.Student;
import com.ssm.business.service.PriitemsService;
import com.ssm.business.service.PrimodService;
import com.ssm.business.service.StudentService;
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
import java.util.List;

/**
 * Created by xecoder on Mon Oct 26 15:59:00 GMT+08:00 2015.
 */
@Controller
@SuppressWarnings("unchecked")
@RequestMapping(value = "/business/student")
public class StudentController extends BaseAction {
    protected Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    StudentService studentService;
    @Autowired
    PrimodService primodService;
    @Autowired
    PriitemsService priitemsService;

    private static final String INDEX = "/business/student/list";
    private static final String EDIT = "/business/student/edit";
    private static final String PRINTLIST = "/business/student/printList";//打印列表
    private static final String PRINTTZS = "/business/student/printTzs";//打印通知书
    private static final String PRINTEMS = "/business/student/printEms";//打印信封

    @RequestMapping(value="/index", method= RequestMethod.GET)
    public String index() {
        return INDEX;
    }

    /**
     * 打印列表初始页面
     * @return
     */
    @RequestMapping(value="/printList", method= RequestMethod.GET)
    public String printList() {
        return PRINTLIST;
    }

    /**
     * 表格学生
     * @return GridModel
     */
    @RequestMapping(value="/list", method= RequestMethod.GET)
    @ResponseBody
    public GridModel list() {
        Student student = SearchForm(Student.class);
        Page info = studentService.findByPage(page(), student);
        GridModel m = new GridModel();
        m.setRows(info.getRows());
        m.setTotal(info.getCount());
        return m;
    }


    /**
     * 添加学生
     * @return ModelAndView
     */
    @RequestMapping(value="/add")
    @ResponseBody
    public ModelAndView add() {
        ModelAndView mav = new ModelAndView(EDIT);
        Student student = new Student();
        try {
            ObjectMapper mapper = JacksonMapper.getInstance();
            String json =mapper.writeValueAsString(student);
            mav.addObject("message", "完成");
            mav.addObject("student",json);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return mav;
    }

    /**
     * 编辑学生
     * @return ModelAndView
     */
    @RequestMapping(value="/edit/{id}", method = RequestMethod.GET)
    @ResponseBody
    public ModelAndView edit(@PathVariable Integer id) {
        logger.debug("edit id = " + id);
        ModelAndView mav = new ModelAndView(EDIT);
        try {
            Student student =  studentService.get(id);
            ObjectMapper mapper = JacksonMapper.getInstance();
            String json =mapper.writeValueAsString(student);
            mav.addObject("message", "完成");
            mav.addObject("student",json);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return mav;
    }



    /**
     * 保存学生
     * @param student
     * @return Result
     */
    @RequestMapping(value="/save")
    @ResponseBody
    public Result saveAddStudent(@ModelAttribute Student student) {
        Result result = new Result();
        try {
            if (student.getId() != null)
            {
                studentService.update(student);
                result.setMsg("成功");
                result.setSuccessful(true);
            }
            else
            {
                studentService.save(student);
                result.setMsg("成功");
                result.setSuccessful(true);
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
     * 查询单个学生
     * @param id
     * @return
     */
    @RequestMapping(value="/get/{id}")
    @ResponseBody
    public Student getInfo(@PathVariable Integer id) {
        return  studentService.get(id);
    }

    /**
     * 删除学生
     * @param id
     * @return
     */
    @RequestMapping(value="/delete/{id}")
    @ResponseBody
    public Result deleteInfo(@PathVariable Integer id) {
        Result result = new Result();
        studentService.delete(id);
        result.setSuccessful(true);
        result.setMsg("删除成功");
        return result;
    }

    /**
     * 打印
     * @return ModelAndView
     */
    @RequestMapping(value="/print/{id}",params ="modId",method = {RequestMethod.GET})
    @ResponseBody
    public ModelAndView print(@PathVariable Integer id,@RequestParam(value="modId")  String modId) {
        logger.debug("print id = " + id+"modId:"+modId);
        ModelAndView mav = new ModelAndView(PRINTTZS);
        try {
            Student student =  studentService.get(id);
            Primod primod = primodService.get(Integer.parseInt(modId));
            Priitems priitems = new Priitems();
            if("2".equals(primod.getModState())){
                mav = new ModelAndView(PRINTEMS);
            }
            priitems.setModId(Integer.parseInt(modId));
            List<Priitems> priitemsList = priitemsService.findAll(null,priitems);
            ObjectMapper mapper = JacksonMapper.getInstance();
            String sjson =mapper.writeValueAsString(student);
            String pjson =mapper.writeValueAsString(primod);
            String psjson =mapper.writeValueAsString(priitemsList);
            mav.addObject("message", "完成");
            mav.addObject("student",sjson);
            mav.addObject("primod",pjson);
            mav.addObject("priitemsList",psjson);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return mav;
    }

    @RequestMapping(value="/findPrimod")
    @ResponseBody
    public List<Primod> findAllPrimod() {
        Primod primod = new Primod();
        List<Primod> list = primodService.findAll(null,primod);
        return list;
    }

    @RequestMapping(value="/getPri/{smodId}")
    @ResponseBody
    public String getPri(@PathVariable Integer smodId) {
        String pri = "";
        try {
            Primod primod = primodService.get(smodId);
            Priitems priitems = new Priitems();
            priitems.setModId(smodId);
            List<Priitems> priitemsList = priitemsService.findAll(null,priitems);
            ObjectMapper mapper = JacksonMapper.getInstance();
            pri =mapper.writeValueAsString(primod)+"#"+mapper.writeValueAsString(priitemsList);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return pri;
    }
}

