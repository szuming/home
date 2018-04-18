package cn.szu.ming.service.impl;

import cn.szu.ming.dao.managerMapper;
import cn.szu.ming.entity.manager;
import cn.szu.ming.service.managerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class managerServiceImpl implements managerService {
    @Autowired
    managerMapper managerDao1;
    @Override
    public void addManager(manager manager1){
        managerDao1.insert(manager1);
    }
}
