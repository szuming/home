package cn.szu.ming.dao;

import cn.szu.ming.entity.user;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface userMapper {
    int deleteByPrimaryKey(Integer uid);

    int insert(user record);

    int insertSelective(user record);

    user selectByPrimaryKey(Integer uid);

    int updateByPrimaryKeySelective(user record);

    int updateByPrimaryKey(user record);

    //登陆
    user selectByPassword( @Param("username") String username,@Param("password") String password);
    user selectByUsername(String username);

    /**
     * 创建同乡会时更新uhid
     * @param uhid  用户所属同乡会的id
     * @param uid   用户id
     * @param type  管理员类型，0为普通成员，1为普通管理员，2为超级管理员（创建者）
     */
    void setUhidAndType(@Param("uhid")int uhid,@Param("uid") int uid,@Param("type") int type);

    /**
     * 查询同乡会下成员
     * @param hid
     * @return
     */
    List<user> getUsers(int hid);

    /**
     * 查询同乡会下管理员
     * @param hid
     * @return
     */
    List<user> getManUsers(int hid);

    /**
     * 添加管理员
     * @param uid
     */
    void updateTypeById(@Param("uid")int uid);
}