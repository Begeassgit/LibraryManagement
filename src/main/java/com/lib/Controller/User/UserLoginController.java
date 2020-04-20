package com.lib.Controller.User;

import com.lib.Entity.User;
import com.lib.Service.User.UserAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;


@Controller
public class UserLoginController {

    private final UserAccountService userAccountService;

    @Autowired(required = false)
    public UserLoginController(UserAccountService userAccountService){
        this.userAccountService=userAccountService;
    }

    @RequestMapping(value = "/Login",method = RequestMethod.GET)
    public String loginPage(){
        return "Login";
    }

    @ResponseBody
    @RequestMapping(value = "/Login/Check",method = RequestMethod.POST)
    public ModelAndView checkLogin(HttpServletRequest request, User user){
        ModelAndView modelAndView=new ModelAndView();
        User temp=userAccountService.loginService(user.getReaderNo(),user.getPassword());
        if(temp==null){
            modelAndView.setViewName("Login");
        }
        else{
            request.getSession().setAttribute(user.getReaderName(),user.getPassword());
            modelAndView.setViewName("Home");
            modelAndView.addObject("Reader",temp);
        }
        return modelAndView;
    }
}
