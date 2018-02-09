package com.ambition.creational.prototype.deepclone;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OptionalDataException;
import java.io.Serializable;

public class Email implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Attachment attachment = null;
	
	public Email() {
		this.attachment = new Attachment();
	}
	
	public Object deepClone() throws IOException, ClassNotFoundException,OptionalDataException {
		//将对象写入流中
		ByteArrayOutputStream bao = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bao);
		oos.writeObject(this);
		
		ByteArrayInputStream bis = new ByteArrayInputStream(bao.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(bis);
		return ois.readObject();
	}
	
	public Attachment getAttachment(){
		return this.attachment;
	}
	
	public void show () {
		System.out.println("show email");
	}
}
