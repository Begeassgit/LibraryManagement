package com.lib.Dao;
/*
    Author:Yin
*/
import com.lib.Entity.Room;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface RoomDao {
    @Select("SELECT * FROM [lib_db].dbo.room_t")
    List<Room>getRoomInfo();//查询馆室信息
}
