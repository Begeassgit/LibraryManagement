package com.lib.Dao;

import com.lib.Entity.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BookDao {
    @Select("SELECT * FROM lib_db.dbo.books_t WHERE (BookName=#{BookName})")
    List<Book> findBookByName(String BookName);

    @Select("SELECT * FROM lib_db.dbo.books_t WHERE (Author=#{Author})")
    List<Book> findBookByAuthor(String Author);
}
