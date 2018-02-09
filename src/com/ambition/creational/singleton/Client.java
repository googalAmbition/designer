package com.ambition.creational.singleton;
import static java.lang.System.out;

public class Client {
	public static void main(String[] args) {
		
		Singleton singleton = Singleton.getSingleton();
		Singleton singleton2 = Singleton.getSingleton();
		Singleton singleton3 = Singleton.getSingleton();
		System.out.println(singleton == singleton2);
		out.println(singleton == singleton3);
	}
	
	
}
