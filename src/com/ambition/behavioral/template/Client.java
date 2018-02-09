package com.ambition.behavioral.template;

public class Client {

	public static void main(String[] args) {
		BankTemplateMethod bank;
		bank = (BankTemplateMethod) XMLUtil.getObject();
		bank.process();
		System.out.println("----------------");
	}
}
