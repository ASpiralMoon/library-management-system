package com.ts.library.controller;

import com.ts.library.entity.Book;
import com.ts.library.entity.BorrowInfo;
import com.ts.library.service.IBookService;
import com.ts.library.service.IBorrowInfoService;
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
 * 租借信息列表页,读者可见
 */
@Controller
@RequestMapping("/borrowListController")
public class BorrowListController {

    @Autowired
    private IBookService iBookService;
    @Autowired
    private IBorrowInfoService iBorrowInfoService;

    Map<String, Object> map;

    /**
     * 查看所有书籍
     */
    @ResponseBody
    @RequestMapping("/queryAllBook")
    public List<Book> queryAllBook() {
        Book book = new Book();
        List<Book> list = iBookService.queryBook(book);
        return list;
    }

    /**
     * 模糊查询书籍信息
     */
    @ResponseBody
    @RequestMapping("/queryByParam")
    public List<Book> queryByParam(@RequestBody Book book) {
        List<Book> list = iBookService.queryBook(book);
        return list;
    }

    /**
     * 申请借阅书籍
     */
    @ResponseBody
    @RequestMapping("/borrowBook")
    public Map<String, Object> borrowBook(@RequestBody BorrowInfo borrowInfo) {
        boolean msg1 = iBorrowInfoService.addInfo(borrowInfo);
        boolean msg2 = iBookService.reduceBookStock(borrowInfo.getTitle());
        map = new HashMap<>();
        if (msg1 && msg2) {
            map.put("msg", true);
        } else {
            map.put("msg", false);
        }
        return map;
    }

    /**
     * 归还书籍
     */
    @ResponseBody
    @RequestMapping("/returnBook")
    public Map<String, Object> returnBook(@RequestParam Short infoId,@RequestParam Short bookId) {
        boolean msg1 = iBorrowInfoService.delInfo(infoId);
        boolean msg2 = iBookService.addBookStock(bookId);
        map = new HashMap<>();
        if (msg1 && msg2) {
            map.put("msg", true);
        } else {
            map.put("msg", false);
        }
        return map;
    }

}
