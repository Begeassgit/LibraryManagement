package com.lib.Controller.LendPage;

import com.lib.Service.Lend.MyLendService;
import org.springframework.stereotype.Controller;

@Controller
public class MyLendController {
    private final MyLendService myLendService;

    public MyLendController(MyLendService myLendService){
        this.myLendService=myLendService;
    }
}
