package com.ambition.behavioral.chain;

public class Client {
	public static void main(String[] args) {
		Leader direct,manger,genral;
		
		direct = new Director("director");
		manger = new Manager("manage");
		genral = new GeneralManager("general");
		
		direct.steSuccessor(manger);
		manger.steSuccessor(genral);
		
		LeaveRequest lr1 = new LeaveRequest("lr1", 1);
		direct.handleRequest(lr1);
		
		LeaveRequest lr2 = new LeaveRequest("lr2", 5);
		direct.handleRequest(lr2);
		
		LeaveRequest lr3 = new LeaveRequest("lr3", 15);
		direct.handleRequest(lr3);
		
		LeaveRequest lr4 = new LeaveRequest("lr4", 41);
		direct.handleRequest(lr4);
	}

}
