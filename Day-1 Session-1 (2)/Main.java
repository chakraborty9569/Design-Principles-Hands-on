package com.cognizant.DPT01b;

public class Main {

	public static void main(String[] args) {
		ProcessPhoneRepair pr=new ProcessPhoneRepair();
		pr.repairSteps(new SamsungNote());
		
		pr.repairSteps(new Redmi7());

	}

}
