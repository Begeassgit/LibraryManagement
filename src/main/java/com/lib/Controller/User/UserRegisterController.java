package com.lib.Controller.User;

import com.lib.Entity.User;
import com.lib.Service.User.UserAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserRegisterController {
    private final UserAccountService userAccountService;

    @Autowired
    public UserRegisterController(UserAccountService userAccountService){
        this.userAccountService=userAccountService;
    }

    /*用户注册页路由*/
    @RequestMapping(value = "/Register",method = RequestMethod.GET)
    public String registerPage(){
        return "Register";
    }

    /*用户注册的信息提交API*/
    @ResponseBody
    @RequestMapping(value = "/Register/Submit",method = RequestMethod.POST)
    public String registerSubmit(User user){
        if(userAccountService.registerService(user)){
            return "Login";
        }
        else {
            return "RegisterError";
        }

    }

}
