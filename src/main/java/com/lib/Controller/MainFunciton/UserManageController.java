package com.lib.Controller.MainFunciton;/*
    Author:Yin
*/

import com.lib.Entity.User;
import com.lib.Service.MainFunction.UserManageService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserManageController {

    private final UserManageService userManageService;

    public UserManageController(UserManageService userManageService){
        this.userManageService=userManageService;
    }

    @RequestMapping(value = "/Admin/UserManage",method = RequestMethod.POST)
    public ModelAndView userManagePage(){
        List<User> nullList=new ArrayList<>();
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("UserManage");
        modelAndView.addObject("readerList",nullList);
        return modelAndView;
    }

}
