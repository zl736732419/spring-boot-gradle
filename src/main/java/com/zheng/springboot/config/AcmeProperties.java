package com.zheng.springboot.config;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collections;
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
 *  2019年07月09日			zhenglian			    Initial.
 *
 * </pre>
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@Component
@ConfigurationProperties("acme")
@Validated
public class AcmeProperties {
    @NotNull
    private boolean enabled;
    @NotNull
    private InetAddress remoteAddress;
    @Valid
    private Security security;

    @Getter
    @Setter
    @ToString
    @NoArgsConstructor
    public static class Security {
        @NotNull
        private String username;
        @NotNull
        private String password;
        private List<String> roles = new ArrayList<>(Collections.singleton("USER"));
    }
}
