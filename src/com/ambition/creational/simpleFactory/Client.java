package com.ambition.creational.simpleFactory;

public class Client {
	public static void main(String[] args) {
		TV tv = Factory.product(XMLUtil.getBrand());
		tv.play();
	}
}
