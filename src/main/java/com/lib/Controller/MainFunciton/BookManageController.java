package com.lib.Controller.MainFunciton;/*
    Author:Yin
*/

import com.lib.Entity.Book;
import com.lib.Service.MainFunction.BookManageService;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URLEncoder;
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
    public ModelAndView bookManagePage(){
        Map<String,Object> map=new HashMap<>();
        map.put("BookList",bookManageService.findAllBook());
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("BookManage");
        modelAndView.addAllObjects(map);
        return modelAndView;
    }

    @RequestMapping(value = "/Admin/BookManageAdd",method = RequestMethod.POST)
    public ModelAndView bookManageAddPage(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("AddBook");
        return modelAndView;
    }

    @RequestMapping(value = "/Admin/BookManageAddSubmit",method = RequestMethod.POST)
    public ModelAndView bookAddSubmit(Book book){
        Map<String,Object> map=new HashMap<>();
        ModelAndView modelAndView=new ModelAndView();
        if(!bookManageService.addBook(book)){
            modelAndView.setViewName("RegisterError");
        }
        map.put("BookList",bookManageService.findAllBook());
        modelAndView.setViewName("BookManage");
        modelAndView.addAllObjects(map);
        return modelAndView;
    }

    @RequestMapping(value = "/Output",method = RequestMethod.POST)
    public void getFileDe(HttpServletResponse response){
        XSSFWorkbook xssfWorkbook=bookManageService.sheetOutPut();
        String fileName="图书表.xlsx";
        OutputStream outputStream;
        try{
            fileName= URLEncoder.encode(fileName,"UTF-8");
            response.setContentType("application/vnd.ms-excel");
            response.setHeader("Content-disposition","attachment;filename="+fileName);
            outputStream=response.getOutputStream();
            xssfWorkbook.write(outputStream);
            outputStream.flush();
            outputStream.close();
        }
        catch (IOException eio){
            eio.printStackTrace();
        }
    }

}
