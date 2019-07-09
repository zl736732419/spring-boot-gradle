package com.zheng.springboot.config;

import com.zheng.springboot.config.customvalidate.CustomPropertyValidator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.validation.Validator;

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
 *  2019年07月06日			zhenglian			    Initial.
 *
 * </pre>
 */
@Configuration
@PropertySource(name = "external-config.properties", 
        value={"classpath:external-config.properties"},
        encoding = "UTF-8")
public class MyExternalConfiguration {
    
    @Bean
    public static Validator configurationPropertiesValidator() {
        return new CustomPropertyValidator();
    }
    
}
