package com.lib.Dao;
/*
    Author:Yin
*/

import com.lib.Entity.Notice;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface NoticeDao {
    @Select("SELECT * FROM lib_db.dbo.notice_t")
    List<Notice> getNotice();
}
