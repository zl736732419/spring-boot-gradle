package com.zheng.springboot;

import com.zheng.springboot.config.MyConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @Author zhenglian
 * @Date 2019/7/4
 */
@SpringBootApplication
@Configuration
@Import({MyConfiguration.class})
public class SpringBootApp {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootApp.class, args);
    }

}
