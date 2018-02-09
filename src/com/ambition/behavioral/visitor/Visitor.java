package com.ambition.behavioral.visitor;


public abstract class Visitor {
	protected String name;
	
	public abstract void visit(Apple apple);
	public abstract void visit(Book book);
	public void setName(String name) {
		this.name = name;
	}
}
