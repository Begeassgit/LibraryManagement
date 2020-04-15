package com.lib.Service.Admin;

import com.lib.Dao.AdminDao;
import com.lib.Entity.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminAccountService {
    private final AdminDao adminDao;

    @Autowired(required = false)
    public AdminAccountService(AdminDao adminDao){
        this.adminDao=adminDao;
    }

    public Admin loginAdminService(String UserNo,String Password){
        return adminDao.loginCheckAdminDao(UserNo, Password);
    }

    public boolean registerAdminService(Admin admin){
        return adminDao.registerAdminDao(admin)>=1;
    }
}
