package cn.szu.ming.service;

import cn.szu.ming.entity.htown;

import java.util.List;

public interface htownService {
    public List<htown> getHtowns(int pageNum,int pageSize);

    //新增同乡会
    public void addTown(htown htown1);
    //根据hname查询htown
    public htown getTown(String hname);
    //根据hid查询htown
    public htown getTown(int hid);
    //根据uhid查询htown
    public htown getTownByUid(int uid);
    //更新同乡会信息
    public void updateHtown(htown htown1);
}
