package com.ambition.creational.builder.te;


public class Person {

	private String name;
	private int age;
	private String email;
	private int number;

	public Person() {
	}

	public Person(Buider buider) {
		this.name = buider.name;
		this.age = buider.age;
		this.email = buider.email;
		this.number = buider.number;
	}

	public static class Buider {
		private String name;
		private int age;
		private String email;
		private int number;

		public Buider(String name, String email) {
			this.name = name;
			this.email = email;
		}

		public Buider setAge(int age) {
			this.age = age;
			return this;
		}

		public Buider setNumber(int number) {
			this.number = number;
			return this;
		}

		public Person Builder() {
			return new Person(this);
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", email=" + email + ", number=" + number + "]";
	}

	public static void main(String[] args) {
		Person person = new Person.Buider("tom", "123@qq.com").setAge(22).setNumber(100).Builder();
		System.out.println(person);
	}
}
