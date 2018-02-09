package com.ambition.behavioral.chain;

public abstract class Leader {
	
	protected String name;
	protected Leader successor;
	
	public Leader(String name) {
		this.name = name;
	}
	
	public void steSuccessor(Leader successor) {
		this.successor = successor;
	}
	
	public abstract void handleRequest(LeaveRequest request);
		
}
