package com.lib.Entity;
/*
    Author:Yin
*/
public class Room {
    private String RoomNo;
    private String RoomUserNo;
    private String RoomName;
    private String RoomAddress;
    private String Tel;
    private String Time;
    private String TimeSep;

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }

    public String getTimeSep() {
        return TimeSep;
    }

    public void setTimeSep(String timeSep) {
        TimeSep = timeSep;
    }

    public String getRoomNo() {
        return RoomNo;
    }

    public void setRoomNo(String roomNo) {
        RoomNo = roomNo;
    }

    public String getRoomUserNo() {
        return RoomUserNo;
    }

    public void setRoomUserNo(String roomUserNo) {
        RoomUserNo = roomUserNo;
    }

    public String getRoomName() {
        return RoomName;
    }

    public void setRoomName(String roomName) {
        RoomName = roomName;
    }

    public String getRoomAddress() {
        return RoomAddress;
    }

    public void setRoomAddress(String roomAddress) {
        RoomAddress = roomAddress;
    }

    public String getTel() {
        return Tel;
    }

    public void setTel(String tel) {
        Tel = tel;
    }
}
