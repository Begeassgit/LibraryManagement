package com.lib.Service.Borrow;
/*
    Author:Yin
*/
import com.lib.Dao.BorrowDao;
import com.lib.Entity.Borrow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyBorrowService {
    private final BorrowDao borrowDao;

    @Autowired(required = false)
    public MyBorrowService(BorrowDao borrowDao){
        this.borrowDao=borrowDao;
    }

    public List<Borrow> findMyBorrow(String ReaderNo){
        return borrowDao.getMyBorrow(ReaderNo);
    }

    public int getReadingCount(String ReaderNo){
        return borrowDao.getReadingNow(ReaderNo);
    }

}
