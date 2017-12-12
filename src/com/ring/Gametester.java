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
			System.out.println("請使用者輸入以下任一數字(8、2、4、6、0):");
			Scanner scanner = new Scanner(System.in);
			String line = scanner.nextLine();
			n = Integer.parseInt(line);

			switch (n) {
			case 2:
				if (pos / col < row - 1) {
					// 向下
					pos = pos + col;
					System.out.println(hp = hp - 5);

				} else {
					System.out.println(hp = hp - 30);
				}

				break;
			case 4:
				if (pos / col != 0) {
					// 向左
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
					// 向上
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