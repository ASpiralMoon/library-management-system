package com.ts.library.entity;

import java.util.Date;

/**
 * Created by ASpiralMoon on 2017/1/6.
 * 图书实体类
 */
public class Book {

    private Short bookId;
    private String title;
    private String author;
    private String press;
    private Byte typeId;
    private Short amount;
    private Short stock;
    private Date lastUpdatedTime;
    private Byte validity;
    private String type;

    public Short getBookId() {
        return bookId;
    }

    public void setBookId(Short bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }

    public Byte getTypeId() {
        return typeId;
    }

    public void setTypeId(Byte typeId) {
        this.typeId = typeId;
    }

    public Short getAmount() {
        return amount;
    }

    public void setAmount(Short amount) {
        this.amount = amount;
    }

    public Short getStock() {
        return stock;
    }

    public void setStock(Short stock) {
        this.stock = stock;
    }

    public Date getLastUpdatedTime() {
        return lastUpdatedTime;
    }

    public void setLastUpdatedTime(Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    public Byte getValidity() {
        return validity;
    }

    public void setValidity(Byte validity) {
        this.validity = validity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", press='" + press + '\'' +
                ", typeId=" + typeId +
                ", amount=" + amount +
                ", stock=" + stock +
                ", lastUpdatedTime=" + lastUpdatedTime +
                ", validity=" + validity +
                ", type='" + type + '\'' +
                '}';
    }
}
