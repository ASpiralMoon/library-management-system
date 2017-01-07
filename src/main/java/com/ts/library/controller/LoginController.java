package com.ts.library.controller;

import com.ts.library.entity.Reader;
import com.ts.library.service.IReaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * Created by ASpiralMoon on 2017/1/7.
 * 登录页面控制层
 */
@Controller
@RequestMapping("/loginController")
public class LoginController {

    @Autowired
    private IReaderService iReaderService;

    /**
     * 登录
     */
    @ResponseBody
    @RequestMapping("/login")
    public Map<String,Object> login(@RequestBody Reader reader) {
        return iReaderService.checkUser(reader);
    }

}
