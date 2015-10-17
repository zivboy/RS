package com.ssm.controller.core;

import com.ssm.common.baseaction.BaseAction;
import com.ssm.common.util.DownloadUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.net.URLDecoder;
import java.util.UUID;

/**
 * Created by admin on 2014/8/28.
 */
@Controller
@RequestMapping("/download")
public class DownloadController   extends BaseAction {

    @RequestMapping(value = "/get")
    public String download(
            HttpServletRequest request, HttpServletResponse response,
            @RequestParam(value = "filePath") String filePath) throws Exception {

        logBean.setSuperid(UUID.randomUUID().toString());
        logBean.setMessage("下载资源" + filePath);
        logBean.setLogLevel("1");//字典表LOG-TYPE
        logBean.setUsername(com.ssm.shiro.SecurityUtils.getLoginUser().getUsername());
        log.save(logBean);

        filePath = filePath.replace("/", "\\");

        if (StringUtils.isEmpty(filePath) || filePath.contains("\\.\\.")) {
            response.setContentType("text/html;charset=utf-8");
            return null;
        }
        filePath = URLDecoder.decode(filePath, "UTF-8");


        DownloadUtils.download(request, response, filePath);

        return null;
    }

    @RequestMapping(value = "/getImg")
    public String downloadImg(
            HttpServletRequest request, HttpServletResponse response,
            @RequestParam(value = "filePath") String filePath) throws Exception {

        filePath = filePath.replace("/", "\\");

        if (StringUtils.isEmpty(filePath) || filePath.contains("\\.\\.")) {
            response.setContentType("text/html;charset=utf-8");
            return null;
        }
        filePath = URLDecoder.decode(filePath, "UTF-8");


        DownloadUtils.download(request, response, filePath);

        return null;
    }
}
