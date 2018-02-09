package com.ambition.creational.factory;

public class TCLFactory implements TVFactory {
	@Override
	public TV product() {
		System.out.println("TCLFactory produce TCLTV");
		return new TCLTV();
	}
}
