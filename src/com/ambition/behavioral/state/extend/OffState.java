package com.ambition.behavioral.state.extend;

public class OffState extends State {

	@Override
	public void on(Switch s) {
		System.out.println("open");
		s.setState(Switch.getState("on"));
	}

	@Override
	public void off(Switch s) {
		System.out.println("already off");
	}

}
