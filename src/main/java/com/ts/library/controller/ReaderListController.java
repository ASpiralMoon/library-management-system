package com.ts.library.controller;

import com.ts.library.entity.Reader;
import com.ts.library.service.IReaderService;
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
 * 读者列表页控制层,管理员可见
 */
@Controller
@RequestMapping("/readerListController")
public class ReaderListController {

    @Autowired
    private IReaderService iReaderService;
    Map<String, Object> map;

    /**
     * 查询所有Reader
     */
    @ResponseBody
    @RequestMapping("/queryAllReader")
    public List<Reader> queryAllReader() {
        Reader reader = new Reader();
        List<Reader> list = iReaderService.queryReader(reader);
        return list;
    }

    /**
     * 根据条件模糊查询Reader
     */
    @ResponseBody
    @RequestMapping("/queryByParam")
    public List<Reader> queryByParam(@RequestBody Reader reader) {
        List<Reader> list = iReaderService.queryReader(reader);
        return list;
    }

    /**
     * 管理员增加Reader,Reader注册
     */
    @ResponseBody
    @RequestMapping("/addReader")
    public Map<String, Object> addReader(@RequestBody Reader reader) {
        boolean msg = iReaderService.addReader(reader);
        map = new HashMap<>();
        map.put("msg", msg);
        return map;
    }

    /**
     * 管理员修改Reader
     */
    @ResponseBody
    @RequestMapping("/editReader")
    public Map<String, Object> editReader(@RequestBody Reader reader) {
        boolean msg = iReaderService.editReader(reader);
        map = new HashMap<>();
        map.put("msg", msg);
        return map;
    }

    /**
     * 管理员删除Reader
     */
    @ResponseBody
    @RequestMapping("/delReader")
    public Map<String, Object> delReader(@RequestParam Short userId) {
        boolean msg = iReaderService.delReader(userId);
        map = new HashMap<>();
        map.put("msg", msg);
        return map;
    }


}
