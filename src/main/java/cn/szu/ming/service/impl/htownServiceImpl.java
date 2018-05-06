package cn.szu.ming.service.impl;

import cn.szu.ming.dao.htownMapper;
import cn.szu.ming.entity.htown;
import cn.szu.ming.service.htownService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class htownServiceImpl implements htownService {

    private static Logger logger = Logger.getLogger(htownServiceImpl.class.getName());

    @Autowired
    htownMapper htownMapper1;

    @Override
    public List<htown> getHtowns(int pageNum,int pageSize) {
        List<htown> list;
        PageHelper.startPage(pageNum,pageSize);
        list=htownMapper1.selectAllTowns();
        return list;
    }

    @Override
    public htown getTown(String hname) {
        return htownMapper1.selectByHname(hname);
    }

    @Override
    public htown getTown(int hid) {
        return htownMapper1.selectByHid(hid);
    }

    @Override
    public htown getTownByUid(int uid) {
        return htownMapper1.selectByUid(uid);
    }

    @Override
    public void updateHtown(htown htown1) {
        htownMapper1.updateHtown(htown1);
    }

    @Override
    public void addTown(htown htown1) {
        htownMapper1.insert(htown1);
    }
}

