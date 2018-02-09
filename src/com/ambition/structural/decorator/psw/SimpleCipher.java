package com.ambition.structural.decorator.psw;

public class SimpleCipher implements Cipher{

	@Override
	public String encript(String plainText) {
		String es = "";
		for (int i = 0; i < plainText.length(); i++) {
			char c = plainText.charAt(i);
			if (c >= 'a' && c <= 'z') {
				c += 6;
				if (c > 'z') {
					c -= 26;
				}
				if (c < 'a') {
					c += 26;
				}
			}
			if (c >= 'A' && c <= 'Z') {
				c += 6;
				if (c>'Z') {
					c -= 26;
				}
				if (c<'A') {
					c += 26;
				}
			}
			es += c;
		}
		return es;
	}
	

}
