package com.lib.Controller.Admin;

import com.lib.Entity.Admin;
import com.lib.Service.Admin.AdminAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class AdminRegisterController {
    private final AdminAccountService adminAccountService;

    @Autowired
    public AdminRegisterController(AdminAccountService adminAccountService){
        this.adminAccountService=adminAccountService;
    }
}
