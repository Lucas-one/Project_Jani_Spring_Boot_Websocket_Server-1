package com.example.demo.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class WebSocketController {

	@MessageMapping("/end")
	@SendTo("/topic/greetings") // @SendTo���� Subscriber���� �����ϱ� ���� MessageBroker�� �����Ѵ�.
	public String sendMessage(String Message) {
		return Message;
	}
	
}
