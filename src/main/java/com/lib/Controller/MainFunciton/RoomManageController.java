package com.lib.Controller.MainFunciton;
/*
    Author:Yin
*/
import com.lib.Service.Room.RoomService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RoomManageController {

    private final RoomService roomService;

    public RoomManageController(RoomService roomService){
        this.roomService=roomService;
    }

    @RequestMapping(value = "/Admin/RoomsManage")
    public ModelAndView roomManagePage(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("RoomManage");
        modelAndView.addObject("roomList",roomService.getRoomInfoService());
        return modelAndView;
    }
}
