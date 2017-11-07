package com.ring;

public class Niner {

	public static void main(String[] args) {
		for (int n = 2; n <= 9; n = n + 1) {
			for (int i = 1; i <= 9; i = i + 1) {
				if ((n * i) < 10) {
					System.out.println(n + " x " + i + " = " + " " + (n * i));
				} else {
					System.out.println(n + " x " + i + " = " + (n * i));
				}
			}
			System.out.println();
		}
	}
}
