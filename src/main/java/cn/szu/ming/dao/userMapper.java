package cn.szu.ming.dao;

import cn.szu.ming.entity.user;
import org.apache.ibatis.annotations.Param;

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
    //创建同乡会时更新uhid
    void setUhid(@Param("uhid")int uhid,@Param("uid") int uid);
}