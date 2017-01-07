package com.ts.library.controller;

import com.ts.library.entity.BorrowInfo;
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
 */
@Controller
@RequestMapping("/borrowInfoController")
public class BorrowInfoController {

    @Autowired
    private IBorrowInfoService iBorrowInfoService;

    Map<String,Object> map;

    /**
     * 查询所有待审核租借信息
     */
    @ResponseBody
    @RequestMapping("/queryAllBorrowInfo")
    public List<BorrowInfo> queryAllBorrowInfo(@RequestBody BorrowInfo borrowInfo){
        List<BorrowInfo> list = iBorrowInfoService.queryInfo(borrowInfo);
        return list;
    }

    /**
     * 同意租借
     */
    @ResponseBody
    @RequestMapping("/approvalBorrowInfo")
    public Map<String,Object> approvalBorrowInfo(@RequestParam Short infoId){
        boolean msg = iBorrowInfoService.editInfo(infoId);
        map = new HashMap<>();
        map.put("msg", msg);
        return map;
    }

    /**
     * 拒绝租借
     */
    @ResponseBody
    @RequestMapping("/refuseBorrowInfo")
    public Map<String,Object> refuseBorrowInfo(@RequestParam Short infoId){
        boolean msg = iBorrowInfoService.refuseInfo(infoId);
        map = new HashMap<>();
        map.put("msg", msg);
        return map;
    }


}
