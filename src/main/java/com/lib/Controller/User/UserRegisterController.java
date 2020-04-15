package com.lib.Controller.User;

import com.lib.Service.User.UserAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserRegisterController {
    private final UserAccountService userAccountService;

    @Autowired
    public UserRegisterController(UserAccountService userAccountService){
        this.userAccountService=userAccountService;
    }

    @RequestMapping("/Register")
    public String registerPage(){
        return "Register";
    }
}
