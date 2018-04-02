package cn.szu.ming.test.dao;

import cn.szu.ming.dao.htownMapper;
import cn.szu.ming.entity.htown;

import cn.szu.ming.test.BaseTest;
import org.apache.log4j.Logger;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

public class testHtown extends BaseTest {
    private static Logger logger = Logger.getLogger(testUser.class.getName());

    @Resource
    htownMapper htownMapper1=null;

    @Test
    public void test1(){
        htown htown1=htownMapper1.selectByPrimaryKey(1);
        logger.info(htown1.getHname());
        logger.debug(htown1.getHintro());
    }

    @Test
    public void getHtowns() {
        List<htown> list;
        list=htownMapper1.selectAllTowns();
        logger.info(list.size());
    }


}
