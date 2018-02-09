package com.ambition.behavioral.visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BuyBasket {
	private List<Product> list = new ArrayList<Product>();
	
	public void accept(Visitor visitor){
		Iterator<Product> it = list.iterator();
		
		while (it.hasNext()) {
			it.next().accept(visitor);	
		}
	}
	
	public void addProduce(Product product){
		list.add(product);
	}
	
	public void removeProduct(Product product) {
		list.remove(product);
	}
}
