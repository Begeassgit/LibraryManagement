package com.lib.Dao;
/*
    Author:Yin
*/
import com.lib.Entity.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BookDao {

    //书名查找
    @Select("SELECT * FROM lib_db.dbo.books_t WHERE (BookName LIKE #{BookName})")
    List<Book> findBookByName(String BookName);

    //作者名查找
    @Select("SELECT * FROM lib_db.dbo.books_t WHERE (Author LIKE #{Author})")
    List<Book> findBookByAuthor(String Author);

    @Select("SELECT * FROM lib_db.dbo.books_t WHERE (BType=#{BType})")
    List<Book> findBookByType(String BType);

    @Select("SELECT * FROM lib_db.dbo.books_t WHERE (RoomNo=#{RoomNo})")
    List<Book> findBookByRoom(String RoomNo);

    @Select("SELECT * FROM lib_db.dbo.books_t")
    List<Book> findAllBooks();
}
