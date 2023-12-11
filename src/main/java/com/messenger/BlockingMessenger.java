package com.messenger;

import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.DefaultConsumer;
import com.rabbitmq.client.Envelope;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import java.util.concurrent.atomic.AtomicInteger;


public class BlockingMessenger {
   private final static String QUEUE_NAME = "hello";
    private final static String HOST = "localhost";
    private final static int PORT = 5672;


    public static void main(String[] args) throws IOException, TimeoutException {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost(HOST);
        factory.setPort(PORT);
        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();

        AtomicInteger count = new AtomicInteger(0);

        DefaultConsumer consumer = new DefaultConsumer(channel) {
            @Override
            public void handleDelivery(
                    String consumerTag,
                    Envelope envelope,
                    AMQP.BasicProperties properties,
                    byte[] body) throws IOException {

                String message = new String(body, "UTF-8");

                
               
                int index = message.indexOf('_');
                if (index != -1) {
                    String sub = message.substring(0, index);
                    System.out.println(sub);  // Outputs "Hello, "
                }
                
     
  
            }
        };
        channel.basicConsume(QUEUE_NAME, true, consumer);
    }
    
}
