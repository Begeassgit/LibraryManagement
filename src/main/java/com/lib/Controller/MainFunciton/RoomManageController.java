package com.lib.Controller.MainFunciton;
/*
    Author:Yin
*/
import com.lib.Service.MainFunction.RoomManageService;
import com.lib.Service.Room.RoomService;
import com.sun.org.apache.bcel.internal.generic.POP;
import com.sun.org.apache.xpath.internal.operations.Mod;
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

    @RequestMapping(value = "/Admin/UpdateRoom",method = RequestMethod.POST)
    public ModelAndView roomUpdatePage(String RoomNo){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("UpdateRoomInfo");
        modelAndView.addObject("RoomNo",RoomNo);
        return modelAndView;
    }

    @RequestMapping(value = "/Admin/UpdateRoomSubmit",method = RequestMethod.POST)
    public ModelAndView roomUpdate(String RoomNo,String RoomUserNo,String RoomName,String Tel){
        ModelAndView modelAndView=new ModelAndView();
        if(!roomManageService.updateRoom(RoomNo, RoomUserNo, Tel, RoomName)){
            modelAndView.setViewName("RegisterError");
        }
        modelAndView.setViewName("RoomManage");
        modelAndView.addObject("roomList",roomManageService.getAllRoom());
        return modelAndView;
    }



}
