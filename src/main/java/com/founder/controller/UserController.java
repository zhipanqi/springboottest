package com.founder.controller;


import com.founder.entity.User;
import com.founder.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userSerivce;

    @RequestMapping("/login")
    public String login(Model model){
        System.out.println("这是登录 login");
        User user = new User("21","小黑");
        model.addAttribute("user",user);
        return  "index";

    }


    @RequestMapping("/findAll")
    public User findAll(Model model){
        List<User> users = userSerivce.queryAll();
        System.out.println(users.toString());
       // model.addAttribute("users",users);
       // return user;
        return new User("2","小米",24,new Date());
      // return null;
    }

    @RequestMapping("/test")
    public String test(String name){
       /* System.out.println("name: "+name);
        return "index";*/
       return null;
    }
    @RequestMapping("/findAll1")
    @ResponseBody
    public List<User> findAll1(){

        //return new User("2","小米",24,new Date());
        return  userSerivce.queryAll();
    }

}
