package com.ambition.structural.decorator.psw;

public class ComplexCipher extends CipherDecorator {

	public ComplexCipher(Cipher cipher) {
		super(cipher);
		// System.out.println();
	}

	@Override
	public String encript(String plainText) {

		String result = super.encript(plainText);
		result = reverse(result);
		return result;
	}

	public String reverse(String text) {
		String str = "";
		for (int i = text.length(); i > 0; i--) {
			str += text.substring(i - 1, i);
		}
		return str;
	}

}
