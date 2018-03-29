package cn.szu.ming.test.dao;



import cn.szu.ming.dao.userMapper;
import cn.szu.ming.entity.user;
import cn.szu.ming.test.BaseTest;
import org.apache.log4j.Logger;
import org.junit.Test;

import javax.annotation.Resource;


public class testUser extends BaseTest {
    private static Logger logger = Logger.getLogger(testUser.class.getName());


    @Resource
    private userMapper userMapper1=null;

    @Test
    public void test1(){
        user u=userMapper1.selectByPrimaryKey(1);
        logger.info(u.getUsername());
        logger.debug(u.getPassword());
    }


}
