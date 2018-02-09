package com.ambition.behavioral.chain;

public class Manager extends Leader{

	public Manager(String name) {
		super(name);
	}

	@Override
	public void handleRequest(LeaveRequest request) {
		if (request.getLeaveDays()<10) {
			System.out.println("Director "+ name+ ",approve "+ request.getName()+ "leave "+request.getLeaveDays()+ " days");
		}else {
			if (this.successor!=null) {
				this.successor.handleRequest(request);
			}
		}
	}

}
