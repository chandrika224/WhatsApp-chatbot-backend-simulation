package com.example.whatsappchatbot.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.whatsappchatbot.model.MessageRequest;
import com.example.whatsappchatbot.model.MessageResponse;
import com.example.whatsappchatbot.service.ChatService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
//@RequiredArgsConstructor
public class WebhookController {
	
	private final ChatService chatService;
	
	public WebhookController(ChatService chatService) {
		this.chatService = chatService;
	}
	
	@PostMapping("/webhook")
	public MessageResponse receiveMessage(@RequestBody MessageRequest request) {
		
		log.info("Webhook received a request: {}", request.getMessage());
		return chatService.getReply(request.getMessage());
		
	}


}
