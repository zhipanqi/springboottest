package com.founder.controller;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
//类中所以方法返回json 然后就不用 RestController=ResponseBody+Controller
//@RestController
@Controller
@RequestMapping("/hello")
public class HelloController {
     @RequestMapping("/hello")
     //返回json
     @ResponseBody
    public String hello() {
        System.out.println("你好啊中国");
         System.out.println("测试1");
        return "您好";
    }
}
