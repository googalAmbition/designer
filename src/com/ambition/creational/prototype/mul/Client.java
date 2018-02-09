package com.ambition.creational.prototype.mul;

/**
 * 
 * @author ctc
 * 相似对象复制
 */
public class Client {
	public static void main(String[] args) {
		Student stu1, stu2, stu3;
		stu1 = new Student.Builder("tom", 231, "male").setMajor("English").setCollage("software").setUniversity("University of Houston")
		        .builder();
		stu2 = stu1.clone();
		stu2.setName("jack");
		
		stu3 = stu1.clone();
		stu3.setName("lucy");
		stu3.setSex("femal");
		
		System.out.println(stu1);
		System.out.println(stu2);
		System.out.println(stu3);
	}
}
