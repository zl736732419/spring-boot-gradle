package com.zheng.springboot.mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.internet.MimeMessage;
import java.io.File;

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
@RequestMapping("/mail")
public class MailController {
    
    @Autowired
    private JavaMailSender javaMailSender;
    
    @Value("${spring.mail.sender}")
    private String sender;
    
    
    @RequestMapping("/send/{email}/{content}")
    public String send(@PathVariable("email") String receiver, @PathVariable("content") String content) throws Exception {
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
        helper.setTo(receiver);
        helper.setFrom(sender);
        helper.setText("<html><body>表情包: <img src='cid:emoji'/> <br/> content: " + content + "</body></html>", true);
        // 添加附件
        helper.addAttachment("测试文本文件.txt", new File("C:\\Users\\Administrator\\Desktop\\test.txt"));
        
        helper.addInline("emoji", new File("C:\\Users\\Administrator\\Desktop\\emoji\\base64123.jpg"));
        
        javaMailSender.send(mimeMessage);
        return "ok!";
    }
}
