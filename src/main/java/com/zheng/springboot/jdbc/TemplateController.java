package com.zheng.springboot.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
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
@RequestMapping("/template")
public class TemplateController {
    
    @Autowired
    private JdbcTemplate jdbcTemplate;
    
    @RequestMapping("createTable")
    public CustomResponse createTable() {
        jdbcTemplate.execute("create memory table user(id bigint GENERATED ALWAYS AS IDENTITY(START WITH 1), username varchar(20) not null, password varchar(20) not null)");
        return new CustomResponse(1, "操作成功", null);
    }
    
    @RequestMapping("/save/{username}/{password}")
    public CustomResponse save(@PathVariable("username") String username, @PathVariable("password") String password) {
        jdbcTemplate.execute("insert into user(username, password) values ('"+username+"', '"+password+"')");
        return new CustomResponse(1, "操作成功", null);
    }
    
    @RequestMapping("get/{id}")
    public CustomResponse get(@PathVariable("id") Long id) {
        String sql = "select * from user where id = ?";
        List<User> users = jdbcTemplate.query(sql, new Object[]{id}, new BeanPropertyRowMapper<>(User.class));
        return new CustomResponse(1, "操作成功", users);
    }
    
    
}
