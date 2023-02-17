package com.founder.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class User {

    private String id;
    private String name;
    private Integer age;
   // @JsonFormat(pattern = "yyyy-MM-dd")//jackson的，没有转fastjson时用
    @JSONField(format = "yyyy-MM-dd") //fastjson的
    private Date bir;


    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", bir=" + bir +
                '}';
    }

    public User(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBir() {
        return bir;
    }

    public void setBir(Date bir) {
        this.bir = bir;
    }

    public User(String id, String name, Integer age, Date bir) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.bir = bir;
    }

    public User() {
    }
}
