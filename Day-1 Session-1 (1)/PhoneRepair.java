package com.cognizant.DPT01a;

public class PhoneRepair implements Repair, AccessoryRepair{

	@Override
	public void processAccessoryRepair(String accessoryType) {
		System.out.println(String.format("%s repair accepted!", accessoryType));
		
	}

	@Override
	public void processPhoneRepair(String modelName) {
		System.out.println(String.format("%s repair accepted!", modelName));
		
	}

}
