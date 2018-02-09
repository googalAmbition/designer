package com.ambition.behavioral.chain;

public class GeneralManager extends Leader {

	public GeneralManager(String name) {
		super(name);
	}

	@Override
	public void handleRequest(LeaveRequest request) {
		if (request.getLeaveDays()<30) {
			System.out.println("Director "+ name+ ",approve "+ request.getName()+ "leave "+request.getLeaveDays()+ " days.");
		}else {
			System.out.println("Do you want to resign? "+ request.getName()+ " leave "+ request.getLeaveDays()+ " days.");
		}
	}

}
