package com.lib.Entity;
/*
    Author:Yin
*/
public class Book {
    private String BookNo;
    private String BookName;
    private String Author;
    private String RoomNo;
    private String PublicInfo;
    private String BType;
    private int InBase;

    public String getBookNo() {
        return BookNo;
    }

    public void setBookNo(String bookNo) {
        BookNo = bookNo;
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getRoomNo() {
        return RoomNo;
    }

    public void setRoomNo(String roomNo) {
        RoomNo = roomNo;
    }

    public String getPublicInfo() {
        return PublicInfo;
    }

    public void setPublicInfo(String publicInfo) {
        PublicInfo = publicInfo;
    }

    public String getBType() {
        return BType;
    }

    public void setBType(String BType) {
        this.BType = BType;
    }

    public int getInBase() {
        return InBase;
    }

    public void setInBase(int inBase) {
        InBase = inBase;
    }
}
