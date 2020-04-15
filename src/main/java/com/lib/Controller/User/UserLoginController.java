package com.lib.Controller.User;

import com.lib.Entity.User;
import com.lib.Service.User.UserAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class UserLoginController {

    private final UserAccountService userAccountService;

    @Autowired(required = false)
    public UserLoginController(UserAccountService userAccountService){
        this.userAccountService=userAccountService;
    }

    @RequestMapping("/Login")
    public String loginPage(){
        return "Login.html";
    }

    @RequestMapping("/Login/Check")
    public User checkLogin(User user){
        return userAccountService.loginService(user.getReaderNo(),user.getPassword());
    }
}
