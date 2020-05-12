package com.lib.Entity;

import java.util.Date;

public class Borrow {
    private String BookNo;
    private String ReaderNo;
    private String BookName;
    private String Author;
    private Date BDate;

    public String getBookNo() {
        return BookNo;
    }

    public void setBookNo(String bookNo) {
        BookNo = bookNo;
    }

    public String getReaderNo() {
        return ReaderNo;
    }

    public void setReaderNo(String readerNo) {
        ReaderNo = readerNo;
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

    public Date getBDate() {
        return BDate;
    }

    public void setBDate(Date BDate) {
        this.BDate = BDate;
    }
}
