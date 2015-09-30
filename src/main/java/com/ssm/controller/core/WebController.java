package com.ssm.controller.core;

import com.ssm.common.baseaction.BaseAction;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.UUID;

/**
 * Created by vincent on 2014/11/18.
 */
@Controller
@RequestMapping("/")
public class WebController extends BaseAction {
    private static final String LOGIN_PAGE = "login";

    @RequestMapping(value="")
    @ResponseBody
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView(LOGIN_PAGE);
        String salt = UUID.randomUUID().toString();
        modelAndView.addObject("salt",salt);
        return modelAndView;
    }

}
