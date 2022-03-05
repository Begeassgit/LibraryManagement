package com.lib.Service.User;
/*
    Author:Yin
*/
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

    public boolean updateUserInfo(short Age,String Sex,String Identities,String ReaderNo,String ReaderName){
        return userDao.updateInfo(Age,Sex,Identities,ReaderNo,ReaderName)>=1;
    }
}
