package com.zheng.springboot.jms.amqp;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

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
@Component
public class RabbitmqConsumer {
    
    @RabbitListener(queues = {"test.queue"})
    public void queue(String content) {
        System.out.println("consume queue message: " + content);
    }
    
    @RabbitListener(queues="test.topic")
    public void topic(String obj) {
        System.out.println("receiver:topic.message:"+obj);
    }

    @RabbitListener(queues="test.topics")
    public void topics(String obj) {
        System.out.println("receiver:topic.messages:"+obj);
    }
    
}
