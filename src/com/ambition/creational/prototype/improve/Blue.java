package com.ambition.creational.prototype.improve;


public class Blue implements MyColor{

	
	@Override
	public Object clone()  {
		Blue r = null;
		try {
			r = (Blue) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return r;
	}
	@Override
	public void display() {
		System.out.println("This is Blue");
	}
	

}
