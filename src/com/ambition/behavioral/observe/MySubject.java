package com.ambition.behavioral.observe;

import java.util.ArrayList;
import java.util.List;

public abstract class MySubject {
	protected List<MyObserver> observers = new ArrayList<MyObserver>();
	
	public void attach(MyObserver observer){
		observers.add(observer);
	}
	
	public void detach(MyObserver observer){
		observers.remove(observer);
	}
	
	public abstract void cry();
}
