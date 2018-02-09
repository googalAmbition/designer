package com.ambition.behavioral.visitor;

public class Customer extends Visitor{

	@Override
	public void visit(Apple apple) {
		System.out.println("Customer "+name+" select apple");
	}

	@Override
	public void visit(Book book) {
		System.out.println("Customer "+name+" select book");
	}
	
}
