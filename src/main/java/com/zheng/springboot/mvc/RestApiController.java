package com.zheng.springboot.mvc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

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
@RestController
@RequestMapping("/rest")
public class RestApiController {
    @GetMapping("/hello")
    public String hello(HttpServletRequest request) {
        System.out.println(request);
        return "redirect:/index.html";
    }
}
