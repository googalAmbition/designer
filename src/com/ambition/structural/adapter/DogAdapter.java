package com.ambition.structural.adapter;

public class DogAdapter extends Dog implements Robot  {

	@Override
	public void cry() {
		System.out.println("Robot imitation:");
		super.wang();
	}

	@Override
	public void move() {
		System.out.println("Robot imitation:");
		super.run();
	}
	
}
