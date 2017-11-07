package com.ring;

public class Niner2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int n = 1; n <= 9; n = n + 1) {
			for (int i = 2; i <= 5; i = i + 1) {
				if ((n * i) < 10) {
					System.out.print(i + "x" + n + "=" + " " + (n * i) + "\t");
				} else {
					System.out.print(i + "x" + n + "=" + (n * i) + "\t");
				}
			}
			System.out.println();
		}
	}

}
