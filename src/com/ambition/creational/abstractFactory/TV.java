package com.ambition.creational.abstractFactory;

public interface TV {
	default void play(){
		System.out.println("TV play");
	}
}
