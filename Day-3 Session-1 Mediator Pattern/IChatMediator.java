package com.cognizant.DPT05;

public interface IChatMediator {
	public void addUser(IUser user);
	public void sendMessage(String message, IUser user);
}
