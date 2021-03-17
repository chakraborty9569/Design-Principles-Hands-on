package com.cognizant.DPT01a;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Welcome to our site. Would you like to order or repair?");
		String processOption=sc.next().toLowerCase().trim();
		
		String productDetail;
		if(processOption.equalsIgnoreCase("order")) {
			PhoneOrder po=new PhoneOrder();
			System.out.println("Please provide the phone model name");
			sc.nextLine();
			productDetail=sc.nextLine().trim();
			po.processOrder(productDetail);
		}
		else {
			PhoneRepair pr=new PhoneRepair();
			System.out.println("Is it the phone or the accessory that you want to be repaired");
			String productType=sc.next().toLowerCase();
			switch (productType) {
			case "phone": {
				System.out.println("Please provide the phone model name");
				sc.nextLine();
				productDetail=sc.nextLine().trim();
				pr.processPhoneRepair(productDetail);
				break;
			}
			case "accessory": {
				System.out.println("Please provide the accessory detail, like headphone, tempered glass");
				sc.nextLine();
				productDetail=sc.nextLine().trim();
				pr.processAccessoryRepair(productDetail);
				break;
			}
			default:
				break;
			}
		}

	}

}
