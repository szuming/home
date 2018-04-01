package cn.szu.ming.dao;

import cn.szu.ming.entity.htown;
import cn.szu.ming.entity.htownExample;
import org.apache.felix.ipojo.annotations.Component;

import java.util.List;

@Component
public interface htownMapper {
    int deleteByPrimaryKey(Integer hid);

    int insert(htown record);

    int insertSelective(htown record);

    List<htown> selectByExample(htownExample example);

    htown selectByPrimaryKey(Integer hid);

    int updateByPrimaryKeySelective(htown record);

    int updateByPrimaryKey(htown record);
}