package com.lib.Service.Room;
/*
    Author:Yin
*/
import com.lib.Dao.RoomDao;
import com.lib.Entity.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomService {
    private final RoomDao roomDao;

    @Autowired(required=false)
    public RoomService(RoomDao roomDao){
        this.roomDao=roomDao;
    }

    /*查询馆室信息*/
    public List<Room> getRoomInfo(){
        return roomDao.getRoomInfo();
    }
}
