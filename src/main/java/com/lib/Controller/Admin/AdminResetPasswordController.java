package com.lib.Controller.Admin;

import com.lib.Service.Admin.AdminAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminResetPasswordController {
    private final AdminAccountService adminAccountService;

    @Autowired(required = false)
    public AdminResetPasswordController(AdminAccountService adminAccountService){
        this.adminAccountService=adminAccountService;
    }

    @RequestMapping(value = "/Admin/Login/Rest")
    public String restAdminPage(){
        return "Reset";
    }
}
