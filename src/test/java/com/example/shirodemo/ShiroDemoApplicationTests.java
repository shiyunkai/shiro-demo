package com.example.shirodemo;

import com.example.shirodemo.conf.ShiroProperties;
import com.example.shirodemo.utils.JWTUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ShiroDemoApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Autowired
    ShiroProperties shiroProperties;

    @Test
    public void testShiroProperties(){
        log.info("*****************???"+shiroProperties.toString());
    }

    @Test
    public void testJWTUtils(){
        String token = JWTUtil.createToken("xiaoming");
        System.out.println(token);
        String username = JWTUtil.getUsername(token);
        System.out.println("token中的用户名为:"+username);
        boolean flag = JWTUtil.verifyToken(token,"xioming");
        System.out.println("xiaoming对应的用户名是否正确:"+flag);
    }


}
