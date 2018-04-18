package cn.szu.ming.service;

import cn.szu.ming.entity.jointown;

import java.util.List;

public interface jointownService {
    void insert(jointown jointown1);

    public List<jointown> getApplyers(int hid);

    public void del(int jid);
}
