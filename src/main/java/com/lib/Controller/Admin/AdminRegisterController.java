package com.lib.Controller.Admin;

import com.lib.Entity.Admin;
import com.lib.Service.Admin.AdminAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AdminRegisterController {
    private final AdminAccountService adminAccountService;

    @Autowired
    public AdminRegisterController(AdminAccountService adminAccountService){
        this.adminAccountService=adminAccountService;
    }

    @RequestMapping(value = "/Admin/Register",method = RequestMethod.GET)
    public String registerAdminPage(){
        return "RegisterAdmin";
    }

    @RequestMapping(value = "/Admin/Register/Submit",method = RequestMethod.POST)
    public String registerSubmit(Admin admin){
        if(adminAccountService.registerAdminService(admin)){
            return "AdminLogin";
        }
        else {
            return "RegisterError";
        }
    }
}
