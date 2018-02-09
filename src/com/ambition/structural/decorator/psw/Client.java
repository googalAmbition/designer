package com.ambition.structural.decorator.psw;

public class Client {
	public static void main(String[] args) {
		demo1();
		
	}

	private static void demo1() {
		String password = "i love you ";
		String apassword;
		Cipher sc,cc,ac;
		
		sc = new SimpleCipher();
		apassword = sc.encript(password);
		System.out.println(apassword);
		System.out.println("----------------");
		
		cc = new ComplexCipher(sc);
		apassword = cc.encript(password);
		System.out.println(apassword);
		System.out.println("----------------");
		
		ac = new AdvanceCipher(cc);
		apassword = ac.encript(password);
		System.out.println(apassword);
		System.out.println("----------------");
		
	}
}
