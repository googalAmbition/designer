package com.ambition.creational.prototype.clone;

public class Client {
	public static void main(String[] args) {
		Email email , copyeEmail;
		
		 email = new Email();
		 copyeEmail = (Email) email.clone();
		 
		 System.out.println("email == copyeEmail?");
		 System.out.println(email==copyeEmail);
		 
		 System.out.println("email.getAttachment() == copyeEmail.getAttachment()?");
		 System.out.println(email.getAttachment() == copyeEmail.getAttachment());
	}
}
