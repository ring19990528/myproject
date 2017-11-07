package com.ring;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("以下誰年紀最大?");
		System.out.println("1)周杰倫");
		System.out.println("2)華晨宇");
		System.out.println("3)梁朝偉");
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
