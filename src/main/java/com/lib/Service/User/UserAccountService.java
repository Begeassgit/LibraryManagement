package com.lib.Service.User;

import com.lib.Dao.UserDao;
import com.lib.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserAccountService {

    private final UserDao userDao;

    @Autowired(required = false)
    public UserAccountService(UserDao userDao){
        this.userDao=userDao;
    }

    public User loginService(String ReaderNo,String Password){
        return userDao.loginCheckDao(ReaderNo,Password);
    }

    public boolean registerService(User user){
        return userDao.registerDao(user)>=1;
    }
}
