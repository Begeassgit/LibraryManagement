package com.lib.Controller.MainFunciton;
/*
    Author:Yin
*/
import com.lib.Service.MainFunction.RoomManageService;
import com.lib.Service.Room.RoomService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RoomManageController {

    private final RoomManageService roomManageService;

    public RoomManageController(RoomManageService roomManageService){
        this.roomManageService=roomManageService;
    }

    @RequestMapping(value = "/Admin/RoomsManage",method = RequestMethod.POST)
    public ModelAndView roomManagePage(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("RoomManage");
        modelAndView.addObject("roomList",roomManageService.getAllRoom());
        return modelAndView;
    }

}
