package com.zheng.springboot.validate;

import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
 *  2019年07月16日			zhenglian			    Initial.
 *
 * </pre>
 */
@RestController
@RequestMapping("/validate")
public class ValidateController {
    
    @RequestMapping("/echo")
    public CustomResponse echo(@RequestBody @Validated CustomRequest request, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return new CustomResponse(0, bindingResult.getAllErrors().get(0).getDefaultMessage());
        }
        
        return new CustomResponse(1, request);
    }
}
