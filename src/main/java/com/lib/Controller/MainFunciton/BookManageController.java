package com.lib.Controller.MainFunciton;/*
    Author:Yin
*/

import com.lib.Entity.Book;
import com.lib.Service.MainFunction.BookManageService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class BookManageController {
    private final BookManageService bookManageService;

    public BookManageController(BookManageService bookManageService){
        this.bookManageService=bookManageService;
    }

    @RequestMapping(value = "/Admin/BookManage",method = RequestMethod.POST)
    public ModelAndView bookManagePage(String adminName){
        List<Book> nullList=new ArrayList<>();
        Map<String,Object> map=new HashMap<>();
        map.put("bookList",nullList);
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("BookManage");
        modelAndView.addAllObjects(map);
        return modelAndView;
    }
}
