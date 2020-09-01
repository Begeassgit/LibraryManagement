package com.lib.Dao;
/*
    Author:Yin
*/
import com.lib.Entity.Admin;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface AdminDao {
    /*管理员线上登录信息数据库查询，存在返回管理员信息，不存在返回NULL*/
    @Select("SELECT UserNo,UserName,Authority FROM [lib_db].dbo.admin_t" +
            " WHERE(UserNo=#{UserNo} AND Password=#{Password})")
    Admin loginCheckAdminDao(String UserNo,String Password);

    /*管理员注册数据库写入，成功返回大于1的值，失败返回小于1*/
    @Insert("INSERT INTO lib_db.dbo.admin_t(UserNo,UserName,Password,Authority)" +
            "VALUES(#{UserNo},#{UserName},#{Password},#{Authority})")
    int registerAdminDao(Admin admin);

    @Update("UPDATE lib_db.dbo.admin_t(Password=#{Password}) WHERE (UserNo=#{UserNo})")
    int resetPasswordAdminDao(String UserNo,String Password);
}
