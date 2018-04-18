package cn.szu.ming.service.impl;

import cn.szu.ming.dao.jointownMapper;
import cn.szu.ming.entity.jointown;
import cn.szu.ming.service.jointownService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class jointownServiceImpl implements jointownService {
    @Autowired
    jointownMapper jointownDao1;
    @Override
    public void insert(jointown jointown1) {
        jointownDao1.insert(jointown1);
    }

    @Override
    public List<jointown> getApplyers(int hid) {
        return jointownDao1.getApplyers(hid);
    }

    @Override
    public void del(int jid) {
        jointownDao1.del(jid);
    }
}
