package com.zheng.springboot.converter;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

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
 *  2019年07月10日			zhenglian			    Initial.
 *
 * </pre>
 */
@RequestMapping("/converter")
@RestController
public class ConverterController {
    @RequestMapping("/user")
    @ResponseBody
    public User user() {
        User user = new User();
        user.setUsername("zhangsan");
        user.setPassword("123456");
        return user;
    }
}
