package com.ring;

public class Bubblesort {

	public static void main(String[] args) {
		int n[] = { 51, 23, 6, 65, 15 };
		for (int i = 0; i < n.length-1; i = i + 1) {
			for (int j = i + 1; j < n.length; j = j + 1) {
				
				if (n[i] > n[j]) {
					int tmp = n[i];
					n[i] = n[j];
					n[j] = tmp;
	
				}
				
			}
		}
		for(int num : n) {
			System.out.print(num + " ");
		}
	}
}
