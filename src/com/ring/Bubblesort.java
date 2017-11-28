package com.ring;

public class Bubblesort {

	public static void main(String[] args) {
		int n[] = { 51, 23, 6, 65, 15 };
		for (int i = 0; i < n.length; i = i + 1) {
			for(int j = 0;j <= i;j = j+1){
				if (n[j] > n[j + 1]) {
					int tmp = n[j];
					n[j] = n[j + 1];
					n[j + 1] = tmp;
					System.out.print(n[j+1]);
				}
			}
			
		
		}
	}
}
