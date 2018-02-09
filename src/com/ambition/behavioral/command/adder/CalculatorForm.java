package com.ambition.behavioral.command.adder;

public class CalculatorForm {
	private AbstractCommand command;
	
	public void setCommand(AbstractCommand command) {
		this.command =command;
	}
	
	public void computer(int value){
		int i = command.excute(value);
		System.out.println("Operation result is: "+i);
	}
	
	public void undo() {
		int i = command.undo();
		System.out.println("Cancel : " +i);
	}
}
