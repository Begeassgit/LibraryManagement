package com.lib.Service.MainFunction;
/*
    Author:Yin
*/

import com.lib.Dao.AdminDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminPageService {

    private final AdminDao adminDao;

    @Autowired(required = false)
    public AdminPageService(AdminDao adminDao){
        this.adminDao=adminDao;
    }
}
