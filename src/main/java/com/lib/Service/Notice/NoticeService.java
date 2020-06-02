package com.lib.Service.Notice;
/*
    Author:Yin
*/

import com.lib.Dao.NoticeDao;
import com.lib.Entity.Notice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoticeService {
    private final NoticeDao noticeDao;

    @Autowired(required = false)
    public NoticeService(NoticeDao noticeDao){
        this.noticeDao=noticeDao;
    }

    public List<Notice> getNoticeInfoService(){
        return noticeDao.getNotice();
    }
}
