package com.ring;

import java.util.Scanner;

public class Gametester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = -1;
		while (n != 0) {
			System.out.println("�ШϥΪ̿�J�H�U���@�Ʀr(8�B2�B4�B6�B0):");
			Scanner scanner = new Scanner(System.in);
			String line = scanner.nextLine();
			n = Integer.parseInt(line);

			switch (n) {
			case 2:
				System.out.println("�V�U");
				break;
			case 4:
				System.out.println("�V��");
				break;
			case 6:
				System.out.println("�V�k");
				break;
			case 8:
				System.out.println("�V�W");
				break;
			case 0:
				System.out.println("bye");
				break;
			}
		}
	}
}