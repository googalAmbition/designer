package com.ambition.behavioral.command.adder;

public class Client {
	public static void main(String[] args) {
		CalculatorForm form = new CalculatorForm();
		AbstractCommand command;
		command = new ConcreteCommand();
		form.setCommand(command);
		
		form.computer(10);
		form.computer(5);
		form.computer(10);
		form.undo();
	}
}
