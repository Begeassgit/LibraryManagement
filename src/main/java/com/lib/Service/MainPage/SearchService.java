package com.lib.Service.MainPage;
/*
    Author:Yin
*/
import com.lib.Dao.BookDao;
import com.lib.Entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchService {
    private final BookDao bookDao;

    @Autowired(required = false)
    public SearchService(BookDao bookDao){
        this.bookDao=bookDao;
    }

    //按书名模糊查找
    public List<Book> searchByName(String BookName){
        String getName="%"+BookName+"%";
        return bookDao.findBookByName(getName);
    }

    //按作者模糊查找
    public List<Book> searchByAuthor(String Author){
        String getAuthor="%"+Author+"%";
        return bookDao.findBookByAuthor(getAuthor);
    }


}
