package com.ambition.creational.prototype.clone;

public class Email implements Cloneable {
	
	private Attachment attachment = null;
	public Email(){
		this.attachment = new Attachment();
	}
	
	@Override
	public Object clone() {
		Email clone = null;
		try {
			clone = (Email) super.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("clone failure");
			e.printStackTrace();
		}
		return clone;
	}
	
	public Attachment getAttachment(){
		return this.attachment;
	}

	public void display() {
		System.out.println("show email");
	}
}
