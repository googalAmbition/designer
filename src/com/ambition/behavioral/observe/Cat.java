package com.ambition.behavioral.observe;

public class Cat extends MySubject{

	@Override
	public void cry() {
		System.out.println("Cat cry ");
		System.out.println("----------------");
		for (MyObserver myObserver : observers) {
			myObserver.response();
		}
	}

}
