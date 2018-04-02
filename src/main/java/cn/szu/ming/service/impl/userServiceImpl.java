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
    public user getUser(String username) {
        return userDao1.selectByUsername(username);
    }
    @Override
    public user getUser(String username, String password) {
        return userDao1.selectByPassword(username,password);
    }

    @Override
    public void addUser(user user1) {
        userDao1.insert(user1);
    }

    @Override
    public void setUhid(int uhid,int uid) {
        userDao1.setUhid(uhid,uid);
    }

}
