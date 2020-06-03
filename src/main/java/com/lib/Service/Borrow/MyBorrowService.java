package com.lib.Service.Borrow;
/*
    Author:Yin
*/
import com.lib.Dao.BorrowDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyBorrowService {
    private final BorrowDao borrowDao;

    @Autowired(required = false)
    public MyBorrowService(BorrowDao borrowDao){
        this.borrowDao=borrowDao;
    }



}
