package com.ambition.behavioral.iterator;

public class Client {

	
	public static void display(Television tv) {
		TVIterator it = tv.createiIterator();
		System.out.println("TV channel...");
		while (!it.isLast()) {
			System.out.println(it.currentChannel().toString());
			it.next();
		}
		
	}
	
	public static void reverseDisplay(Television tv) {
		TVIterator it = tv.createiIterator();
		it.setChannel(5);
		System.out.println("reverse channel");
		while(!it.isFirst()){
			it.previous();
			System.out.println(it.currentChannel().toString());
		}
	}
	
	public static void main(String[] args) {
		Television tv;
		tv = (Television) XMLUtil.getObject();
		display(tv);
		System.out.println("---------------");
		reverseDisplay(tv);
	}
}
