package com.ambition.behavioral.memento;

public class Client {

	public static void main(String[] args) {
		UserInfoDTO user = new UserInfoDTO();
		Caretaker c = new Caretaker();
		user.setAccount("qqq");
		user.setPassword("123456");
		user.setTelNo("110");
		System.out.println("state one:");
		user.show();
		c.setMemento(user.saveMemento());
		System.out.println("--------------");
		
		user.setPassword("654321");
		user.setTelNo("220");
		System.out.println("state two:");
		user.show();
		System.out.println("--------------");
		
		user.restorMemento(c.getMemento());
		System.out.println("return state one:");
		user.show();
		System.out.println("----------------");
		
	}
}
