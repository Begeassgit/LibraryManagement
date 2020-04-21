package com.lib.Service.MainPage;

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

    public List<Book> searchByName(String BookName){
        String getName="%"+BookName+"%";
        return bookDao.findBookByName(getName);
    }
}
