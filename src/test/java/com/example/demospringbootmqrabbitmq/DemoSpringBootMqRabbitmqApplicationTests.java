package com.example.demospringbootmqrabbitmq;

import org.junit.jupiter.api.Test;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@SpringBootTest
class DemoSpringBootMqRabbitmqApplicationTests {

    @Autowired
    RabbitTemplate rabbitTemplate;

    @Test
    void contextLoads() {
    }

    @Test
    void setRabbitTemplate() {
        Map<String, Object> map = new HashMap<>();
        map.put("msg","this is a message!");
        map.put("data", Arrays.asList("hello",123,false));
        rabbitTemplate.convertAndSend("jy.amq.direct", "jiangyong.news", map);
    }

    @Test
    void rabbitReceive(){
        Object o = rabbitTemplate.receiveAndConvert("jiangyong.news");
        System.out.println(o);
        assert o != null;
        System.out.println(o.toString());
    }
}
