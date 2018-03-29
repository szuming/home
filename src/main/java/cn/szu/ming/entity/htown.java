package cn.szu.ming.entity;

public class htown {
    private Integer hid;

    private String hname;

    private String hintro;

    private Integer hnum;

    public Integer getHid() {
        return hid;
    }

    public void setHid(Integer hid) {
        this.hid = hid;
    }

    public String getHname() {
        return hname;
    }

    public void setHname(String hname) {
        this.hname = hname == null ? null : hname.trim();
    }

    public String getHintro() {
        return hintro;
    }

    public void setHintro(String hintro) {
        this.hintro = hintro == null ? null : hintro.trim();
    }

    public Integer getHnum() {
        return hnum;
    }

    public void setHnum(Integer hnum) {
        this.hnum = hnum;
    }
}