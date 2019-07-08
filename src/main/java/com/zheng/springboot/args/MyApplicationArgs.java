package com.zheng.springboot.args;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

import java.util.Arrays;
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
 *  2019年07月08日			zhenglian			    Initial.
 *
 * </pre>
 */
@Component
public class MyApplicationArgs {
    
    @Autowired
    public MyApplicationArgs(ApplicationArguments args) {
        // Program arguments set application arguments.
        System.out.println("get application arguments.");
        boolean debug = args.containsOption("debug");
        System.out.println("debug: " + debug);
        
        List<String> arguments = args.getNonOptionArgs();
        System.out.println("arguments: " + arguments);
        
        String[] sourceArgs = args.getSourceArgs();
        System.out.println("source args: " + Arrays.toString(sourceArgs));
    }
}
