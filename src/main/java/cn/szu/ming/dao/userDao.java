package cn.szu.ming.dao;

import cn.szu.ming.entity.user;

public interface userDao {
    user selectByUid(Integer uid);
}
