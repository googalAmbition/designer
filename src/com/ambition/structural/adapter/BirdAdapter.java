package com.ambition.structural.adapter;

public class BirdAdapter extends Bird implements Robot {

	@Override
	public void cry() {
		System.out.println("Robot imitation:");
		super.tweedle();
	}

	@Override
	public void move() {
		System.out.println("Robot imitation:");
		super.fly();
	}
	

}
