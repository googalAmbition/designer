package com.ambition.behavioral.interpreter;


public class ValueNode implements Node {

	private int value;
	
	public ValueNode(int value) {
		this.value = value;
	}
	@Override
	public int intepret() {
		return this.value;
	}
	
}
