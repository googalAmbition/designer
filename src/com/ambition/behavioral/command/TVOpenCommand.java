package com.ambition.behavioral.command;

public class TVOpenCommand implements AbstractCommand {

	private Television tv;
	
	public TVOpenCommand(){
		tv = new Television();
	}
	@Override
	public void excute() {
		tv.open();
	}

}
