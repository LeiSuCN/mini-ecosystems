package com.leisucn.test.minijavaserver.customer;

import java.io.Serializable;

/**
 * Created by SL on 2017/10/20.
 */
public class Customer implements Serializable {

    private String name;

    private int age;

    private byte sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public byte getSex() {
        return sex;
    }

    public void setSex(byte sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}
