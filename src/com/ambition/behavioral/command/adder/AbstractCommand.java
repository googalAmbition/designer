package com.ambition.behavioral.command.adder;

public abstract class AbstractCommand {
	public abstract int excute(int value);
	
	public abstract int undo();
		
}
