package com.lib.Controller.MainFunciton;
/*
    Author:Yin
*/
import com.lib.Entity.User;
import com.lib.Service.Notice.NoticeService;
import com.lib.Service.Room.RoomService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
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

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public ModelAndView mainPage(HttpSession session){
        Map<String,Object> map=new HashMap<>();
        User user=new User();
        ModelAndView modelAndView=new ModelAndView();
        session.removeAttribute("Reader");
        session.setAttribute("Reader",user);
        map.put("Room",roomService.getRoomInfoService());
        map.put("Notice",noticeService.getAllNoticeInPage());
        modelAndView.setViewName("Home");
        modelAndView.addAllObjects(map);
        return modelAndView;
    }
}
