package com.ambition.behavioral.command;

public class TVChangeCommand implements AbstractCommand{
private Television tv;
	
	public TVChangeCommand(){
		tv = new Television();
	}
	
	@Override
	public void excute() {
		tv.change();
	}
}
