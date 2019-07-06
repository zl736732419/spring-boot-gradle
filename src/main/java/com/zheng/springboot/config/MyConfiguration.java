package com.zheng.springboot.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.http.codec.CodecsAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Configuration;

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
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class, CodecsAutoConfiguration.class})
public class MyConfiguration {
}
