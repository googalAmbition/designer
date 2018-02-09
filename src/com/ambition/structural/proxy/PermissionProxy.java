package com.ambition.structural.proxy;

public class PermissionProxy implements AbstractPermission {
	
	private RealPermission permission = new RealPermission();

	private int level = 0;
	@Override
	public void modifyUserInfo() {
		if (0 == level) {
			System.out.println("sorry haven't authority");
		}
		else if (1 == level) {
			permission.modifyUserInfo();
		}
	}

	@Override
	public void viewNote() {
		System.out.println("viewNote");
	}

	@Override
	public void publisdNote() {
		if (0 == level) {
			System.out.println("sorry haven't authority");
		}else if (1 == level) {
			permission.publisdNote();
		}
	}

	@Override
	public void modifyNote() {
		if (0 == level) {
			System.out.println("sorry haven't authority");
		}else if (1 == level) {
			permission.modifyNote();
		}
	}

	@Override
	public void setLevel(int level) {
		this.level =  level;
	}

}
