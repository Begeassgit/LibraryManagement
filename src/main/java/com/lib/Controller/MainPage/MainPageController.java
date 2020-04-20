package com.lib.Controller.MainPage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainPageController {

    @RequestMapping(value = "/")
    public String mainPage(){
        return "Home";
    }
}
