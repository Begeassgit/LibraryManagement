package com.lib.Controller.MainFunciton;
/*
    Author:Yin
*/
import com.lib.Service.Borrow.MyBorrowService;
import org.springframework.stereotype.Controller;

@Controller
public class MyLendController {
    private final MyBorrowService myLendService;

    public MyLendController(MyBorrowService myLendService){
        this.myLendService=myLendService;
    }
}
