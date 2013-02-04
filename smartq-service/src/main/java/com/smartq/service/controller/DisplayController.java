package com.smartq.service.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;

import com.smartq.service.queue.SimpleQueue;
import com.smartq.utils.TimeUtils;

@Controller
public class DisplayController {

    @RequestMapping(method=RequestMethod.GET, value="/display")
    public String handleDisplayRequest(final Model model){

        model.addAttribute("rightNowTime",  TimeUtils.getRightNowTime());
        model.addAttribute("currentQueueNumber", SimpleQueue.INSTANCE.peekQueue());
        model.addAttribute("waitingInQueue", SimpleQueue.INSTANCE.getSize());

        return "display";
    }

    @RequestMapping(value = "/pollQueue", method = RequestMethod.POST)
    public String handlePollQueueRequest(final Model model,final SessionStatus status) {

        // clear the command object from the session
        status.setComplete();


        final String current = SimpleQueue.INSTANCE.pollQueue();

        model.addAttribute("rightNowTime",TimeUtils.getRightNowTime());
        model.addAttribute("currentQueueNumber", SimpleQueue.INSTANCE.peekQueue());
        model.addAttribute("waitingInQueue", SimpleQueue.INSTANCE.getSize());

        return "display";
    }

    @RequestMapping(value = "/addQueue", method = RequestMethod.POST)
    public String handleAddQueueRequest(final Model model,final SessionStatus status) {

        // clear the command object from the session
        status.setComplete();

        SimpleQueue.INSTANCE.addQueue();

        model.addAttribute("rightNowTime", TimeUtils.getRightNowTime());
        model.addAttribute("currentQueueNumber", SimpleQueue.INSTANCE.peekQueue());
        model.addAttribute("waitingInQueue", SimpleQueue.INSTANCE.getSize());

        return "display";
    }
}
