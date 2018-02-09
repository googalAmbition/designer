package com.ambition.behavioral.template.extend;

public class Client {
	
	
	public static void main(String[] args) {
		HookDemo hd;
		
		hd = new SubHookDemo();
		hd.process();
	}
}
