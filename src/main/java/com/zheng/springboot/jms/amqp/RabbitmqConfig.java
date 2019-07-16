package com.zheng.springboot.jms.amqp;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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
@Configuration
@EnableRabbit
public class RabbitmqConfig {
    
    @Bean
    public Queue queue() {
        return new Queue("test.queue");
    }

    @Bean
    public Queue topic() {
        return new Queue("test.topic");
    }

    @Bean
    public Queue topics() {
        return new Queue("test.topics");
    }
    
    @Bean
    TopicExchange exchange() {
        return new TopicExchange("exchange");
    }

    @Bean
    public Binding bindingExchangeMessage1(Queue topic, TopicExchange exchange) {
        return BindingBuilder.bind(topic).to(exchange).with("topic.message");
    }

    @Bean
    public Binding bindingExchangeMessage2(Queue topics, TopicExchange exchange) {
        return BindingBuilder.bind(topics).to(exchange).with("topic.#");
    }
    
}
