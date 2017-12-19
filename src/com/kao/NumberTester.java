package com.kao;

public class NumberTester {

	public static void main(String[] args) {
		for (int n = 1; n <= 33; n = n + 1) {
			System.out.print(n*3 + " ");
			if((n % 5) == 0){
				System.out.println();
			}
		}
	}
}

