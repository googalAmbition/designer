package com.ambition.creational.builder;

public abstract class MealBuilder {
	protected Meal meal = new Meal();

	public abstract void food();

	public abstract void drink();

	public Meal getMeal() {
		return meal;
	}
}
