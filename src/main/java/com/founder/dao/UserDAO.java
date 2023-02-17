package com.founder.dao;



import com.founder.entity.User;

import java.util.List;

public interface UserDAO {


    public void  save(User user);


    public List<User> queryAll();




}
