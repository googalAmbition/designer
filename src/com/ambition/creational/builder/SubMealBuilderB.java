package com.ambition.creational.builder;

public class SubMealBuilderB  extends MealBuilder{

	@Override
	public void food() {
		meal.setFood("B  apple");
	}

	@Override
	public void drink() {
		meal.setDrink("B  coffie");
	}

}
