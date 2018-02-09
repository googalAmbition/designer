package com.ambition.structural.decorator;

public class Airplane extends Changer {

	public Airplane(Transform transform) {
		super(transform);
		System.out.println("change airplan");
	}
	
	public void say() {
		System.out.println("fly in the sky");
	}

}
