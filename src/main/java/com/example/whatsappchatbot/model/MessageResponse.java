package com.example.whatsappchatbot.model;

import lombok.Data;

@Data
public class MessageResponse {
	
	
	private String reply;
	private String status;
	
	public MessageResponse(String reply, String status) {
		this.reply = reply;
		this.status = status;
	}

}
