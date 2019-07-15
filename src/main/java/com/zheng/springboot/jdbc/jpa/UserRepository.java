package com.zheng.springboot.jdbc.jpa;

import org.springframework.data.repository.Repository;

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

public interface UserRepository extends Repository<UserEntity, Long> {
    List<UserEntity> findById(Long id);
}
