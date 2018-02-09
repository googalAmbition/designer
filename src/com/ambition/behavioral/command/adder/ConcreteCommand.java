package com.ambition.behavioral.command.adder;


public class ConcreteCommand extends AbstractCommand {

	private Adder add = new Adder();
	private int value;
	@Override
	public int excute(int value) {
		this.value = value;
		return add.add(value);
	}

	@Override
	public int undo() {
		return add.add(-value);
	}

}
