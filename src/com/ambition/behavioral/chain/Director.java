package com.ambition.behavioral.chain;

public class Director extends Leader {
	
	public Director(String name) {
		super(name);
	}

	@Override
	public void handleRequest(LeaveRequest request) {
		if (request.getLeaveDays()<3) {
			System.out.println("Director "+ name+ ",approve "+ request.getName()+ "leave "+request.getLeaveDays()+ " days");
		}else {
			if (this.successor!=null) {
				this.successor.handleRequest(request);
			}
		}
	}

}
