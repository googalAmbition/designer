package com.ambition.creational.simpleFactory;


public interface TV {
   default void play(){
	   System.out.println("TV play");
   }
}
