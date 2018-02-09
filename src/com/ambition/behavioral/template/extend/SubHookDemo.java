package com.ambition.behavioral.template.extend;

public class SubHookDemo extends HookDemo{

	@Override
	public void getData() {
		System.out.println("get config from XML");
	}

	@Override
	public void display() {
		System.out.println("display the data");
	}
	
	public boolean isValue(){
		return true;
	}

}
