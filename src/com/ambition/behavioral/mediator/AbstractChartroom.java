package com.ambition.behavioral.mediator;

public abstract class AbstractChartroom {
	public abstract void register(Member member);
	public abstract void sendText(String from, String to, String message);
	public abstract void sendImage(String from, String to ,String image);
}
