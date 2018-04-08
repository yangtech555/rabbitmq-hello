package com.yhbtest;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by yanghongbo on 2018/4/8.
 */
@Component
public class Sender {

    @Autowired
    private AmqpTemplate rabbitmqTemplate;

    public void send()
    {
        String context ="hello " + new Date();
        System.out.println("sender : "+ context);
        this.rabbitmqTemplate.convertAndSend("hello",context);
    }
}
