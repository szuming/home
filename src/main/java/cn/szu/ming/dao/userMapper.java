package cn.szu.ming.dao;

import cn.szu.ming.entity.user;
import cn.szu.ming.entity.userExample;
import org.apache.felix.ipojo.annotations.Component;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Component
public interface userMapper {
    //mbg
    int deleteByPrimaryKey(Integer uid);

    int insert(user record);

    int insertSelective(user record);

    List<user> selectByExample(userExample example);

    user selectByPrimaryKey(Integer uid);

    int updateByPrimaryKeySelective(user record);

    int updateByPrimaryKey(user record);

    //diy

    //注册时查询username查询账号
    user selectByUsername(String username);

    //登陆时查询
    user selectByPassword(@Param("username") String username, @Param("password") String password);

}