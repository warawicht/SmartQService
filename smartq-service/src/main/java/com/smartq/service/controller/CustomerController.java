package com.smartq.service.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.smartq.utils.TimeUtils;

@Controller
public class CustomerController {

    @RequestMapping(method=RequestMethod.GET, value="/customer")
    public String handleRequest(final Model model){

        model.addAttribute("rightNowTime",  TimeUtils.getRightNowTime());
        model.addAttribute("currentQueueNumber",  1);
        model.addAttribute("waitingQueue",  100);

        return "display";
    }

}
