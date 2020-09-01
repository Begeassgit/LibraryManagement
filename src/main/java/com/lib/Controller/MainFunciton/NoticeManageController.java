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

    @RequestMapping(value = "/Admin/UpdateNotice",method = RequestMethod.POST)
    public ModelAndView updateNoticePage(String NoticeNo){
        int NoticeNoInt= Integer.parseInt(NoticeNo);
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("UpdateNoticeInfo");
        modelAndView.addObject("NoticeNo",NoticeNoInt);
        return modelAndView;
    }

    @RequestMapping(value = "/Admin/UpdateNoticeSubmit",method = RequestMethod.POST)
    public ModelAndView updateNoticeSubmit(Integer NoticeNo,String NoticeTitle,String Notice){
        ModelAndView modelAndView=new ModelAndView();
        Map<String,Object>map =new HashMap<>();
        if(!noticeManageService.updateNotice(NoticeNo, Notice, NoticeTitle)){
            modelAndView.setViewName("RegisterError");
        }
        map.put("noticeList",noticeManageService.getAllNotice());
        modelAndView.setViewName("NoticeManage");
        modelAndView.addAllObjects(map);
        return modelAndView;
    }
}
