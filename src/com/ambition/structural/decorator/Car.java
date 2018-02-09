package com.ambition.structural.decorator;

public class Car implements Transform {

	public Car() {
		System.out.println("This is a car");
	}
	@Override
	public void move() {
		System.out.println("move on the ground");
	}
	
}
