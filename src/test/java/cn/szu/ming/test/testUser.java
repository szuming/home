package cn.szu.ming.test;


import cn.szu.ming.dao.userDao;
import cn.szu.ming.entity.user;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class testUser {
    private static Logger logger = Logger.getLogger(testUser.class.getName());


    @Resource
    private userDao userDao1=null;

    @Test
    public void test1(){
        user u=userDao1.selectByUid(1);
        logger.info(u.getUsername());
        logger.debug(u.getPassword());
    }


}
