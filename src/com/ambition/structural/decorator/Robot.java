package com.ambition.structural.decorator;

public class Robot extends Changer {

	public Robot(Transform transform) {
		super(transform);
		System.out.println("change robot");
	}
	
	public void say() {
		System.out.println("speak");
	}

}
