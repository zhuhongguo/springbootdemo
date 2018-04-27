package com.egoint;

import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;

import java.util.concurrent.TimeoutException;


import com.rabbitmq.client.QueueingConsumer;

public class ReceiveTest {
	private final static String QUEUE_NAME = "这是一个测试queue_name";
    public static void main(String[] args) throws java.io.IOException, java.lang.InterruptedException  {
        
        // TODO Auto-generated method stub
         ConnectionFactory factory = new ConnectionFactory();  
            factory.setHost("127.0.0.1");  
            factory.setPort(5672);
            factory.setUsername("zhuhongguo");
            factory.setPassword("zhuhongguo");
            // 打开连接和创建频道，与发送端一样  
            Connection connection = null;
			try {
				connection = factory.newConnection();
			} catch (TimeoutException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
            Channel channel = connection.createChannel();  
      
            // 声明队列，主要为了防止消息接收者先运行此程序，队列还不存在时创建队列。  
            channel.queueDeclare(QUEUE_NAME, false, false, false, null);  
            // 创建队列消费者  

            System.out.println(" [*] Waiting for messages. To exit press CTRL+C");
            // 指定消费队列  
            // 指定消费队列 
            QueueingConsumer consumer = new QueueingConsumer(channel);  
            channel.basicConsume(QUEUE_NAME, true, consumer);  
            while(true){  
                QueueingConsumer.Delivery delivery = consumer.nextDelivery();  
                String message = new String(delivery.getBody());  
                System.out.println(" [x] Received '" + message + "'");  
            }  

    }
}
