package cn.szu.ming.dao;

import cn.szu.ming.entity.jointown;

import java.util.List;

public interface jointownMapper {
    int deleteByPrimaryKey(Integer jid);

    int insert(jointown record);

    int insertSelective(jointown record);

    jointown selectByPrimaryKey(Integer jid);

    int updateByPrimaryKeySelective(jointown record);

    int updateByPrimaryKey(jointown record);

    //----diy-----

    /**
     * 获得同乡会的所有申请者
     * @param hid 同乡会id
     * @return
     */
    public List<jointown> getApplyers(int hid);

    /**
     * 删除jointown
     * @param jid
     */
    public void del(int jid);

}