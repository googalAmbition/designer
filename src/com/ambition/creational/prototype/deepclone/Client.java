package com.ambition.creational.prototype.deepclone;

import java.io.IOException;

public class Client {
	public static void main(String[] args) {
		Email email , copyEmail = null;
		email = new Email();
		try {
			copyEmail = (Email) email.deepClone();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("email == copyEmail?");
		System.out.println(email == copyEmail);
		
		System.out.println("email.getAttachment() == copyEmail.getAttachment()?");
		System.out.println(email.getAttachment() == copyEmail.getAttachment());
	}
}
