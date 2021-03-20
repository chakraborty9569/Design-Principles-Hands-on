package com.cognizant.DPT05;

public class Client {

	public static void main(String[] args) {
		ChatMediator cm=new ChatMediator();
		BasicUser u1=new BasicUser(cm);
		u1.setName("Aman");
		BasicUser u2=new BasicUser(cm);
		u2.setName("Manzor");
		BasicUser u3=new BasicUser(cm);
		u3.setName("Kabita");
		BasicUser u4=new BasicUser(cm);
		u4.setName("Ashish");
		BasicUser u5=new BasicUser(cm);
		u5.setName("Dubey");
		cm.addUser(u1);
		cm.addUser(u2);
		cm.addUser(u3);
		cm.addUser(u4);
		cm.addUser(u5);
		
		PremiumUser pm=new PremiumUser(cm);
		pm.setName("Vidyut");
		pm.sendMessage("Hello All! Welcome back from the weekend");

	}

}
