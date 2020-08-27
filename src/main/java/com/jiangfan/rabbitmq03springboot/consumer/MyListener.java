package com.jiangfan.rabbitmq03springboot.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 功能描述: 消息监听类
 *
 * @Auther: 江帆
 * @Date:
 * @Description:
 */
@Component
public class MyListener {
    @RabbitListener(queues = {"springboot_queue"})
    public void msg(String msg) {
        System.out.println("消费消息----------" + msg);

    }
}
