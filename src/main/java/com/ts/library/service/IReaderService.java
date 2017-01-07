package com.ts.library.service;

import com.ts.library.entity.Reader;

import java.util.List;
import java.util.Map;

/**
 * Created by ASpiralMoon on 2017/1/7.
 */
public interface IReaderService {

    /**
     * 登录检查
     *
     * @param reader Reader对象
     * @return Map<String, Object>
     */
    Map<String, Object> checkUser(Reader reader);

    List<Reader> queryReader(Reader reader);

    boolean addReader(Reader reader);

    boolean editReader(Reader reader);

    boolean delReader(Short userId);
}
