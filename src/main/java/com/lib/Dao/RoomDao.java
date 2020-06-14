package com.lib.Dao;
/*
    Author:Yin
*/
import com.lib.Entity.Room;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface RoomDao {
    //查询馆室信息
    @Select("SELECT * FROM [lib_db].dbo.room_t")
    List<Room>getRoomInfo();

    //更新普通馆室信息
    @Update("UPDATE [lib_db].dbo.room_t SET RoomName=#{RoomName},Tel=#{Tel},RoomUserNo=#{RoomUserNo} WHERE RoomNo=#{RoomNo}")
    int updateNormalRoom(String RoomName,String Tel,String RoomUserNo,String RoomNo);

    //更新图书馆信息
    @Update("UPDATE [lib_db].dbo.room_t SET RoomName=#{RoomName},RoomAddress=#{RoomAddress},Tel=#{Tel},RoomUserNo=#{RoomUserNo},Time=#{Time},TimeSep=#{TimeSqp} WHERE RoomNo=#{RoomNo}")
    int updateLibraryInfo(Room room);
}
