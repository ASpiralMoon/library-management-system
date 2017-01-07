package com.ts.library.dao;

import com.ts.library.entity.Book;

import java.util.List;

/**
 * Created by ASpiralMoon on 2017/1/6.
 */
public interface IBookDao {

    /**
     * 判断是否有相同的书籍,用于新增书籍时候的检查
     *
     * @param book Book对象
     * @return Reader对象
     */
    Short checkBook(Book book);

    /**
     * 新增Book,用于管理员新增Book
     *
     * @param book Book对象
     * @return 影响数据库行数
     */
    int addBook(Book book);

    /**
     * 修改Book,用于管理员修改Book信息
     *
     * @param book Book对象
     * @return 影响数据库行数
     */
    int editBook(Book book);

    /**
     * 书籍存量+1,用于读者归还书籍之后还原书籍信息
     *
     * @param bookId 图书id
     * @return 影响数据库行数
     */
    int addBookStock(Short bookId);

    /**
     * 书籍存量-1,用于管理员审批读者借阅书籍之后更新书籍信息
     *
     * @param title 图书title
     * @return 影响数据库行数
     */
    int reduceBookStock(String title);

    /**
     * 根据传入的bookId删除用户,用于管理员删除Book
     * (逻辑删除,做update操作,validity=0)
     *
     * @param bookId 图书id
     * @return 影响数据库行数
     */
    int delBook(Short bookId);

    /**
     * 查询Book,用于查询所有数据和模糊查询
     *
     * @param book Book对象
     * @return List<Book>
     */
    List<Book> queryBook(Book book);

}
