package com.zheng.springboot.validate;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

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
@Getter
@Setter
@ToString
@NoArgsConstructor
public class CustomRequest {
    @Min(value = 1L, message = "数字最小值为1")
    @Max(value = 10L, message = "数字最大值为10")
    private Integer num;
    @Email(message = "请输入格式正确的email")
    private String email;
    @NotNull(message = "年龄不能为空")
    private Integer age;
    @NotEmpty(message = "名称不能为空")
    private String username;
}
