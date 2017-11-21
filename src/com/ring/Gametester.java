package com.ring;

import java.util.Scanner;

public class Gametester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = -1;
		while (n != 0) {
			System.out.println("請使用者輸入以下任一數字(8、2、4、6、0):");
			Scanner scanner = new Scanner(System.in);
			String line = scanner.nextLine();
			n = Integer.parseInt(line);

			switch (n) {
			case 2:
				System.out.println("向下");
				break;
			case 4:
				System.out.println("向左");
				break;
			case 6:
				System.out.println("向右");
				break;
			case 8:
				System.out.println("向上");
				break;
			case 0:
				System.out.println("bye");
				break;
			}
		}
	}
}