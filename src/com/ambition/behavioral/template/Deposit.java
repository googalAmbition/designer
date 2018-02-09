package com.ambition.behavioral.template;

public class Deposit extends BankTemplateMethod{

	@Override
	public void transact() {
		System.out.println("Deposit");
	}

}
