package com.leisucn.test.minijavaserver.bus.sample;

import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

/**
 * Created by SL on 2017/10/24.
 */
public class HelloWorldSend {


    public static void main(String[] args) throws Exception{

        ConnectionFactory factory = new ConnectionFactory();
        factory.setUsername("guest");
        factory.setPassword("guest");

        factory.setHost("192.168.1.1");

        Connection connection = factory.newConnection();

        Channel channel = connection.createChannel();

        channel.close();
        connection.close();
    }
}
