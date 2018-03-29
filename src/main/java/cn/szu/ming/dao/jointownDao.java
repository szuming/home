package cn.szu.ming.dao;

import cn.szu.ming.entity.jointown;

public interface jointownDao {
    int deleteByPrimaryKey(Integer jid);

    int insert(jointown record);

    int insertSelective(jointown record);

    jointown selectByPrimaryKey(Integer jid);

    int updateByPrimaryKeySelective(jointown record);

    int updateByPrimaryKey(jointown record);
}