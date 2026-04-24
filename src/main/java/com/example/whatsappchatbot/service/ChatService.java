package com.example.whatsappchatbot.service;

import org.springframework.stereotype.Service;

import com.example.whatsappchatbot.model.MessageResponse;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ChatService {
	public MessageResponse getReply(String message) {
		
		String reply;
		
		if(message.equalsIgnoreCase("Hi")) {
			reply = "Hello";
		}else if(message.equalsIgnoreCase("Bye")) {
			reply = "Goodbye";
		}else {
			reply = "I don't understand";
		}
		
		log.info("ChatService generated a reply: {}", reply);
		return new MessageResponse(reply, "success");
		
	}
}
