package com.ambition.creational.simpleFactory;

public class Factory {
	public static TV product(String band) {
		switch (band) {
		case "Le":
			System.out.println("Le TV product");
			return new LeTV();
		// return new LeTV();
		case "TCL":
			System.out.println("TCL TV product");
			return new TCLTV();
		default:
			System.out.println("sorry can't product "+band);
			return null;
		}

	}
}
