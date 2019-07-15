package com.zheng.springboot.jms;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import javax.jms.TextMessage;

/**
 * @Author zhenglian
 * @Date 2019/7/15
 */
@Component
public class JmsMsgConsumer {

    /**
     * 监听test queue
     * @param message
     */
    @JmsListener(destination = "test.queue", containerFactory = "queueListenerFactory")
    public void consume(TextMessage message) throws Exception {
        System.out.println("consume queue message: " + message.getText());
    }

    /**
     * 监听test topic
     * @param message
     */
    @JmsListener(destination = "test.topic", containerFactory = "topicListenerFactory")
    public void subscribe(TextMessage message) throws Exception {
        System.out.println("consume topic message: " + message.getText());
    }
    
}
