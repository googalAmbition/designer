package com.ambition.creational.prototype.improve;

public class Client {
	public static void main(String[] args) {
		PrototypeManager pm = new PrototypeManager();
		
		MyColor obj1 = pm.getColor("red");
		obj1.display();
		
		MyColor obj2 = pm.getColor("red");
		obj2.display();
		
		System.out.println(obj1 == obj2);
	}
}
