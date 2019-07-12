package com.zheng.springboot.helloworld;

import com.zheng.springboot.config.AcmeProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
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
public class HelloWorldExample implements EnvironmentAware {

    @Value("${name}")
    private String name;
    
    @Value("${number}")
    private Integer number;
    
//    @Value("${custom.name}")
//    private String yamlName;
//
//    @RequestMapping("/yaml")
//    public String yaml() {
//        return yamlName;
//    }
    
    @Autowired
    private AcmeProperties acmeProperties;
    
    private Environment environment;
    
    
    @Override
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }
    
    @RequestMapping("/acme")
    public AcmeProperties properties() {
        return acmeProperties;
    }
    
    @RequestMapping("/env/{key}")
    public String envKey(@PathVariable String key) {
        return environment.getProperty(key);
    }
    
    @RequestMapping("/random")
    public Integer random() {
        return number;
    }
    
    @RequestMapping("/external")
    public String externalConfig() {
        return name;
    }
    
//    @RequestMapping("/")
//    public String home() {
//        return "Hello World! Nice to meet you!";
//    }
    
    @RequestMapping("/echo1hello/{msg}")
    public String echo(@PathVariable("msg") String body) {
        return body;
    }
}
