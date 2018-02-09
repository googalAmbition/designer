package com.ambition.creational.singleton;

public class Singleton {
	///私有静态成员变量
	private static Singleton instance = null;
	
	//私有构造函数
	private Singleton(){}
	
	//静态共有工厂方法，返回唯一实例
	public  static Singleton getSingleton(){
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
}
