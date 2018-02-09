package com.ambition.behavioral.observe;


public class Mouse implements MyObserver{

	@Override
	public void response() {
		System.out.println("Mouse run");
	}


}
