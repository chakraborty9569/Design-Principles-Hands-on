package com.cognizant.DPT01a;

public class PhoneOrder implements Order{

	@Override
	public void processOrder(String modelName) {
		System.out.println(String.format("%s order accepted!", modelName));
		
	}

}
