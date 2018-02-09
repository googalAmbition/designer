package com.ambition.structural.decorator.psw;

public class CipherDecorator implements Cipher {

	private Cipher cipher;
	
	public CipherDecorator(Cipher cipher) {
		this.cipher = cipher;
	}
	@Override
	public String encript(String plainText) {
		return cipher.encript(plainText);
	}

}
