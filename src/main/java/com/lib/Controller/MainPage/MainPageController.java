package com.lib.Controller.MainPage;
/*
    Author:Yin
*/
import com.lib.Entity.User;
import com.lib.Service.Notice.NoticeService;
import com.lib.Service.Room.RoomService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
public class MainPageController {

    private final RoomService roomService;
    private final NoticeService noticeService;

    public MainPageController(RoomService roomService,NoticeService noticeService){
        this.noticeService=noticeService;
        this.roomService=roomService;
    }

    @RequestMapping(value = "/")
    public ModelAndView mainPage(){
        Map<String,Object> map=new HashMap<>();
        User user=new User();
        ModelAndView modelAndView=new ModelAndView();
        map.put("Reader",user);
        map.put("Room",roomService.getRoomInfoService());
        map.put("Notice",noticeService.getNoticeInfoService());
        modelAndView.setViewName("Home");
        modelAndView.addAllObjects(map);
        return modelAndView;
    }
}
