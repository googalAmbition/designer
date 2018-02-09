package com.ambition.creational.builder;

public class Client {
	public static void main(String[] args) {
		MealBuilder builder = (MealBuilder) XMLUtil.getObject();
		Waiter waiter = new Waiter();
		waiter.setMealBuider(builder);
		Meal meal = waiter.contruct();
		System.out.println("contruct component");
		System.out.println(meal.getDrink());
		System.out.println(meal.getFood());
	}
}
