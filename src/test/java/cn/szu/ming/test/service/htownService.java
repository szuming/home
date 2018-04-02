package cn.szu.ming.test.service;

import cn.szu.ming.service.userService;
import cn.szu.ming.test.BaseTest;
import cn.szu.ming.test.dao.testUser;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class htownService extends BaseTest {
    private static Logger logger = Logger.getLogger(testUser.class.getName());
    @Autowired
    userService userService1;
    @Test
    public void testAddTown(){

        userService1.setUhid(3,2);
    }
}
