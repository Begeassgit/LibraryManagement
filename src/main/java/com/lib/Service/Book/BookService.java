package com.lib.Service.Book;/*
    Author:Yin
*/

import com.lib.Dao.BookDao;
import com.lib.Entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    private final BookDao bookDao;

    @Autowired(required = false)
    public BookService(BookDao bookDao){
        this.bookDao=bookDao;
    }

    public Book getBook(String BookNo){
        return bookDao.findBookByNo(BookNo);
    }
}
