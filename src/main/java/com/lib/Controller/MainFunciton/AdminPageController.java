package com.lib.Controller.MainFunciton;
/*
    Author:Yin
*/

import com.lib.Entity.Book;
import com.lib.Entity.Borrow;
import com.lib.Entity.Cost;
import com.lib.Service.Book.BookService;
import com.lib.Service.Borrow.MyBorrowService;
import com.lib.Service.Cost.MyCostService;
import com.lib.Service.MainFunction.AdminPageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

@Controller
public class AdminPageController {
    private final AdminPageService adminPageService;
    private final BookService bookService;
    private final MyBorrowService myBorrowService;
    private final MyCostService myCostService;

    @Autowired(required = false)
    public AdminPageController(AdminPageService adminPageService,BookService bookService,MyBorrowService myBorrowService,MyCostService myCostService){
        this.adminPageService=adminPageService;
        this.bookService=bookService;
        this.myBorrowService=myBorrowService;
        this.myCostService=myCostService;
    }

    @RequestMapping(value = "/Admin/Index",method = RequestMethod.POST)
    public ModelAndView adminPage(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("AdminIndex");
        return modelAndView;
    }

    @RequestMapping(value = "/Admin/Borrow",method = RequestMethod.POST)
    public ModelAndView borrowBook(String BookNo,String ReaderNo){
        ModelAndView modelAndView=new ModelAndView();
        Date date=new Date();
        Book myBook= bookService.getBook(BookNo);
        Borrow borrow=new Borrow();
        borrow.setBookNo(BookNo);
        borrow.setBookName(myBook.getBookName());
        borrow.setAuthor(myBook.getAuthor());
        borrow.setReaderNo(ReaderNo);
        borrow.setBDate(date);
        if(!myBorrowService.addBorrow(borrow)){
            modelAndView.setViewName("RegisterError");
        }
        modelAndView.setViewName("AdminIndex");
        return modelAndView;
    }

    @RequestMapping(value = "/Admin/Return",method = RequestMethod.POST)
    public ModelAndView ReturnBook(String BookNo,String ReaderNo){
        ModelAndView modelAndView=new ModelAndView();
        Date date=new Date();
        Date BDate=myBorrowService.getBDate(BookNo, ReaderNo);
        Book myBook= bookService.getBook(BookNo);
        Cost cost=new Cost();
        cost.setReaderNo(ReaderNo);
        cost.setBookNo(BookNo);
        cost.setAuthor(myBook.getAuthor());
        cost.setBDate(BDate);
        cost.setRDate(date);
        cost.setMoney(0);
        cost.setBookName(myBook.getBookName());

        long stateTimeLong = BDate.getTime();
        long endTimeLong = date.getTime();
        // 结束时间-开始时间 = 天数
        long day = (endTimeLong-stateTimeLong)/(24*60*60*1000);
        if(day>=35){
            cost.setMoney(day*0.1);
        }
        myBorrowService.delOld(BookNo,ReaderNo);
        if(!myCostService.addCost(cost)){
            modelAndView.setViewName("RegisterError");
        }
        modelAndView.setViewName("AdminIndex");
        return modelAndView;
    }




}
