package com.ambition.behavioral.state.extend;

public class Switch{
	private static State state;
	private static State onState;
	private static State offState;
	private String name;
	public Switch(String name) {
		this.name = name;
		onState = new OnState();
		offState = new OffState();
		state = onState;
	}
	
	public void setState(State state) {
		this.state = state;
	}
	
	public void on() {
		System.out.println(name);
		state.on(this);
	}
	
	public void off() {
		System.out.println(name);
		state.off(this);
	}
	
	public static State getState(String type) {
		if (type.equalsIgnoreCase("on")) {
			return onState;
		}
		else {
			return offState;
		}
	}
}
