package com.smartq.service.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.smartq.utils.TimeUtils;

@Controller
public class WelcomeController {

    @RequestMapping(method=RequestMethod.GET, value="/hello")
    public String handleRequest(final Model model){

        model.addAttribute("rightNowTime", TimeUtils.getRightNowTime());
        return "welcome";
    }




}
