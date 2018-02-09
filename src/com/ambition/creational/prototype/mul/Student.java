package com.ambition.creational.prototype.mul;


public class Student implements Cloneable{
	
	private String name;
	private String sex;
	private int age;
	private String major;
	private String collage;
	private String university;
	
	public Student() {}
	public Student(Builder builder) {
		this.name = builder.name;
		this.sex = builder.sex;
		this.age = builder.age;
		this.major = builder.major;
		this.collage = builder.collage;
		this.university = builder.university;
	}
	
	public static class Builder{
		private String name;
		private String sex;
		private int age;
		private String major;
		private String collage;
		private String university;
		
		public Student builder() {
			return new Student(this);
		}
		
		public Builder(String name,int age, String sex) {
			this.name = name;
			this.age = age;
			this.sex = sex;
		}
		
		public Builder setMajor(String major) {
			this.major = major;
			return this;
		}
		
		public Builder setCollage(String collage) {
			this.collage = collage;
			return this;
		}
		
		public Builder setUniversity(String university) {
			this.university = university;
			return this;
			
		}
	}
	
	public Student clone() {
		Student cpsStudent = null;
		try {
			cpsStudent = (Student) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return cpsStudent;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getCollage() {
		return collage;
	}

	public void setCollage(String collage) {
		this.collage = collage;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", sex=" + sex + ", age=" + age + ", major=" + major + ", collage=" + collage
		        + ", university=" + university + "]";
	}
	
	
}
