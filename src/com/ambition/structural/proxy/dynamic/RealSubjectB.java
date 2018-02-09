package com.ambition.structural.proxy.dynamic;

public class RealSubjectB implements AbstractSubject {

	@Override
	public void request() {
		System.out.println("RealSubject B");
	}

}
