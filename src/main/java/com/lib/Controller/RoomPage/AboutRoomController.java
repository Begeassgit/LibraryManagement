package com.lib.Controller.RoomPage;

import com.lib.Service.Room.RoomService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AboutRoomController {

    private final RoomService roomService;

    public AboutRoomController(RoomService roomService){
        this.roomService=roomService;
    }

    @RequestMapping(value = "/LibraryRooms")
    public ModelAndView roomInfoPage(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("RoomMessage");
        modelAndView.addObject("roomList",roomService.getRoomInfo());
        return modelAndView;
    }
}
