package com.zheng.springboot.jdbc.jpa;

import com.zheng.springboot.jdbc.template.CustomResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
 *  2019年07月12日			zhenglian			    Initial.
 *
 * </pre>
 */
@RestController
@RequestMapping("/jpa")
public class JpaController {
    
    @Autowired
    private UserRepository userRepository;
    
    @RequestMapping("/find/{id}")
    public CustomResponse findById(@PathVariable("id") Long id) {
        List<UserEntity> userEntity = userRepository.findById(id);
        return new CustomResponse(1, "成功", userEntity);
    }
}
