package com.lib.Controller.Admin;
/*
    Author:Yin
*/
import com.lib.Service.Admin.AdminAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

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

    @RequestMapping(value = "/Admin/Login/ResetSubmit")
    public ModelAndView checkReset(String UserNo,String Password){
        ModelAndView modelAndView=new ModelAndView();
        if(adminAccountService.resetPasswordAdminService(UserNo, Password)){
            modelAndView.setViewName("AdminLogin");
        }
        else{
            modelAndView.setViewName("ResetError");
        }

        return modelAndView;
    }
}
