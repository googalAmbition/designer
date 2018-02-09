package com.ambition.behavioral.visitor;

public class Apple implements Product{

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}