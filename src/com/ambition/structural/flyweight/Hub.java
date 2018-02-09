package com.ambition.structural.flyweight;

public class Hub implements NetworkDevice {

	private String type;
	
	public Hub(String type) {
		this.type = type;
	}
	@Override
	public String getType() {
		return this.type;
	}

	@Override
	public void use() {
		System.out.println("Linked by hub, type is " + this.type);
	}

}
