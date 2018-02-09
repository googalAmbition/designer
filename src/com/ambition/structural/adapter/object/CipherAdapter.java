package com.ambition.structural.adapter.object;


/**
 * 
 * @author ctc
 * 适配器类，加密适配器
 */
public class CipherAdapter extends DataOperation {

	private Caesar caesar;
	
	public CipherAdapter() {
		this.caesar = new Caesar();
	}
	@Override
	public String doEncrypt(int key, String ps) {
		return caesar.doEncript(key, ps);
		
	}

}
