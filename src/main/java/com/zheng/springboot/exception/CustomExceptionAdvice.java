package com.zheng.springboot.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

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
 *  2019年07月11日			zhenglian			    Initial.
 *
 * </pre>
 */
@ControllerAdvice(basePackages = {"com.zheng.springboot"})
public class CustomExceptionAdvice {
    
//    @ResponseBody
//    @ExceptionHandler(ArithmeticException.class)
    ResponseEntity<?> handleArithmeticException(HttpServletRequest request, Throwable error) {
        HttpStatus status = getStatus(request);
        return new ResponseEntity<>(new CustomErrorType(status.value(), error.getMessage()), status);
    }
    
    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    private static class CustomErrorType {
        private Integer statusCode;
        private String message;
    }

    private HttpStatus getStatus(HttpServletRequest request) {
        Integer statusCode = (Integer) request.getAttribute("javax.servlet.error.status_code");
        if (statusCode == null) {
            return HttpStatus.INTERNAL_SERVER_ERROR;
        }
        return HttpStatus.valueOf(statusCode);
    }
}
