package com.founder.service;

import com.founder.entity.User;

import java.util.List;

public interface UserService {


    public void  save(User user);


    public List<User> queryAll();
}
