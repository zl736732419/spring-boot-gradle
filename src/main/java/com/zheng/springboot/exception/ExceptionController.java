package com.zheng.springboot.exception;

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
 *  2019年07月11日			zhenglian			    Initial.
 *
 * </pre>
 */
@RestController
@RequestMapping("/exception")
public class ExceptionController {
    @RequestMapping("/")
    @ResponseBody
    public String index() {
        int a = 1 / 0;
        return "hello";
    }
}
