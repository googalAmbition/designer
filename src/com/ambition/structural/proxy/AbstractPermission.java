package com.ambition.structural.proxy;

public interface AbstractPermission {
	void modifyUserInfo();
	void viewNote();
	void publisdNote();
	void modifyNote();
	void setLevel(int level);
}
