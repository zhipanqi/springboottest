package com.founder.test;

import com.founder.Application;
import com.founder.entity.User;
import com.founder.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.Date;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class TestSpringBoot {

    @Resource
    private UserService userService;

    @Test
    public void test(){
        userService.save(new User("12C","小黑",23,new Date()));
    }

}
