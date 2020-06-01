package com.lib.Controller.MainPage;
/*
    Author:Yin
*/
import com.lib.Entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainPageController {

    @RequestMapping(value = "/")
    public ModelAndView mainPage(){
        User user=new User();
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("Home");
        modelAndView.addObject("Reader",user);
        return modelAndView;
    }
}
