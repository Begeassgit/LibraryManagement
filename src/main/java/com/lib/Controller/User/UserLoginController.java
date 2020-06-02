package com.lib.Controller.User;
/*
    Author:Yin
*/
import com.lib.Entity.User;
import com.lib.Service.Room.RoomService;
import com.lib.Service.User.UserAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;


@Controller
public class UserLoginController {

    private final UserAccountService userAccountService;
    private final RoomService roomService;

    public UserLoginController(UserAccountService userAccountService,RoomService roomService){
        this.userAccountService=userAccountService;
        this.roomService=roomService;
    }

    @RequestMapping(value = "/Login",method = RequestMethod.GET)
    public String loginPage(){
        return "Login";
    }

    @RequestMapping(value = "/Login/Check",method = RequestMethod.POST)
    public ModelAndView checkLogin(User user){
        Map<String,Object> map=new HashMap<>();
        ModelAndView modelAndView=new ModelAndView();
        User temp=userAccountService.loginService(user.getReaderNo(),user.getPassword());
        if(temp==null){
            modelAndView.setViewName("Login");
        }
        else{
            map.put("Reader",temp);
            map.put("Room",roomService.getRoomInfo());
            modelAndView.setViewName("Home");
            modelAndView.addAllObjects(map);
        }
        return modelAndView;
    }
}
