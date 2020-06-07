package com.lib.Controller.MainFunciton;/*
    Author:Yin
*/

import com.lib.Service.MainFunction.BookManageService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BookManageController {
    private final BookManageService bookManageService;

    public BookManageController(BookManageService bookManageService){
        this.bookManageService=bookManageService;
    }

    @RequestMapping(value = "/Admin/BookManage",method = RequestMethod.POST)
    public ModelAndView bookManagePage(String adminName){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("BookManage");
        return modelAndView;
    }
}
