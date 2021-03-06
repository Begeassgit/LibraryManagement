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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserRegisterController {
    private final UserAccountService userAccountService;


    public UserRegisterController(UserAccountService userAccountService){
        this.userAccountService=userAccountService;
    }

    /*用户注册页路由*/
    @RequestMapping(value = "/Register",method = RequestMethod.GET)
    public String registerPage(){
        return "Register";
    }

    @RequestMapping(value = "/Register1",method = RequestMethod.GET)
    public String registerPag(){
        return "RegisterError";
    }

    /*用户注册的信息提交API*/
    @RequestMapping(value = "/Register/Submit",method = RequestMethod.POST)
    public String registerSubmit(String ReaderNo, String Number, String Password){
        if(!userAccountService.registerService(ReaderNo, Number, Password)){
            return "RegisterError";
        }
        else {
            return "redirect:/Login";

        }

    }

}
