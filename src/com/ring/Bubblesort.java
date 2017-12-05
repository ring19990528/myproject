package com.ring;

public class Bubblesort {

	public static void main(String[] args) {
		int n[] = { 51, 23, 6, 65, 15 };
		for (int i = 0; i <= 3; i = i + 1) {
			for (int j = i + 1; j < n.length; j = j + 1) {
				if (n[i] > n[i + 1]) {
					int tmp = n[i];
					n[i] = n[i + 1];
					n[i + 1] = tmp;
					System.out.print(n[i + 1]);
				}
				
			}
		}
	}
}
