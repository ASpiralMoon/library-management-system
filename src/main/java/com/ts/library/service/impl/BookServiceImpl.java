package com.ts.library.service.impl;

import com.ts.library.dao.IBookDao;
import com.ts.library.entity.Book;
import com.ts.library.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ASpiralMoon on 2017/1/7.
 */
@Service
public class BookServiceImpl implements IBookService {

    @Autowired
    private IBookDao iBookDao;

    int i = 0;

    @Override
    public boolean checkBook(Book book) {
        Short a = iBookDao.checkBook(book);
        if (a != null) {
            return true;
        }
        return false;
    }

    @Override
    public List<Book> queryBook(Book book) {
        List<Book> list = iBookDao.queryBook(book);
        return list;
    }

    @Override
    public boolean addBook(Book book) {
        i = iBookDao.addBook(book);
        if (i == 1) {
            return true;
        }
        return false;
    }

    @Override
    public boolean editBook(Book book) {
        i = iBookDao.editBook(book);
        if (i == 1) {
            return true;
        }
        return false;
    }

    @Override
    public boolean delBook(Short bookId) {
        i = iBookDao.delBook(bookId);
        if (i == 1) {
            return true;
        }
        return false;
    }

    @Override
    public boolean addBookStock(Short bookId) {
        i = iBookDao.addBookStock(bookId);
        if (i == 1) {
            return true;
        }
        return false;
    }

    @Override
    public boolean reduceBookStock(String title) {
        i = iBookDao.reduceBookStock(title);
        if (i == 1) {
            return true;
        }
        return false;
    }
}
