package com.zheng.springboot.exit;

import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * <pre>
 *
 *  File:
 *
 *  Copyright (c) 2016, globalegrow.com All Rights Reserved.
 *
 *  Description:
 *  TODO
 *
 *  Revision History
 *  Date,					Who,					What;
 *  2019年07月08日			zhenglian			    Initial.
 *
 * </pre>
 */
@SpringBootApplication
public class ExitCodeApplication {
    @Bean
    public ExitCodeGenerator exitCodeGenerator() {
        return () -> 42;
    }
    
    public static void main(String[] args) {
        System.exit(SpringApplication.exit(SpringApplication.run(ExitCodeApplication.class, args)));
    }
}
