package com.cognizant.DPT04b;

public class Supervisor implements ILeaveRequestHandler{
	private ILeaveRequestHandler nextHandler;
	@Override
	public void setNextHandler(ILeaveRequestHandler nextHandler) {
		this.nextHandler=nextHandler;
		
	}

	@Override
	public void handleRequest(LeaveRequest lr) {
		if(lr.getLeaveDays()>=1 && lr.getLeaveDays()<=3)
			System.out.println("Leave Granted by Supervisor to "+lr.getEmployeeName()+" for "+lr.getLeaveDays()+" days");
		
		else
			nextHandler.handleRequest(lr);
		
	}

}
