package com.lib.Controller.User;
/*
    Author:Yin
*/
import com.lib.Entity.User;
import com.lib.Service.Borrow.MyBorrowService;
import com.lib.Service.Cost.MyCostService;
import com.lib.Service.User.UserInfoService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
public class UserInfoController {

    private final UserInfoService userInfoService;
    private final MyBorrowService myBorrowService;
    private final MyCostService myCostService;


    public UserInfoController(UserInfoService userInfoService,MyBorrowService myBorrowService,MyCostService myCostService){
        this.userInfoService=userInfoService;
        this.myBorrowService=myBorrowService;
        this.myCostService=myCostService;
    }

    @RequestMapping(value = "/MyAccount")
    public ModelAndView myAccountPage(String ReaderNo){
        Map<String,Object> map =new HashMap<>();
        ModelAndView modelAndView=new ModelAndView();
        User temp=userInfoService.getUserInfoService(ReaderNo);
        map.put("Reader",userInfoService.getUserInfoService(ReaderNo));
        map.put("BorrowList",myBorrowService.findMyBorrow(ReaderNo));
        map.put("CostList",myCostService.findMyCost(ReaderNo));
        map.put("ReadingNow",myBorrowService.getReadingCount(ReaderNo));
        map.put("History",myCostService.getHistory(ReaderNo));
        map.put("Cost",myCostService.getCostCount(ReaderNo));
        if(temp==null){
            modelAndView.setViewName("Login");
        }
        else {
            modelAndView.setViewName("MyMessage");
            modelAndView.addAllObjects(map);
        }

        return modelAndView;
    }

    @RequestMapping(value = "/UpdateMyMessagePage",method = RequestMethod.POST)
    public ModelAndView updatePage(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("UpdateUserInfo");
        return modelAndView;
    }

    @RequestMapping(value = "/UpdateMyMessage",method = RequestMethod.POST)
    public ModelAndView updateMyMessage(short Age,String Sex,String identities,String ReaderNo){
        ModelAndView modelAndView=new ModelAndView();
        if(!userInfoService.updateUserInfo(Age, Sex, identities, ReaderNo)){
            modelAndView.setViewName("RegisterError");
        }
        Map<String,Object>map=new HashMap<>();
        User temp=userInfoService.getUserInfoService(ReaderNo);
        map.put("Reader",userInfoService.getUserInfoService(ReaderNo));
        map.put("BorrowList",myBorrowService.findMyBorrow(ReaderNo));
        map.put("CostList",myCostService.findMyCost(ReaderNo));
        map.put("ReadingNow",myBorrowService.getReadingCount(ReaderNo));
        map.put("History",myCostService.getHistory(ReaderNo));
        map.put("Cost",myCostService.getCostCount(ReaderNo));
        modelAndView.setViewName("MyMessage");
        modelAndView.addAllObjects(map);
        return modelAndView;
    }

}
