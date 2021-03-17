package com.cognizant.DPT02b;

import java.util.Scanner;

public class Client {
	
	public static Factory getFactory(String factoryType) {
		if(factoryType.equalsIgnoreCase("Mercedes"))
			return new MercedesFactory();
		else
			return new AudiFactory();
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the type of car you want to manufacture (Mercedes/Audi)");
		
		String factoryType=sc.next();
		Factory f=getFactory(factoryType);
		f.makeTire().getTire();
		f.makeHeadlight().getHeadlight();

	}

}
