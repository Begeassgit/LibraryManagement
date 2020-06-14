package com.lib.Dao;
/*
    Author:Yin
*/
import com.lib.Entity.Cost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CostDao {

    //查询个人借阅记录
    @Select("SELECT * FROM lib_db.dbo.cost_t WHERE (ReaderNo=#{ReaderNo})")
    List<Cost> getBorrowHistory(String ReaderNo);

    @Select("SELECT COUNT(ReaderNO)FROM lib_db.dbo.cost_t WHERE(ReaderNo=#{ReaderNo})")
    int getHistoryCount(String ReaderNo);

    @Select("SELECT COUNT(ReaderNO)FROM [lib_db].dbo.cost_t WHERE(ReaderNo=#{ReaderNo} AND Money>0)")
    int getCostCount(String ReaderNo);
}
