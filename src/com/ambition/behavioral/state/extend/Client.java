package com.ambition.behavioral.state.extend;

public class Client {
	public static void main(String[] args) {
		Switch s1,s2;
		s1 = new Switch("swith one ");
		s2 = new Switch("switch two");
		
		s1.on();
		s2.on();
		
		s1.off();
		s2.off();
		
		s2.on();
		s1.on();
	}
}
