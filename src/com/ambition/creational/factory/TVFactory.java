package com.ambition.creational.factory;

public interface TVFactory {
	default TV product(){
		System.out.println("product TV...");
		return null;
	}
}
