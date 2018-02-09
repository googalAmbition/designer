package com.ambition.creational.abstractFactory;

public class TCLFactory implements Factory{

	@Override
	public TV productTV() {
		System.out.println("TCLTV product");
		return new TCLTV();
	}

	@Override
	public Movie productMovie() {
		System.out.println("TCLMovie product");
		return new TCLMovie();
	}
	
	

}
