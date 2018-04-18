package cn.szu.ming.service;

import cn.szu.ming.entity.user;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface userService {
    user getUser(int uid);
    user getUser(String username);
    user getUser(String username,String password);

    /**
     * 查询同乡会下的所有用户
     * @param hid 同乡会的id
     * @return
     */
    List<user> getUsers(int hid);

    /**
     * 查询同乡会下的管理员
     * @param hid   同乡会id
     * @return
     */
    List<user> getManUsers(int hid);


    //新增用户
    void addUser(user user1);


    //更新uhid
    void setUhidAndType( int uhid, int uid,int type);

    //更新type
    void updateTypeById(int uid);
}
