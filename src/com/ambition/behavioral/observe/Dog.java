package com.ambition.behavioral.observe;

public class Dog implements MyObserver{

	@Override
	public void response() {
		System.out.println("Dog roar");
	}
	

}
