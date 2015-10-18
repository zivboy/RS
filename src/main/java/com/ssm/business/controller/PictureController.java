package com.ssm.business.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ssm.business.entity.Picture;
import com.ssm.business.service.PictureService;
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

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by xecoder on Sat Oct 17 22:21:53 GMT+08:00 2015.
 */
@Controller
@SuppressWarnings("unchecked")
@RequestMapping(value = "/business/picture")
public class PictureController extends BaseAction {
    protected Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    PictureService pictureService;

    private static final String INDEX = "/business/picture/list";
    private static final String EDIT = "/business/picture/edit";

    @RequestMapping(value="/index", method= RequestMethod.GET)
    public String index() {
        return INDEX;
    }


    /**
     * 表格学生照片
     * @return GridModel
     */
    @RequestMapping(value="/list", method= RequestMethod.GET)
    @ResponseBody
    public GridModel list() {
        Picture picture = SearchForm(Picture.class);
        Page info = pictureService.findByPage(page(), picture);
        GridModel m = new GridModel();
        m.setRows(info.getRows());
        m.setTotal(info.getCount());
        return m;
    }

    /**
     * TOP10照片
     * @return GridModel
     */
    @RequestMapping(value="/getTop10")
    @ResponseBody
    public Result getTop10(@RequestParam String filePath) {
        Result result = new Result();
        List<String> list = new ArrayList<>();
        File file = new File(filePath);
        if (!file.isDirectory()) {
            result.setSuccessful(false);
            result.setMsg("这不是一个文件夹");
        } else if (file.isDirectory()) {
            String[] filelist = file.list();
            int count = filelist.length>10?10:filelist.length;
            for (int i = 0; i < count; i++) {
                File readfile = new File(filePath + File.separator + filelist[i]);
                if (!readfile.isDirectory()) {
                    list.add(readfile.getAbsolutePath().replace(File.separator,"~"));
                }
            }
            result.setData(list);
        }
        return  result;
    }

//
//    /**
//     * 编辑学生照片
//     * @return ModelAndView
//     */
//    @RequestMapping(value="/edit/{id}", method = RequestMethod.GET)
//    @ResponseBody
//    public ModelAndView edit(@PathVariable Integer id) {
//
//    }
    @RequestMapping(value="/img/{picpath}/{fileType}", method = RequestMethod.GET)
    @ResponseBody
    public ModelAndView img(@PathVariable String picpath,@PathVariable String fileType) throws Exception {
        response.setDateHeader("Expires", 0);
        // Set standard HTTP/1.1 no-cache headers.
        response.setHeader("Cache-Control", "no-store, no-cache, must-revalidate");
        // Set IE extended HTTP/1.1 no-cache headers (use addHeader).
        response.addHeader("Cache-Control", "post-check=0, pre-check=0");
        // Set standard HTTP/1.0 no-cache header.
        response.setHeader("Pragma", "no-cache");
        // return a jpeg
        response.setContentType("image/jpeg");
        // create the text for the image

        InputStream reader = null;
        OutputStream out = null;
        byte[] bytes = new byte[1024];
        int len = 0;
        try {
            // 读取文件
            reader = new FileInputStream(picpath.replace("~",File.separator)+"."+fileType);
            // 写入浏览器的输出流
            out = response.getOutputStream();
            while ((len = reader.read(bytes)) > 0) {
                out.write(bytes, 0, len);
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            if (reader != null) {
                reader.close();
            }
            if (out != null)
                out.close();
        }
        return null;
    }


    /**
     * 添加学生照片路径
     * @return ModelAndView
     */
    @RequestMapping(value="/add")
    @ResponseBody
    public ModelAndView add() {
        ModelAndView mav = new ModelAndView(EDIT);
        Picture picture = new Picture();
        try {
            ObjectMapper mapper = JacksonMapper.getInstance();
            String json =mapper.writeValueAsString(picture);
            //registry.addResourceHandler("/test/**").addResourceLocations("file:///Users/testuser/test/");
            mav.addObject("message", "完成");
            mav.addObject("picture",json);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return mav;
    }

    /**
     * 编辑学生照片
     * @return ModelAndView
     */
    @RequestMapping(value="/edit/{id}", method = RequestMethod.GET)
    @ResponseBody
    public ModelAndView edit(@PathVariable Integer id) {
        logger.debug("edit id = " + id);
        ModelAndView mav = new ModelAndView(EDIT);
        try {
            Picture picture =  pictureService.get(id);
            ObjectMapper mapper = JacksonMapper.getInstance();
            String json =mapper.writeValueAsString(picture);
            mav.addObject("message", "完成");
            mav.addObject("picture",json);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return mav;
    }



    /**
     * 保存学生照片
     * @param picture
     * @return Result
     */
    @RequestMapping(value="/save")
    @ResponseBody
    public Result saveAddPicture(@ModelAttribute Picture picture) {
        Result result = new Result();
        File file = new File(picture.getPath());
        if (!file.isDirectory()) {
            result.setSuccessful(false);
            result.setMsg("这不是一个文件夹");
        }
        else {

            try {
                if (picture.getId() != null) {
                    pictureService.update(picture);
                    result.setMsg("成功");
                    result.setSuccessful(true);
                } else {
                    pictureService.save(picture);
                    result.setMsg("成功");
                    result.setSuccessful(true);
                }
            } catch (Exception e) {
                result.setMsg("失败" + e.getMessage());
                result.setSuccessful(false);
            }
        }
        return result;
    }

    /**
     * 查询单个学生照片
     * @param id
     * @return
     */
    @RequestMapping(value="/get/{id}")
    @ResponseBody
    public Picture getInfo(@PathVariable Integer id) {
        return  pictureService.get(id);
    }

    /**
     * 删除学生照片
     * @param id
     * @return
     */
    @RequestMapping(value="/delete/{id}")
    @ResponseBody
    public Result deleteInfo(@PathVariable Integer id) {
        Result result = new Result();
        pictureService.delete(id);
        result.setSuccessful(true);
        result.setMsg("删除成功");
        return result;
    }
}

