package com.founder.test;


import junit.framework.Test;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ElkApplicationTests {

    private final static Logger log = LoggerFactory.getLogger(Test.class);

    @Before
    public void setUp() {
    }

    @org.junit.Test
    public void test() {

        log.info("我是一个info");

    }

}