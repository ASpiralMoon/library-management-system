package com.ts.library.service.impl;

import com.ts.library.dao.IBorrowInfoDao;
import com.ts.library.entity.BorrowInfo;
import com.ts.library.service.IBorrowInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ASpiralMoon on 2017/1/7.
 */
@Service
public class BorrowInfoServiceImpl implements IBorrowInfoService {

    @Autowired
    private IBorrowInfoDao iBorrowInfoDao;

    @Override
    public boolean addInfo(BorrowInfo borrowInfo) {
        int i = iBorrowInfoDao.addInfo(borrowInfo);

        if (i == 1) {
            return true;
        }
        return false;
    }

    @Override
    public boolean delInfo(Short infoId) {
        int i = iBorrowInfoDao.delInfo(infoId);
        if (i == 1) {
            return true;
        }
        return false;
    }

    @Override
    public List<BorrowInfo> queryInfo(BorrowInfo borrowInfo) {
        List<BorrowInfo> list = iBorrowInfoDao.queryAllInfo(borrowInfo);
        return list;
    }

    @Override
    public boolean editInfo(Short infoId) {
        int i = iBorrowInfoDao.editInfo(infoId);
        if (i == 1) {
            return true;
        }
        return false;
    }

    @Override
    public boolean refuseInfo(Short infoId) {
        int i = iBorrowInfoDao.refuseInfo(infoId);
        if (i == 1) {
            return true;
        }
        return false;
    }
}
