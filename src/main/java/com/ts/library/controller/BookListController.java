package com.ts.library.controller;

import com.ts.library.entity.Book;
import com.ts.library.entity.BookType;
import com.ts.library.service.IBookService;
import com.ts.library.service.IBookTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ASpiralMoon on 2017/1/7.
 * 图书显示列表控制层,管理员可见
 */
@Controller
@RequestMapping("/bookListController")
public class BookListController  {

    @Autowired
    private IBookService iBookService;
    @Autowired
    private IBookTypeService iBookTypeService;

    Map<String,Object> map;

    /**
     * 查询所有图书信息
     */
    @ResponseBody
    @RequestMapping("/queryAllBook")
    public List<Book> queryAllBook() {
        Book book = new Book();
        List<Book> list = iBookService.queryBook(book);
        List<BookType> bookTypeList = iBookTypeService.queryAllType();
        map.put("type", bookTypeList);
        return list;
    }

    /**
     * 根据条件查询图书信息
     */
    @ResponseBody
    @RequestMapping("/queryBookByParam")
    public List<Book> queryBookByParam(@RequestBody Book book) {
        List<Book> list = iBookService.queryBook(book);
        return list;
    }

    /**
     * 查询所有图书类别
     */
    @ResponseBody
    @RequestMapping("/queryAllType")
    public List<BookType> queryAllType() {
        Book book = new Book();
        List<BookType> list = iBookTypeService.queryAllType();
        return list;
    }

    /**
     * 管理员增加图书
     */
    @ResponseBody
    @RequestMapping("/addBook")
    public Map<String,Object> addBook(@RequestBody Book book) {
        boolean msg = iBookService.addBook(book);
        map = new HashMap<>();
        map.put("msg", msg);
        return map;
    }

    /**
     * 管理员编辑图书
     */
    @ResponseBody
    @RequestMapping("/editBook")
    public Map<String,Object> editBook(@RequestBody Book book) {
        boolean msg = iBookService.editBook(book);
        map = new HashMap<>();
        map.put("msg", msg);
        return map;
    }

    /**
     * 管理员删除图书
     */
    @ResponseBody
    @RequestMapping("/delBook")
    public Map<String,Object> delBook(@RequestParam Short bookId) {
        boolean msg = iBookService.delBook(bookId);
        map = new HashMap<>();
        map.put("msg", msg);
        return map;
    }
}
