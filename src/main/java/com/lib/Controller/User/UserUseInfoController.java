package com.lib.Controller.User;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserUseInfoController {


    /*正在借阅页面*/
    @RequestMapping(value = "/MyBooks")
    public ModelAndView lendingInfoPage(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("Lending");
        return modelAndView;
    }

    /*历史借阅信息页*/
    @RequestMapping(value = "/MyHistoryBooks")
    public ModelAndView historyInfoPage(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("HistoryLending");
        return modelAndView;
    }

    /*个人付费信息页*/
    @RequestMapping(value = "/MyCost")
    public ModelAndView costInfoPage(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("Afford");
        return modelAndView;
    }
}
