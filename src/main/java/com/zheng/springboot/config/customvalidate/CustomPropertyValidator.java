package com.zheng.springboot.config.customvalidate;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import java.util.regex.Pattern;

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
public class CustomPropertyValidator implements Validator {
    final Pattern pattern = Pattern.compile("^(?:[0-9]{1,3}\\.){3}[0-9]{1,3}$");
    
    @Override
    public boolean supports(Class<?> clazz) {
        return clazz == CustomProperties.class;
    }

    @Override
    public void validate(Object target, Errors errors) {
        ValidationUtils.rejectIfEmpty(errors, "host", "host.empty", "host不能为空");
        ValidationUtils.rejectIfEmpty(errors, "port", "port.empty", "port不能为空");

        CustomProperties properties = (CustomProperties) target;
        if (properties.getHost() != null && !this.pattern.matcher(properties.getHost()).matches()) {
            errors.rejectValue("host", "Invalid host", "未知的host格式");
        }
    }
}
