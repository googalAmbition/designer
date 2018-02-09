package com.ambition.behavioral.command;

public class Controller {
	private AbstractCommand open,close,change;
	public Controller(AbstractCommand open,AbstractCommand close,AbstractCommand change){
		this.open = open;
		this.close = close;
		this.change = change;
	}
	
	public void open() {
		open.excute();
	}
	
	public void close() {
		close.excute();
	}
	
	public void change() {
		change.excute();
	}
}
