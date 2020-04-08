package com.example.demospringbootmqrabbitmq.config;

import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author jy
 */
@Configuration
public class MyAmqpConfig {
    @Bean("what")
    public MessageConverter messageConverter(){
        return new Jackson2JsonMessageConverter();
    }
}
