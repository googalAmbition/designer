package com.ambition.creational.prototype.improve;

import java.util.Hashtable;

public class PrototypeManager {
	private Hashtable<String,Object> ht = new Hashtable<String,Object> ();
	public PrototypeManager() {
		ht.put("red", new Red());
		ht.put("blue", new Blue());
	}
	
	public void addColor(String key, MyColor color) {
		ht.put(key, color);
	}
	
	public MyColor getColor(String key) {
		return (MyColor) ((MyColor)ht.get(key)).clone();
	}
}
