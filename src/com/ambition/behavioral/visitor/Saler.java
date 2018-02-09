package com.ambition.behavioral.visitor;

public class Saler extends Visitor{

	@Override
	public void visit(Apple apple) {
		System.out.println("saler "+name+" weight apple,calculate price");
	}

	@Override
	public void visit(Book book) {
		System.out.println("saler "+name+" calculate price of book");
	}

}
