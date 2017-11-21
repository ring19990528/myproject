package com.ring;

import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Please enter a number:");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int n = Integer.parseInt(line);
		for (int i = 1; i <= n; i = i + 1) {
			if (i % 3 == 0) {
				continue;
			}
			System.out.print(i + " ");
		}
		System.out.println();
	}

}
