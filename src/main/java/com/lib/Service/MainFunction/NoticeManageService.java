package com.lib.Service.MainFunction;/*
    Author:Yin
*/

import com.lib.Dao.NoticeDao;
import com.lib.Entity.Notice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoticeManageService {
    private final NoticeDao noticeDao;

    @Autowired(required = false)
    public NoticeManageService(NoticeDao noticeDao){
        this.noticeDao=noticeDao;
    }

    public List<Notice> getAllNotice(){
        return noticeDao.getNotice();
    }

    public boolean updateNotice(int  NoticeNo,String Notice,String NoticeTitle){
        return noticeDao.updateNotice(Notice, NoticeTitle, NoticeNo)>=1;
    }
}
