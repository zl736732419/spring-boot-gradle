package com.zheng.springboot.example01helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * use java plugin and management dependencies plugin to build executable jar
 * spring boot入门小程序
 * @Author zhenglian
 * @Date 2019/7/4
 */
@RestController
public class HelloWorldExample {
    
    @RequestMapping("/")
    public String home() {
        return "Hello World!";
    }
    
}
