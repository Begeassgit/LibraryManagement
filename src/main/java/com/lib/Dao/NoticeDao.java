package com.lib.Dao;
/*
    Author:Yin
*/

import com.lib.Entity.Notice;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface NoticeDao {
    @Select("SELECT * FROM lib_db.dbo.notice_t")
    List<Notice> getNotice();

    @Update("UPDATE lib_db.dbo.notice_t SET NoticeTitle=#{NoticeTitle},Notice=#{Notice} WHERE NoticeNo=#{NoticeNo}")
    int updateNotice(String Notice,String NoticeTitle,int NoticeNo);
}
