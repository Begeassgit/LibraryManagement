package com.lib.Service.User;
/*
    Author:Yin
*/
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

    public boolean registerService(String ReaderNo,String Number,String Password){
        User user=new User();
        user.setReaderNo(ReaderNo);
        user.setNumber(Number);
        user.setPassword(Password);
        return userDao.registerDao(user)>=1;
    }

    public boolean resetPasswordService(String ReaderNo,String Password){
        return userDao.resetPasswordDao(ReaderNo, Password)>=1;
    }

    public User getUserInfoService(String ReaderNo){
        return userDao.getInfoDao(ReaderNo);
    }
}
