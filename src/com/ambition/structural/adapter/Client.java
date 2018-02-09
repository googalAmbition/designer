package com.ambition.structural.adapter;

public class Client {
	public static void main(String[] args) {
		Robot robot = (Robot) XMLUtil.getObject();
		robot.cry();
		robot.move();
	}
}
