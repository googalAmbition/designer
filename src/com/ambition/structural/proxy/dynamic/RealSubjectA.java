package com.ambition.structural.proxy.dynamic;

public class RealSubjectA implements AbstractSubject{

	@Override
	public void request() {
		System.out.println("RealSubject A");
	}

}
