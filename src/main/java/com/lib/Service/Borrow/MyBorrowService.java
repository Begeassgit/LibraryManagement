package com.lib.Service.Borrow;
/*
    Author:Yin
*/
import com.lib.Dao.BookDao;
import com.lib.Dao.BorrowDao;
import com.lib.Entity.Book;
import com.lib.Entity.Borrow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class MyBorrowService {
    private final BorrowDao borrowDao;
    private final BookDao bookDao;
    int InBase=0;

    @Autowired(required = false)
    public MyBorrowService(BorrowDao borrowDao,BookDao bookDao){
        this.borrowDao=borrowDao;
        this.bookDao=bookDao;
    }

    public List<Borrow> findMyBorrow(String ReaderNo){
        return borrowDao.getMyBorrow(ReaderNo);
    }

    public int getReadingCount(String ReaderNo){
        return borrowDao.getReadingNow(ReaderNo);
    }

    public boolean addBorrow(Borrow borrow){
        InBase=bookDao.findBookByNo(borrow.getBookNo()).getInBase();
        InBase--;
        bookDao.updateInBase(InBase,borrow.getBookNo());
        return borrowDao.borrowBook(borrow)>=1;
    }

    public Date getBDate(String BookNo,String ReaderNo){
        return borrowDao.getBDate(BookNo,ReaderNo);
    }

    public void delOld(String BookNo,String ReaderNo)
    {
        InBase=bookDao.findBookByNo(BookNo).getInBase();
        InBase++;
        bookDao.updateInBase(InBase,BookNo);
        borrowDao.returnBook(BookNo,ReaderNo);
    }

}
