package com.lib.Dao;

import com.lib.Entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserDao {
    @Select("Select ReaderNo,ReaderName,Identities FROM lib_db.dbo.user_t" +
            "WHERE (ReaderNo=#{ReaderNo} AND ")
    User LoginCheckDao();
    @Insert("")
    int RegisterDao();

}
