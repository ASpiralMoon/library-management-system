package com.ts.library.service;

import com.ts.library.entity.BorrowInfo;

import java.util.List;

/**
 * Created by ASpiralMoon on 2017/1/7.
 */
public interface IBorrowInfoService {

    /**
     * 租书
     *
     * @param borrowInfo
     * @return
     */
    boolean addInfo(BorrowInfo borrowInfo);

    /**
     * 还书
     *
     * @param infoId
     * @return
     */
    boolean delInfo(Short infoId);

    /**
     * 查询所有租书信息,包括模糊查询
     *
     * @param borrowInfo
     * @return
     */
    List<BorrowInfo> queryInfo(BorrowInfo borrowInfo);

    /**
     * 同意租书
     *
     * @param infoId
     * @return
     */
    boolean editInfo(Short infoId);

    /**
     * 拒绝租书
     *
     * @param infoId
     * @return
     */
    boolean refuseInfo(Short infoId);
}
