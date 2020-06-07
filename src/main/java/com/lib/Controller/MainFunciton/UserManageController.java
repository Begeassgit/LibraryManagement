package com.lib.Controller.MainFunciton;/*
    Author:Yin
*/

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserManageController {


    @RequestMapping(value = "/Admin/UserManage",method = RequestMethod.GET)
    public ModelAndView userManagePage(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("UserManage");
        return modelAndView;
    }

}
