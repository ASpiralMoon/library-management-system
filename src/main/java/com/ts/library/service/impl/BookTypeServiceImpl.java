package com.ts.library.service.impl;

import com.ts.library.dao.IBookTypeDao;
import com.ts.library.entity.BookType;
import com.ts.library.service.IBookTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ASpiralMoon on 2017/1/7.
 */
@Service
public class BookTypeServiceImpl implements IBookTypeService{

    @Autowired
    private IBookTypeDao iBookTypeDao;

    @Override
    public List<BookType> queryAllType() {
        List<BookType> list = iBookTypeDao.queryAllType();
        return list;
    }
}
