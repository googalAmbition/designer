package com.ambition.structural.flyweight.port;

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
	public void use(Port port) {
		System.out.println("Linked by hub, type is " + this.type+" ,port is "+port.getPort());
	}

}
