package com.ring;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�H�U�֦~���̤j?");
		System.out.println("1)�P�N��");
		System.out.println("2)�ر�t");
		System.out.println("3)��°�");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int n = Integer.parseInt(line);
		if (n < 3) {
			System.out.println("no");

		} else {
			System.out.println("yes");
		}
	}

}
