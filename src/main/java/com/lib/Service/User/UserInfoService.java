package com.lib.Service.User;

import com.lib.Dao.UserDao;
import com.lib.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoService {
    private final UserDao userDao;

    @Autowired(required = false)
    public UserInfoService(UserDao userDao){
        this.userDao=userDao;
    }

    public User getUserInfoService(String ReaderNo){
        return userDao.getInfoDao(ReaderNo);
    }
}
