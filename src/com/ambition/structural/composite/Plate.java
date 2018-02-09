package com.ambition.structural.composite;

import java.util.ArrayList;
import java.util.List;


public class Plate extends MyElement {

	private List<MyElement> list = new ArrayList<MyElement>();
	
	public void add(MyElement e) {
		list.add(e);
	}
	
	public void remove(MyElement e) {
		list.remove(e);
	}
	@Override
	public void eat() {
		for (MyElement myElement : list) {
			myElement.eat();
		}
	}
	
}
