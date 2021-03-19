package com.cognizant.DPT04b;

public class ProjectManager implements ILeaveRequestHandler{
	private ILeaveRequestHandler nextHandler;
	@Override
	public void setNextHandler(ILeaveRequestHandler nextHandler) {
		
		this.nextHandler=nextHandler;
		
	}

	@Override
	public void handleRequest(LeaveRequest lr) {
		if(lr.getLeaveDays()>3 && lr.getLeaveDays()<=5)
			System.out.println("Leave Granted by Project Manager to "+lr.getEmployeeName()+" for "+lr.getLeaveDays()+" days");
		
		else
			nextHandler.handleRequest(lr);
		
	}

}
