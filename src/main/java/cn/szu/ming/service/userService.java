package cn.szu.ming.service;

import cn.szu.ming.entity.user;
import org.apache.ibatis.annotations.Param;


public interface userService {
    user getUser(int uid);
    user getUser(String username);
    user getUser(String username,String password);
    void addUser(user user1);
    //更新uhid
    void setUhid(@Param("uhid") int uhid,@Param("uid") int uid);
}
