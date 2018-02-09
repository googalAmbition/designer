package com.ambition.creational.factory;


public class Client {
	public static void main(String[] args) {
		TVFactory factory = (TVFactory) XMLUtil.getObject();
		TV tv = factory.product();
		tv.play();
	}
}
