package com.lib.Dao;
/*
    Author:Yin
*/
import com.lib.Entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserDao {
    /*读者线上登录信息数据库查询，存在返回读者信息，不存在返回NULL*/
    @Select("SELECT ReaderNo,ReaderName,Identities FROM lib_db.dbo.user_t " +
            "WHERE (ReaderNo=#{ReaderNo} AND Password=#{Password})")
    User loginCheckDao(String ReaderNo,String Password);

    /*读者注册数据库写入，成功返回大于1的值，失败返回小于1*/
    @Insert("INSERT INTO lib_db.dbo.user_t(ReaderNo,ReaderName,Age,Sex,Number,Identities,Password)" +
            "VALUES(#{ReaderNo},#{ReaderName},#{Age},#{Sex},#{Number},#{Identities},#{Password})")
    int registerDao(User user);

    @Update("UPDATE lib_db.dbo.user_t SET(Password=#{Password}) WHERE (ReaderNo=#{ReaderNo})")
    int resetPasswordDao(String ReaderNo,String Password);

    @Select("SELECT * FROM lib_db.dbo.user_t WHERE(ReaderNo=#{ReaderNo})")
    User getInfoDao(String ReaderNo);

    @Update("UPDATE lib_db.dbo.user_t SET Age=#{Age},Sex=#{Sex},Identities=#{identities} WHERE (ReaderNo=#{ReaderNo})")
    int updateInfo(short Age,String Sex,String identities,String ReaderNo);

    @Select("SELECT * FROM lib_db.dbo.user_t WHERE (ReaderNo=#{ReaderNo})")
    List<User> getUserById(String ReaderNo);

    @Delete("DELETE FROM lib_db.dbo.user_t WHERE (ReaderNo=#{ReaderNo})")
    int delOne(String ReaderNo);

}
