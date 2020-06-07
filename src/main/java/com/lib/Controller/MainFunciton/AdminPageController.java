package com.lib.Controller.MainFunciton;
/*
    Author:Yin
*/
import com.lib.Entity.Admin;
import com.lib.Service.MainFunction.AdminPageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
public class AdminPageController {
    private final AdminPageService adminPageService;

    @Autowired(required = false)
    public AdminPageController(AdminPageService adminPageService){
        this.adminPageService=adminPageService;
    }

    @RequestMapping(value = "/Admin/Index",method = RequestMethod.POST)
    public ModelAndView adminPage(String adminName, HttpSession session){
        Admin admin=new Admin();
        admin.setUserName(adminName);
        session.setAttribute("AdminSession",admin);
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("AdminIndex");
        return modelAndView;
    }



}
