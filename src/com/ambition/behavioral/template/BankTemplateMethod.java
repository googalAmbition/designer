package com.ambition.behavioral.template;

public abstract class BankTemplateMethod {
	public void takeNumber() {
		System.out.println("takeNumber");
	}
	
	public abstract void transact();
	
	public void evaluate(){
		System.out.println("feedback");
	}
	
	public void process() {
		this.takeNumber();
		this.transact();
		this.evaluate();
	}
}
