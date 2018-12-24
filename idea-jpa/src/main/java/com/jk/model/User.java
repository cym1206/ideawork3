package com.jk.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
@Entity
@Table(name="t_user")
public class User implements Serializable {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    private String birthday;

    private Integer sex;

    private String loginNumber;

    private String password;

    private String img;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBirthday() {
        return birthday;
    }

    public Integer getSex() {
        return sex;
    }

    public String getLoginNumber() {
        return loginNumber;
    }

    public String getPassword() {
        return password;
    }

    public String getImg() {
        return img;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public void setLoginNumber(String loginNumber) {
        this.loginNumber = loginNumber;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
