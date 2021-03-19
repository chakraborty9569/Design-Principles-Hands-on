package com.cognizant.DPT04b;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		ILeaveRequestHandler s=new Supervisor();
		ILeaveRequestHandler p=new ProjectManager();
		ILeaveRequestHandler h=new HR();
		
		s.setNextHandler(p);
		p.setNextHandler(h);
		
		LeaveRequest lr=new LeaveRequest();
		System.out.println("Enter name:");
		String employeeName=sc.nextLine();
		lr.setEmployeeName(employeeName);
		System.out.println("Enter the number of leave days:");
		int leaveDays=sc.nextInt();
		lr.setLeaveDays(leaveDays);
		
		s.handleRequest(lr);

	}

}
