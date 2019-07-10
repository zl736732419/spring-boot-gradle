package com.zheng.springboot.converter;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

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
@Getter
@Setter
@NoArgsConstructor
@ToString
public class User {
    private String username;
    private String password;
    private Integer age;
}
