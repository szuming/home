package cn.szu.ming.dao;

import cn.szu.ming.entity.htown;

import java.util.List;

public interface htownMapper {
    int deleteByPrimaryKey(Integer hid);

    int insert(htown record);

    int insertSelective(htown record);

    htown selectByPrimaryKey(Integer hid);

    int updateByPrimaryKeySelective(htown record);

    int updateByPrimaryKey(htown record);

    List<htown> selectAllTowns();

    //---diy-----
    htown selectByHname(String hname);
    htown selectByHid(int hid);
    htown selectByUid(int uhid);
    void updateHtown(htown htown1);
}