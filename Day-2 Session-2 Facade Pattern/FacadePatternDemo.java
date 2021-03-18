package com.cognizant.DPT04a;

import java.util.Scanner;

public class FacadePatternDemo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		ShapeMaker maker=new ShapeMaker();
		System.out.println("Draw Shapes");
		while(true) {
			System.out.println("1. Circle");
			System.out.println("2. Rectangle");
			System.out.println("3. Square");
			System.out.println("4. Exit");
			int ch=sc.nextInt();
			
			switch (ch) {
			case 1: maker.drawCircle();
				break;
			case 2: maker.drawRectangle();;
				break;
			case 3: maker.drawSquare();;
				break;
			default: System.out.println("Successfully exited");
				System.exit(0);
			}
		}

	}

}
