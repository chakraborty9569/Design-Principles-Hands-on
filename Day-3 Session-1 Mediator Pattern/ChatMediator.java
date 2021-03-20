package com.cognizant.DPT05;

import java.util.ArrayList;
import java.util.List;

public class ChatMediator implements IChatMediator{
	
	private List<IUser> users;
	
	public ChatMediator() {
		users= new ArrayList<>();
	}

	@Override
	public void addUser(IUser user) {
		
		users.add(user);
	}

	@Override
	public void sendMessage(String message, IUser user) {
		
		for(IUser u: users) {
			u.receiveMessage(message);
		}
	}

}
