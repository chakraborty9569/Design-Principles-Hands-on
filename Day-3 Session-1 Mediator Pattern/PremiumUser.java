package com.cognizant.DPT05;

public class PremiumUser implements IUser{
	private IChatMediator chatMediator;
	private String name;
	
	public PremiumUser(IChatMediator chatMediator) {
		this.chatMediator=chatMediator;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void receiveMessage(String message) {
		
		System.out.println(name+"<--- "+message);
		
	}

	@Override
	public void sendMessage(String message) {
		// TODO Auto-generated method stub
		chatMediator.sendMessage(message, this);
	}

}
