package cn.szu.ming.dao;

import cn.szu.ming.entity.user;
import cn.szu.ming.entity.userExample;
import java.util.List;

public interface userMapper {
    int deleteByPrimaryKey(Integer uid);

    int insert(user record);

    int insertSelective(user record);

    List<user> selectByExample(userExample example);

    user selectByPrimaryKey(Integer uid);

    int updateByPrimaryKeySelective(user record);

    int updateByPrimaryKey(user record);
}