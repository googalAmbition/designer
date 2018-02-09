package com.ambition.creational.builder;

public class SubMealBuilderA  extends MealBuilder{

	@Override
	public void food() {
		meal.setFood("A  apple");
	}

	@Override
	public void drink() {
		meal.setDrink("A  coffie");
	}

}
