package cn.szu.ming.dao;

import cn.szu.ming.entity.htown;

public interface htownMapper {
    int deleteByPrimaryKey(Integer hid);

    int insert(htown record);

    int insertSelective(htown record);

    htown selectByPrimaryKey(Integer hid);

    int updateByPrimaryKeySelective(htown record);

    int updateByPrimaryKey(htown record);
}