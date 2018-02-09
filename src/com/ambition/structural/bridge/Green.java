package com.ambition.structural.bridge;
/**
 * 
 * @author ctc
 * 具体实现类
 */
public class Green implements Color {

	@Override
	public void bepaint(String penType, String name) {
		System.out.println(penType + "green" + name + ".");
	}
	
	
}
