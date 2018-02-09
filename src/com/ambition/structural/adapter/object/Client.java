package com.ambition.structural.adapter.object;

public class Client {
	public static void main(String[] args) {
		DataOperation data = (DataOperation) XMLUtil.getObject();
		data.setPassword("i love you");
//		data.setPassword(521);
		String es = data.doEncrypt(521, data.getPassword());
		System.out.println("es:"+es);
		System.out.println("ms:" + data.getPassword());
		
	}
}
