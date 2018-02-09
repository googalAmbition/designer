package com.ambition.structural.decorator.psw;

public class AdvanceCipher extends CipherDecorator {

	public AdvanceCipher(Cipher cipher) {
		super(cipher);
	}

	@Override
	public String encript(String plainText) {
		String result = super.encript(plainText);
		result = mod(plainText);
		return result;
	}

	public String mod(String text) {
		String str="";
		for (int i = 0; i < text.length(); i++) {
			String c = String.valueOf(text.charAt(i)%6);
			str += c;
		}
		return str;
	}
}
