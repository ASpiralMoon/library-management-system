package com.ts.library.service.impl;

import com.ts.library.dao.IReaderDao;
import com.ts.library.entity.Reader;
import com.ts.library.service.IReaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ASpiralMoon on 2017/1/7.
 */
@Service
public class ReaderServiceImpl implements IReaderService{

    @Autowired
    private IReaderDao iReaderDao;

    @Override
    public Map<String, Object> checkUser(Reader reader) {
        Map<String, Object> map = new HashMap<>();
        Byte a = iReaderDao.checkReader(reader);
        if (a != null && a == (byte) 1) {
            map.put("login", true);
            map.put("administrator", true);
            return map;
        } else if (a != null && a == (byte) 0) {
            map.put("login", true);
            map.put("administrator", false);
            return map;
        }
        map.put("login", false);
        map.put("administrator", false);
        return map;
    }

    @Override
    public List<Reader> queryReader(Reader reader) {
        List<Reader> list = iReaderDao.queryReader(reader);
        return list;
    }

    @Override
    public boolean addReader(Reader reader) {
        int i = iReaderDao.addReader(reader);
        if (i == 1) {
            return true;
        }
        return false;
    }

    @Override
    public boolean editReader(Reader reader) {
        int i = iReaderDao.editReader(reader);
        if (i == 1) {
            return true;
        }
        return false;
    }

    @Override
    public boolean delReader(Short userId) {
        int i = iReaderDao.delReader(userId);
        if (i == 1) {
            return true;
        }
        return false;
    }
}
