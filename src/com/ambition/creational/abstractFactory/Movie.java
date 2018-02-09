package com.ambition.creational.abstractFactory;

public interface Movie {
	default void play(){
		System.out.println("movie play");
	}
}
