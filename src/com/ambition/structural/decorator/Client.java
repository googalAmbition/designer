package com.ambition.structural.decorator;

public class Client {
	public static void main(String[] args) {
		Transform camaro;
		camaro = new Car();
		camaro.move();
		System.out.println("--------------------");
		Robot robot = new Robot(camaro);
		robot.move();
		robot.say();
	}
}
