package cn.szu.ming.service.impl;

import cn.szu.ming.dao.htownMapper;
import cn.szu.ming.entity.htown;
import cn.szu.ming.service.htownService;
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
    public List<htown> getHtowns() {
        List<htown> list;
        list=htownMapper1.selectAllTowns();
        return list;
    }

    @Override
    public htown getTown(String hname) {
        return htownMapper1.selectByHname(hname);
    }
    @Override
    public void addTown(htown htown1) {
        htownMapper1.insert(htown1);
    }
}

