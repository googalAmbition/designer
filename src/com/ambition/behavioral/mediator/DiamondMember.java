package com.ambition.behavioral.mediator;

public class DiamondMember extends Member{

	public DiamondMember(String name) {
		super(name);
	}

	@Override
	public void sendText(String to, String message) {
		System.out.println("Diamond send message");
		chartroom.sendText(name, to, message);
	}

	@Override
	public void sendImage(String to, String image) {
		System.out.println("Diamond send image");
		chartroom.sendImage(name, to, image);
	}

}
