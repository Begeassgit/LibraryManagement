package com.lib.Controller.User;
/*
    Author:Yin
*/
import com.lib.Entity.User;
import com.lib.Service.User.UserAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


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

    @RequestMapping(value = "/Login/Check",method = RequestMethod.POST)
    public ModelAndView checkLogin(User user){
        ModelAndView modelAndView=new ModelAndView();
        User temp=userAccountService.loginService(user.getReaderNo(),user.getPassword());
        if(temp==null){
            modelAndView.setViewName("Login");
        }
        else{
            modelAndView.setViewName("Home");
            modelAndView.addObject("Reader",temp);
        }
        return modelAndView;
    }
}
