package com.ambition.creational.abstractFactory;

public class LeFactory implements Factory{

	@Override
	public TV productTV() {
		System.out.println("LeTV product");
		return new TCLTV();
	}

	@Override
	public Movie productMovie() {
		System.out.println("LeMovie product");
		return new TCLMovie();
	}
	
	

}
