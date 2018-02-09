package com.ambition.behavioral.visitor;

public class Client {

	public static void main(String[] args) {
		Product b1 = new Book();
		Product a1 = new Apple();
		Product b2 = new Book();
		Visitor visitor;
		
		BuyBasket basket = new BuyBasket();
		basket.addProduce(b1);
		basket.addProduce(a1);
		basket.addProduce(b2);
		
		visitor = (Visitor) XMLUtil.getObject();
		visitor.setName("tomhanks");
		basket.accept(visitor);
	}
}
