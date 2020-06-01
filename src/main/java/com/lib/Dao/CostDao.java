package com.lib.Dao;

import com.lib.Entity.Cost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CostDao {
    @Select("SELECT * FROM lib_db.dbo.cost_t WHERE (ReaderNo=#{ReaderNo})")
    List<Cost> getBorrowHistory(String ReaderNo);
}
