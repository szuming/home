package cn.szu.ming.service.impl;

import cn.szu.ming.dao.userMapper;
import cn.szu.ming.entity.user;
import cn.szu.ming.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userServiceImpl implements userService {
    @Autowired
    userMapper userDao1;

    public user getUser(int uid) {
        return userDao1.selectByPrimaryKey(uid);
    }
}
