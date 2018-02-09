package com.ambition.behavioral.state.extend;

public class OnState extends State {

	@Override
	public void on(Switch s) {
		System.out.println("already open");
	}

	@Override
	public void off(Switch s) {
		System.out.println("already off");
		s.setState(Switch.getState("off"));
	}

}
