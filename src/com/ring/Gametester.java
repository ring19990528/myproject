package com.ring;

import java.util.Scanner;

public class Gametester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = -1;
		int pos = 0;
		int row = 3;
		int col = 5;
		// col = column
		int hp = 100;
		while (n != 0) {
			System.out.println("�ШϥΪ̿�J�H�U���@�Ʀr(8�B2�B4�B6�B0):");
			Scanner scanner = new Scanner(System.in);
			String line = scanner.nextLine();
			n = Integer.parseInt(line);

			switch (n) {
			case 2:
				if (pos / col < row - 1) {
					// �V�U
					pos = pos + col;
					System.out.println(hp = hp - 5);

				} else {
					System.out.println(hp = hp - 30);
				}

				break;
			case 4:
				if (pos / col != 0) {
					// �V��
					pos = pos - 1;
					System.out.println(hp = hp - 5);

				} else {
					System.out.println(hp = hp - 30);
				}

				break;
			case 6:
				if (pos % col != col - 1) {
					pos = pos + 1;
					System.out.println(hp = hp - 5);
				}else {
					System.out.println(hp = hp - 30);
				}

				break;
			case 8:
				if (pos / col < 0) {
					// �V�W
					pos = pos - col;
					System.out.println(hp = hp - 5);

				} else {
					System.out.println(hp = hp - 30);
				}

				break;
			case 0:
				System.out.println("bye");
				break;
			}

		}
	}
}