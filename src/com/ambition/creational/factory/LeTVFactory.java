package com.ambition.creational.factory;

public class LeTVFactory implements TVFactory {

	@Override
	public TV product() {
		System.out.println("LeTVFactory product LeTV");
		return new LeTV();
	}
	
	
}
