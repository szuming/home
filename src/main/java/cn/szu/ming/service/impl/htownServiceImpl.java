package cn.szu.ming.service.impl;

import cn.szu.ming.dao.htownMapper;
import cn.szu.ming.entity.htown;
import cn.szu.ming.service.htownService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class htownServiceImpl implements htownService {

    @Autowired
    htownMapper htownMapper1;

    @Override
    public List<htown> getHtowns() {
        List<htown> list=new ArrayList<>();

        return null;
    }
}
