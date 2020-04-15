package com.lib.Controller.Admin;

import com.lib.Entity.Admin;
import com.lib.Service.Admin.AdminAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AdminLoginController {
    private final AdminAccountService adminAccountService;

    @Autowired
    public AdminLoginController(AdminAccountService adminAccountService){
        this.adminAccountService=adminAccountService;
    }

    @RequestMapping(value = "/Admin",method = RequestMethod.GET)
    public String adminLoginPage(){
        return "adminLogin";
    }

    @RequestMapping(value = "/Admin/Check",method = RequestMethod.POST)
    public Admin checkAdminLogin(String UserNo,String Password){
       return adminAccountService.loginAdminService(UserNo, Password);
    }
}
