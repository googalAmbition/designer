package com.ambition.behavioral.chain;

public class LeaveRequest {
	private String name;
	private int leaveDays;
	public LeaveRequest(String name, int leaveDays) {
		this.name = name;
		this.leaveDays = leaveDays;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLeaveDays() {
		return leaveDays;
	}
	public void setLeaveDays(int leaveDays) {
		this.leaveDays = leaveDays;
	}
	
}
