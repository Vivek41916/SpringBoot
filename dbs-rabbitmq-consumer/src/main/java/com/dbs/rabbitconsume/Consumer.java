package com.dbs.rabbitconsume;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {
	
	@RabbitListener(queues = "dbs_queue")
	public void consumeMessageFromQueue(OrderStatus orderStatus) {
		System.out.println("Message Received from queue : "+orderStatus.getMessage());
	}
	

}


