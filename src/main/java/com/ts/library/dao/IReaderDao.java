package com.ts.library.dao;

import com.ts.library.entity.Reader;

import java.util.List;

/**
 * Created by ASpiralMoon on 2017/1/6.
 */
public interface IReaderDao {

    /**
     * 判断是否有相同的用户,
     * 用于登录和注册检测,以及登录后判断昵称是否为空
     *
     * @param reader Reader对象
     * @return Reader对象
     */
    Byte checkReader(Reader reader);

    /**
     * 新增Reader,用于注册Reader和管理员
     *
     * @param reader Reader对象
     * @return 影响数据库行数
     */
    int addReader(Reader reader);

    /**
     * 修改Reader,用于Reader修改密码和管理员修改用户信息
     *
     * @param reader Reader对象
     * @return 影响数据库行数
     */
    int editReader(Reader reader);

    /**
     * 根据传入的userId删除用户,用于管理员删除用户
     * (逻辑删除,做update操作,validity=0)
     *
     * @param userId 用户id
     * @return 影响数据库行数
     */
    int delReader(Short userId);

    /**
     * 查询Reader,用于查询所有数据和模糊查询
     *
     * @param reader Reader对象
     * @return List<Reader>
     */
    List<Reader> queryReader(Reader reader);
}
