package com.lib.Service.MainFunction;
/*
    Author:Yin
*/

import com.lib.Dao.BookDao;
import com.lib.Entity.Book;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookManageService {
    private final BookDao bookDao;

    @Autowired(required = false)
    public BookManageService(BookDao bookDao){
        this.bookDao=bookDao;
    }

    public List<Book> findBookByName(String BookName){
        return bookDao.findBookByName(BookName);
    }

    public List<Book> findBookByAuthor(String Author){
        return bookDao.findBookByAuthor(Author);
    }

    public List<Book> findBookByType(String Type){
        return bookDao.findBookByType(Type);
    }

    public List<Book> findBookByRoom(String RoomNo){
        return bookDao.findBookByRoom(RoomNo);
    }

    public List<Book> findAllBook(){return bookDao.findAllBooks();}

    public boolean addBook(Book book){
        return bookDao.addBook(book)>=1;
    }

    public XSSFWorkbook sheetOutPut(){
        List<Book> list=bookDao.findAllBooks();
        XSSFWorkbook wb=new XSSFWorkbook();
        Sheet sheet=wb.createSheet("Book");
        Row titleRow=sheet.createRow(0);
        titleRow.createCell(0).setCellValue("图书ISBN编号");
        titleRow.createCell(1).setCellValue("图书名称");
        titleRow.createCell(2).setCellValue("作者");
        titleRow.createCell(3).setCellValue("存放馆室");
        titleRow.createCell(4).setCellValue("出版信息");
        titleRow.createCell(5).setCellValue("类型");
        titleRow.createCell(6).setCellValue("库存量");
        int cell=1;
        for(Book book:list){
            Row row=sheet.createRow(cell);
            row.createCell(0).setCellValue(book.getBookNo());
            row.createCell(1).setCellValue(book.getBookName());
            row.createCell(2).setCellValue(book.getAuthor());
            row.createCell(3).setCellValue(book.getRoomNo());
            row.createCell(4).setCellValue(book.getPublicInfo());
            row.createCell(5).setCellValue(book.getBType());
            row.createCell(6).setCellValue(book.getInBase());
            cell++;
        }
        return wb;
    }
}
