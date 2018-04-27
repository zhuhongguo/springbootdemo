package com.egoint.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public ModelAndView index() {
    	ModelAndView modelAndView =new ModelAndView();
    	modelAndView.setViewName("login");
        return modelAndView;
    }
}
