package com.ssm.controller.core;

import com.google.code.kaptcha.Constants;
import com.google.code.kaptcha.Producer;
import com.ssm.common.baseaction.BaseAction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;

/** 
 * @description: 验证码
 * @version 1.0
 * @author IMANON
 * @createDate 2014-1-25;上午11:02:48
 */@Controller
   @RequestMapping("/captcha")
   public class CaptchaController   extends BaseAction {

    @Autowired
    private Producer captchaProducer;

    private static final int SESSION_VAL_TIME_SPAN = 18000;
    private static final int DB_INDEX = 0;

    /**
     * 生成验证码
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @RequestMapping("/captchaing")
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {

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
        String capText = captchaProducer.createText();
        // store the text in the session
        request.getSession().setAttribute(Constants.KAPTCHA_SESSION_KEY, capText);
        // create the image with the text
        BufferedImage bi = captchaProducer.createImage(capText);
        ServletOutputStream out = response.getOutputStream();
        // write the data out
        ImageIO.write(bi, "png", out);
        //JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(response.getOutputStream());
        //encoder.encode(bi);
        try {
            out.flush();
        } finally {
            out.close();
        }
        return null;
    }




}
