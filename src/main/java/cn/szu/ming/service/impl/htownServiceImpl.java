package cn.szu.ming.service.impl;

import cn.szu.ming.dao.htownMapper;
import cn.szu.ming.entity.htown;
import cn.szu.ming.entity.htownExample;
import cn.szu.ming.service.htownService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class htownServiceImpl implements htownService {

    @Autowired
    htownMapper htownMapper1;

    @Override
    public List<htown> getHtowns() {
        List<htown> list=new ArrayList<>();
        htownExample htownExample1=new htownExample();
        htownExample1.setOrderByClause("hid desc");
        return htownMapper1.selectByExample(htownExample1);
    }
}
