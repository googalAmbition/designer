package com.ambition.behavioral.template;

public class Withdraw extends BankTemplateMethod{

	@Override
	public void transact() {
		System.out.println("Withdraw");
	}

}
