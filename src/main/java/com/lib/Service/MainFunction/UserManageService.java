package com.lib.Service.MainFunction;/*
    Author:Yin
*/

import com.lib.Dao.UserDao;
import com.lib.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserManageService {
    private final UserDao userDao;

    @Autowired(required = false)
    public UserManageService (UserDao userDao){
        this.userDao=userDao;
    }

    public List<User> getUserById(String ReaderNo){
        return userDao.getUserById(ReaderNo);
    }

    public boolean delOne(String ReaderNo){
        return userDao.delOne(ReaderNo)>=1;
    }
}
