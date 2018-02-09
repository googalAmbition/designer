package com.ambition.structural.facade;

public class Light {

	private String position;
	public Light(String position){
		this.position = position;
	}
	
	public void on(){
		System.out.println(this.position+" light on ");
	}
	
	public void off(){
		System.out.println(this.position + " light off");
	}
}
