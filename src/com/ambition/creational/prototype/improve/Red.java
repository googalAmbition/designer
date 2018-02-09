package com.ambition.creational.prototype.improve;


public class Red implements MyColor{

	
	@Override
	public Object clone()  {
		Red r = null;
		try {
			r = (Red) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return r;
	}
	@Override
	public void display() {
		System.out.println("This is Red");
	}
	

}
