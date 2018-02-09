package com.ambition.behavioral.mediator;

public class CommonMember extends Member{

	public CommonMember(String name) {
		super(name);
	}

	@Override
	public void sendText(String to, String message) {
		System.out.println("commenMember send message");
		chartroom.sendText(name, to, message);
	}

	@Override
	public void sendImage(String to, String image) {
		System.out.println("commenMember can't send image!");
	}

}
