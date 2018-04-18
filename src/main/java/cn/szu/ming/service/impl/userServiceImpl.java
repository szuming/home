package cn.szu.ming.service.impl;

import cn.szu.ming.dao.userMapper;
import cn.szu.ming.entity.user;
import cn.szu.ming.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public List<user> getUsers(int hid) {
        return userDao1.getUsers(hid);
    }

    @Override
    public List<user> getManUsers(int hid) {
        return userDao1.getManUsers(hid);
    }

    @Override
    public void addUser(user user1) {
        userDao1.insert(user1);
    }

    @Override
    public void setUhidAndType(int uhid,int uid,int type) {
        userDao1.setUhidAndType(uhid,uid,type);
    }

    @Override
    public void updateTypeById(int uid) {
        userDao1.updateTypeById(uid);
    }

}
