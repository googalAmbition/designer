package com.ambition.creational.factory;


public interface TV {
   default void play(){
	   System.out.println("TV play");
   }
}
