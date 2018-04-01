package cn.szu.ming.dao;

import cn.szu.ming.entity.jointown;
import cn.szu.ming.entity.jointownExample;
import org.apache.felix.ipojo.annotations.Component;

import java.util.List;


@Component
public interface jointownMapper {
    int deleteByPrimaryKey(Integer jid);

    int insert(jointown record);

    int insertSelective(jointown record);

    List<jointown> selectByExample(jointownExample example);

    jointown selectByPrimaryKey(Integer jid);

    int updateByPrimaryKeySelective(jointown record);

    int updateByPrimaryKey(jointown record);
}