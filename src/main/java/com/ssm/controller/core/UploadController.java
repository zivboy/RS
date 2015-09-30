package com.ssm.controller.core;

import com.ssm.common.util.UploadUtils;
import com.ssm.common.baseaction.BaseAction;
import com.ssm.common.util.Result;
import com.mongodb.DB;
import com.mongodb.gridfs.GridFS;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.convert.MongoConverter;
import org.springframework.data.mongodb.gridfs.GridFsTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletException;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.UUID;

/**
 * Created by Alex on 2014/11/24.
 */
@Controller
@RequestMapping(value = "/upload/main")
public class UploadController extends BaseAction {
/*
    @Autowired
    private MongoTemplate mongoTemplate;

    @Autowired
    private GridFsTemplate gridFsTemplate;

    @Autowired
    private MongoConverter mongoConverter;

    @Autowired
    private  MongoDbFactory mongoDbFactory;


    *//**
     * 读取启动流程的表单字段
     *//*
    @RequestMapping(value = "/uploadMongoDB", method = RequestMethod.POST)
    @SuppressWarnings("unchecked")
    @ResponseBody
    public Boolean startProcess(@RequestParam("file") MultipartFile file) {
        boolean flag = false;
        if (!file.isEmpty()) {
            UploadUtils uploadUtils = new UploadUtils();
            flag = uploadUtils.uploadMongoDB(UUID.randomUUID().toString(),file,gridFsTemplate);
        }
        return flag;
    }*/

}