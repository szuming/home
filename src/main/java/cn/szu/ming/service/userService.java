package cn.szu.ming.service;

import cn.szu.ming.entity.user;


public interface userService {
    user getUser(int uid);
    user getUser(String username);
    user getUser(String username,String password);
    void addUser(user user1);
}
