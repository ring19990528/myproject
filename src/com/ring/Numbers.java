package com.ring;

import java.util.Scanner;

public class Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter a number:");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int n = Integer.parseInt(line);
		int i = 1;
		while (i <= n) {
			System.out.print(i + " ");
			if (i == 10) {
				break;
			}
			i = i + 1;
		}
	}
}
