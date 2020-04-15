package com.lib.Dao;

import com.lib.Entity.Admin;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface AdminDao {
    @Select("")
    Admin LoginCheckAdminDao();
    @Insert("")
    int registerAdminDao();
}
