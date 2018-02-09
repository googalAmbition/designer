package com.ambition.creational.builder;

public class Waiter {
	private MealBuilder mealBuilder;
	public void setMealBuider(MealBuilder mealBuilder){
		this.mealBuilder = mealBuilder;
	}
	
	public Meal contruct(){
		mealBuilder.food();
		mealBuilder.drink();
		return mealBuilder.getMeal();
	}
}
