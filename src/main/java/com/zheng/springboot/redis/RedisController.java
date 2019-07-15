package com.zheng.springboot.redis;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author zhenglian
 * @Date 2019/7/13
 */
@RestController
@RequestMapping("/redis")
public class RedisController {
    
//    @Autowired
//    private StringRedisTemplate redisTemplate;
//    
//    @RequestMapping("/set/{key}/{value}")
//    public String put(@PathVariable("key") String key, @PathVariable("value") String value) {
//        redisTemplate.opsForValue().set(key, value);
//        return "OK";
//    }
//    
//    @RequestMapping("/get/{key}")
//    public String get(@PathVariable("key") String key) {
//        return redisTemplate.opsForValue().get(key);
//    }
}
