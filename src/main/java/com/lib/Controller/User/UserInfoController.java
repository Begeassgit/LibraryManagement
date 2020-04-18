package com.lib.Controller.User;

import com.lib.Entity.User;
import com.lib.Service.User.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserInfoController {

    private final UserInfoService userInfoService;

    @Autowired(required = false)
    public UserInfoController(UserInfoService userInfoService){
        this.userInfoService=userInfoService;
    }

    @RequestMapping(value = "/MyAccount")
    public ModelAndView myAccountPage(String ReaderNo){
        ModelAndView modelAndView=new ModelAndView();
        User temp=userInfoService.getUserInfoService(ReaderNo);
        if(temp==null){
            modelAndView.setViewName("Login");
        }
        else {
            modelAndView.setViewName("MyAccount");
            modelAndView.addObject("User",temp);
        }

        return modelAndView;
    }

}
