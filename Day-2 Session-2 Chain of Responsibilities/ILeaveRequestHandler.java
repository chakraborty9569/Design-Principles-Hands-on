package com.cognizant.DPT04b;

public interface ILeaveRequestHandler {
	public void setNextHandler(ILeaveRequestHandler nextHandler);
	public void handleRequest(LeaveRequest lr);
}
