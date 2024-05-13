package com.Bookstoremanagement.BookStoreManagement;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "book_store_info")
public class bookdetails {
    @Id
    private String bookid;
    private String bookname;
    private String Author;
    private String price;
    private String Action;
    public bookdetails() {
    }
    public bookdetails(String bookid, String bookname, String author, String price, String action) {
        this.bookid = bookid;
        this.bookname = bookname;
        Author = author;
        this.price = price;
        Action = action;
    }
    public String getBookid() {
        return bookid;
    }
    public void setBookid(String bookid) {
        this.bookid = bookid;
    }
    public String getBookname() {
        return bookname;
    }
    public void setBookname(String bookname) {
        this.bookname = bookname;
    }
    public String getAuthor() {
        return Author;
    }
    public void setAuthor(String author) {
        Author = author;
    }
    public String getPrice() {
        return price;
    }
    public void setPrice(String price) {
        this.price = price;
    }
    public String getAction() {
        return Action;
    }
    public void setAction(String action) {
        Action = action;
    }
}
