package com.zheng.springboot.jms;

import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import java.util.Objects;

/**
 * @Author zhenglian
 * @Date 2019/7/15
 */
@RestController
@RequestMapping("/jms")
public class JmsController {
    
    @Autowired
    private JmsTemplate jmsTemplate;
    
    @RequestMapping("/send/{type}/{content}")
    public String send(@PathVariable("type") String type, @PathVariable("content") String content) {
        Destination destination;
        if (Objects.equals(type, "topic")) {
            destination = new ActiveMQTopic("test.topic");
        } else {
            destination = new ActiveMQQueue("test.queue");
        }
        jmsTemplate.send(destination, new MessageCreator() {
            @Override
            public Message createMessage(Session session) throws JMSException {
                return session.createTextMessage(content);
            }
        });
        return "send!";
    }
}
