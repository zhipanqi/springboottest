package com.founder.service;

import com.founder.dao.UserDAO;
import com.founder.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements  UserService{


    @Autowired
    //@Resource
    private UserDAO userDAO ;

    @Override
    public void save(User user) {
        userDAO.save(user);
    }

    @Override
    public List<User> queryAll() {
        System.out.println("ces");
        System.out.println("ces");

        List<User> users = userDAO.queryAll();
        return users;

    }
}
