package com.ts.library.dao;

import com.ts.library.entity.BorrowInfo;

import java.util.List;

/**
 * Created by ASpiralMoon on 2017/1/6.
 */
public interface IBorrowInfoDao {

    /**
     * 新增租借信息,用于用户申请租借书籍后添加租借记录,
     * name = reader.nickname,
     * title = book.title
     * apply_borrowing_time=curdate(),
     * borrowing_status=待审核
     *
     * @param borrowInfo BorrowInfo对象
     * @return 影响数据库行数
     */
    int addInfo(BorrowInfo borrowInfo);

    /**
     * 更新租借记录,用于管理员审批之后更新信息
     * approval_borrowing_time=curdate(),
     * borrowing_status=租借ing
     *
     * @param infoId 记录id
     * @return 影响数据库行数
     */
    int editInfo(Short infoId);

    /**
     * 更新租借记录,用于管理员拒绝申请之后更新信息
     * borrowing_status=已拒绝
     *
     * @param infoId 记录id
     * @return 影响数据库行数
     */
    int refuseInfo(Short infoId);

    /**
     * 根据info_id删除租借记录,用于用户归还书籍后删除租借记录
     * (逻辑删除,做update操作,borrowing_status=已归还,return_time=curdate())
     *
     * @param infoId 记录id
     * @return 影响数据库行数
     */
    int delInfo(Short infoId);

    /**
     * 根据参数查询info,包括查询总的和模糊查询
     *
     * @param borrowInfo BorrowInfo对象
     * @return List<BorrowInfo>
     */
    List<BorrowInfo> queryAllInfo(BorrowInfo borrowInfo);

}
