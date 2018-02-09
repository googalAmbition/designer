package com.ambition.behavioral.strategy;

public class Client {

	public static void main(String[] args) {
		int[] arr = {1,3,5,7,9,2,4,8,6,0};
		int[] result;
//		ArrayHandler ah = new ArrayHandler();
		
		Sort sort= (Sort) XMLUtil.getObject();
		result = sort.sort(arr);
		
		for (int i : result) {
			System.out.println(i);
		}
	}
}
