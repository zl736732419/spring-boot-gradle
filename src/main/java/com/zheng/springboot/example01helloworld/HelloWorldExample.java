package com.zheng.springboot.example01helloworld;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
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

    @Value("${name}")
    private String name;
    
    @RequestMapping("/external")
    public String externalConfig() {
        return name;
    }
    
    @RequestMapping("/")
    public String home() {
        return "Hello World! Nice to meet you!";
    }
    
    @RequestMapping("/echo1hello/{msg}")
    public String echo(@PathVariable("msg") String body) {
        return body;
    }
    
    
    
}
