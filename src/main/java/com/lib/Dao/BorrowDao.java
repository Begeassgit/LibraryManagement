package com.lib.Dao;
/*
    Author:Yin
*/
import com.lib.Entity.Borrow;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BorrowDao {

    //查看正在借阅
    @Select("SELECT * FROM [lib_db].dbo.borrow_t WHERE (ReaderNo=#{ReaderNo})")
    List<Borrow> getMyBorrow(String ReaderNo);

    //还书时删除借阅单
    @Delete("DELETE [lib_db].dbo.borrow_t WHERE (BookNo=#{BookNo} AND ReaderNo=#{ReaderNo})")
    int returnBook(String BookNo,String ReaderNo);

    //借阅图书生成借阅单
    @Insert("INSERT INTO [lib_db].dbo.borrow_t(BookNo,ReaderNo,BookName,Author,BDate)" +
            "VALUES(#{BookNo},#{ReaderNo},#{BookName},#{Author},#{BDate})")
    int borrowBook(Borrow borrow);

    @Select("SELECT COUNT(ReaderNo) FROM [lib_db].dbo.borrow_t WHERE (ReaderNo=#{ReaderNo})")
    int getReadingNow(String ReaderNo);


}
