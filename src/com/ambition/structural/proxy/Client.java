package com.ambition.structural.proxy;

public class Client {
	public static void main(String[] args) {
		AbstractPermission permission;
		permission = (AbstractPermission) XMLUtil.getObject();
		
		permission.modifyUserInfo();
		permission.viewNote();
		permission.publisdNote();
		permission.modifyNote();
		
		System.out.println("--------------");
		permission.setLevel(1);
		permission.modifyUserInfo();
		permission.viewNote();
		permission.publisdNote();
		permission.modifyNote();
	}
}
