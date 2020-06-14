package com.lib.Controller.MainFunciton;/*
    Author:Yin
*/

import com.lib.Service.MainFunction.NoticeManageService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
public class NoticeManageController {

    private final NoticeManageService noticeManageService;

    public NoticeManageController(NoticeManageService noticeManageService){
        this.noticeManageService=noticeManageService;
    }

    @RequestMapping(value = "/Admin/NoticeManage",method = RequestMethod.POST)
    public ModelAndView noticeManagePage(){
        Map<String,Object>map =new HashMap<>();
        map.put("noticeList",noticeManageService.getAllNotice());
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("NoticeManage");
        modelAndView.addAllObjects(map);
        return modelAndView;
    }
}
