package com.ambition.behavioral.template.extend;

public abstract class HookDemo {
	public abstract void getData();
	
	public void convertData(){
		System.out.println("commen data opreate");
	}
	
	public abstract void display();
	
	public void process(){
		getData();
		if (isValue()) {
			convertData();
		}
		display();
	}
	
	public boolean isValue(){
		return true;
	}
}
