package com.ambition.behavioral.strategy;

public class BubbleSort implements Sort{

	@Override
	public int[] sort(int[] arr) {
		int len = arr.length;
		for (int i = 0; i < len; i++) {
			for (int j = i; j < len; j++) {
				
				if (arr[i]>arr[j]) {
					arr[i] = arr[i]+arr[j];
					arr[j] = arr[i]-arr[j];
					arr[i] = arr[i]-arr[j];
				}
			}
		}
		System.out.println("BubbleSort");
		return arr;
	}

}
