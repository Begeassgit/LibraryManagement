package com.lib.Service.MainFunction;
/*
    Author:Yin
*/

import com.lib.Dao.BookDao;
import com.lib.Entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookManageService {
    private final BookDao bookDao;

    @Autowired(required = false)
    public BookManageService(BookDao bookDao){
        this.bookDao=bookDao;
    }

    public List<Book> findBookByName(String BookName){
        return bookDao.findBookByName(BookName);
    }

    public List<Book> findBookByAuthor(String Author){
        return bookDao.findBookByAuthor(Author);
    }

    public List<Book> findBookByType(String Type){
        return bookDao.findBookByType(Type);
    }

    public List<Book> findBookByRoom(String RoomNo){
        return bookDao.findBookByRoom(RoomNo);
    }
}
