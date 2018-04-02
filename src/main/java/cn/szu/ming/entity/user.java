package cn.szu.ming.entity;

public class user {
    private Integer uid;

    private String username;

    private String password;

    private String userphone;

    private Integer uhid;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getUserphone() {
        return userphone;
    }

    public void setUserphone(String userphone) {
        this.userphone = userphone == null ? null : userphone.trim();
    }

    public Integer getUhid() {
        return uhid;
    }

    public void setUhid(Integer uhid) {
        this.uhid = uhid;
    }
}