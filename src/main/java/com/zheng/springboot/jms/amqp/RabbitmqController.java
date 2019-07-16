package com.zheng.springboot.jms.amqp;

import org.springframework.amqp.rabbit.core.RabbitMessagingTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.GenericMessage;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

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
@RequestMapping("rabbit")
public class RabbitmqController {
    
    @Autowired
    private RabbitMessagingTemplate template;

    @RequestMapping("/send/{type}/{content}")
    public String send(@PathVariable("type") String type, @PathVariable("content") String content) throws Exception {
        if (Objects.equals("queue", type)) {
            Message message = new GenericMessage(content);
            template.convertAndSend("test.queue", message);
        } else {
            template.convertAndSend("exchange", "topic.message", content);
        }
        return "send!";
    }
}
