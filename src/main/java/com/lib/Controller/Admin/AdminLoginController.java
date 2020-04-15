package com.lib.Controller.Admin;

import com.lib.Entity.Admin;
import com.lib.Service.Admin.AdminAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdminLoginController {
    private final AdminAccountService adminAccountService;

    /*对Service层进行映射*/
    @Autowired
    public AdminLoginController(AdminAccountService adminAccountService){
        this.adminAccountService=adminAccountService;
    }

    /*管理员登录页路由控制*/
    @RequestMapping(value = "/Admin",method = RequestMethod.GET)
    public String adminLoginPage(){
        return "AdminLogin";
    }

    /*管理员登录信息提交API*/
    @RequestMapping(value = "/Admin/Check",method = RequestMethod.POST)
    public ModelAndView checkAdminLogin(String UserNo, String Password){
        ModelAndView modelAndView=new ModelAndView();
        Admin temp=adminAccountService.loginAdminService(UserNo, Password);
        if(temp==null){
            modelAndView.setViewName("Index");
        }
        else{
            modelAndView.setViewName("AdminIndex");
            modelAndView.addObject("Admin",temp);
        }
        return modelAndView;
    }
}
