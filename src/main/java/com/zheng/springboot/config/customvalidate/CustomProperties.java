package com.zheng.springboot.config.customvalidate;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

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
 *  2019年07月09日			zhenglian			    Initial.
 *
 * </pre>
 */
@Getter
@Setter
@NoArgsConstructor
@ToString
@Component
@ConfigurationProperties("custom")
@Validated
public class CustomProperties {
    private String host;
    private Integer port;
}
