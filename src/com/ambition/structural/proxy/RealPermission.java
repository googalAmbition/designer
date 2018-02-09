package com.ambition.structural.proxy;

public class RealPermission implements AbstractPermission{

	@Override
	public void modifyUserInfo() {
		System.out.println("modifyUserInfo");
	}

	@Override
	public void viewNote() {
		System.out.println("viewNote");
	}

	@Override
	public void publisdNote() {
		System.out.println("publisdNote");
	}

	@Override
	public void modifyNote() {
		System.out.println("modifyNote");
	}

	@Override
	public void setLevel(int level) {
	}

}
