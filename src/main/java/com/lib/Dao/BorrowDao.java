package com.lib.Dao;
/*
    Author:Yin
*/
import com.lib.Entity.Borrow;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface BorrowDao {
    @Select("SELECT * FROM lib_db.dbo.borrow_t WHERE (BookNo=#{BookNo} AND ReaderNo=#{ReaderNo})")
    Borrow getMy();

}
