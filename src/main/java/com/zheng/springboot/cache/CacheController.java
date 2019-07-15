package com.zheng.springboot.cache;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
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
 *  2019年07月15日			zhenglian			    Initial.
 *
 * </pre>
 */
@RestController
@EnableCaching
@RequestMapping("/cache")
public class CacheController {
    
    @RequestMapping("/get/{key}")
    @Cacheable(value = "cache1", key = "#key")
    public String cache(@PathVariable("key") String key) {
        System.out.println("execute method without cache!");
        return key;
    }
    
    @RequestMapping("/update/{key}")
    @CachePut(value = "cache1", key = "#key")
    public String putCache(@PathVariable("key") String key) {
        System.out.println("execute method without cache!");
        return key;
    }
    
    @RequestMapping("/delete/{key}")
    @CacheEvict(value = "cache1", key = "#key")
    public String deleteCache(@PathVariable("key") String key) {
        System.out.println("execute method without cache!");
        return "ok!";
    }
}
