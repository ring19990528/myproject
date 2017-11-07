package com.ring;

public class prime1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int n = 2; n < 1000; n = n + 1) {
			boolean prime = true;
			for (int i = 2; i < n; i = i + 1) {
				if ((n % i) == 0) {
					prime = false;
					break;
				}
			}
				if (prime) {
					System.out.print(n + " ");
				}
			}

		}
	}

