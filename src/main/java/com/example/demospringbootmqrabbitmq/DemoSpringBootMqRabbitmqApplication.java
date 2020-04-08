package com.example.demospringbootmqrabbitmq;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author jy
 */
@SpringBootApplication
@MapperScan("com.example.demospringbootmqrabbitmq.dao")
@EnableRabbit
public class DemoSpringBootMqRabbitmqApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoSpringBootMqRabbitmqApplication.class, args);
    }


}
