package com.ring;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("請輸入一個數字:");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int n = Integer.parseInt(line);
		for (int i = 1; i <= n; i = i + 1) {
			for (int j = 1; j <= n; j = j + 1) {
			if (j <= i) {
			System.out.print("*");
				}
			if (i < j) {
				System.out.print("#");
			}
			
			}
			System.out.println();
		}
	}
}
