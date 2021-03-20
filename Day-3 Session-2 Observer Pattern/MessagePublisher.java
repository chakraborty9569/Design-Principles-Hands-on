package com.cognizant.DPT06;

import java.util.ArrayList;
import java.util.List;

public class MessagePublisher implements Subject{
	private String state;
	
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
		notifyUpdate(new Message("State Changed: "+ state));
	}

	private List<Observer> observers = new ArrayList<>();
	@Override
	public void attach(Observer o) {
		
		observers.add(o);
	}

	@Override
	public void detach(Observer o) {
		observers.remove(o);
		
	}

	@Override
	public void notifyUpdate(Message m) {
		for(Observer o: observers) { 
			o.update(m); 
		}
		
	}

}
