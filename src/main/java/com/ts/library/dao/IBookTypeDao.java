package com.ts.library.dao;

import com.ts.library.entity.BookType;

import java.util.List;

/**
 * Created by ASpiralMoon on 2017/1/6.
 */
public interface IBookTypeDao {

    /**
     * 查询所有的type
     *
     * @return List<BookType>
     */
    List<BookType> queryAllType();

}
