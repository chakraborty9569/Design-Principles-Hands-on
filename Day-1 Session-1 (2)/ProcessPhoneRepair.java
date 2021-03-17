package com.cognizant.DPT01b;

public class ProcessPhoneRepair {
	public void repairSteps(Iphone phone) {
		String part1=phone.getPhonePart1();
		System.out.println(String.format("%s repaired", part1));
		
		double partCost=phone.getPart1Cost1();
		System.out.println(String.format("Repair Cost %.2f", partCost));
	}
}
