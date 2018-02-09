package com.ambition.creational.abstractFactory;



public class Client {
	public static void main(String[] args) {
		Factory factory = (Factory) XMLUtil.getObject();
		
		Movie movie = factory.productMovie();
		TV tv = factory.productTV();
		
		movie.play();
		tv.play();
		
		
	}
}
