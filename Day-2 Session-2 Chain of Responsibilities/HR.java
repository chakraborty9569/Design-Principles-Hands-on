package com.cognizant.DPT04b;

public class HR implements ILeaveRequestHandler{
	private ILeaveRequestHandler nextHandler;
	@Override
	public void setNextHandler(ILeaveRequestHandler nextHandler) {
		// TODO Auto-generated method stub
		this.nextHandler=nextHandler;
		
	}

	@Override
	public void handleRequest(LeaveRequest lr) {
		System.out.println("Leave Granted by HR to "+lr.getEmployeeName()+" for "+lr.getLeaveDays()+" days");
		
	}

}
