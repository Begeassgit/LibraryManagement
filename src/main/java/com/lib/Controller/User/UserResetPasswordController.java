package com.lib.Controller.User;

import com.lib.Service.User.UserAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserResetPasswordController {

    private final UserAccountService userAccountService;

    @Autowired(required = false)
    public UserResetPasswordController(UserAccountService userAccountService){
        this.userAccountService=userAccountService;
    }

    @RequestMapping(value = "/Login/Reset",method = RequestMethod.GET)
    public String resetPage(){
        return "Reset";
    }

    @ResponseBody
    @RequestMapping(value = "/Login/RestSubmit",method = RequestMethod.POST)
    public ModelAndView checkReset(String ReaderNo,String Password){
        ModelAndView modelAndView=new ModelAndView();
        if(userAccountService.resetPasswordService(ReaderNo, Password)){
            modelAndView.setViewName("Login");
        }
        else{
            modelAndView.setViewName("ResetError");
        }
        return modelAndView;
    }
}
