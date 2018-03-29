package cn.szu.ming.entity;

public class jointown {
    private Integer jid;

    private String hname;

    private String username;

    private Integer jhid;

    private Integer juid;

    public Integer getJid() {
        return jid;
    }

    public void setJid(Integer jid) {
        this.jid = jid;
    }

    public String getHname() {
        return hname;
    }

    public void setHname(String hname) {
        this.hname = hname == null ? null : hname.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Integer getJhid() {
        return jhid;
    }

    public void setJhid(Integer jhid) {
        this.jhid = jhid;
    }

    public Integer getJuid() {
        return juid;
    }

    public void setJuid(Integer juid) {
        this.juid = juid;
    }
}