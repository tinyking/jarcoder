package cn.wangjianchao.jarcoder.module.uc.model;

import java.io.Serializable;

/**
 * Created by tiny on 16-6-23.
 */
public class User implements Serializable {
    private String username;
    private String sex;
    private int age;

    public User() {
    }

    public User(String username, String sex, int age) {
        this.username = username;
        this.sex = sex;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }
}
