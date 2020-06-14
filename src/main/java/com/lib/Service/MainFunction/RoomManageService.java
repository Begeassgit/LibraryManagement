package com.lib.Service.MainFunction;/*
    Author:Yin
*/

import com.lib.Dao.RoomDao;
import com.lib.Entity.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomManageService {
    private final RoomDao roomDao;

    @Autowired(required = false)
    public RoomManageService(RoomDao roomDao){
        this.roomDao=roomDao;
    }

    public List<Room> getAllRoom(){
        return roomDao.getRoomInfo();
    }


}
