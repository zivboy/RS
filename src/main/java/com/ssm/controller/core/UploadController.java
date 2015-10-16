package com.ssm.controller.core;

import com.ssm.common.baseaction.BaseAction;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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