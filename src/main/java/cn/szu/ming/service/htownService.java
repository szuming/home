package cn.szu.ming.service;

import cn.szu.ming.entity.htown;

import java.util.List;

public interface htownService {
    public List<htown> getHtowns();

    //新增同乡会
    public void addTown(htown htown1);
    public htown getTown(String hname);
}
