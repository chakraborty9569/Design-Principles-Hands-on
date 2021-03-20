package com.cognizant.DPT06;

public class MessageSubscriberThree implements Observer{

	@Override
	public void update(Message m) {
		
		System.out.println("MessageSubscriberThree :: " + m.getMessageContent());
	}

}
