package com.ambition.behavioral.mediator;

public class Client {
	public static void main(String[] args) {
		AbstractChartroom happyChat = new ChartGroup();
		
		Member member1,member2,member3,member4,member5;
		member1 = new DiamondMember("D1");
		member2 = new DiamondMember("D2");
		member3 = new CommonMember("C1");
		member4 = new CommonMember("C2");
		member5 = new CommonMember("C3");
		
		happyChat.register(member1);
		happyChat.register(member2);
		happyChat.register(member3);
		happyChat.register(member4);
		happyChat.register(member5);
		
		member1.sendText("D2", "123456");
		
		member3.sendImage("D2", "1122");
		
		member1.sendImage("D2", "1222");
		member1.sendImage("C1", "1122");
		member1.sendImage("C1", "12323165");
	}
}
