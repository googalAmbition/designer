package com.ambition.behavioral.command;

public class Client {
	public static void main(String[] args) {
		AbstractCommand open,close,change;
		
		open = new TVOpenCommand();
		close = new TVCloseCommand();
		change = new TVChangeCommand();
		
		Controller control = new Controller(open, close, change);
		
		control.open();
		control.change();
		control.close();
	}
}
