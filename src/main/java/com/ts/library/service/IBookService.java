package com.ts.library.service;

import com.ts.library.entity.Book;

import java.util.List;

/**
 * Created by ASpiralMoon on 2017/1/7.
 */
public interface IBookService {

    boolean checkBook(Book book);

    List<Book> queryBook(Book book);

    boolean addBook(Book book);

    boolean editBook(Book book);

    boolean delBook(Short bookId);

    boolean addBookStock(Short bookId);

    boolean reduceBookStock(String title);
}
