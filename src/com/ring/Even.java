package com.ring;

import java.util.Scanner;

public class Even {

	public static void main(String[] args) {
		System.out.println("�п�J�@�ӼƦr:");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int n = Integer.parseInt(line);
		if (n % 2 ==0){
			System.out.println("�O����");
			
		}
		else{
			System.out.println("�O�_��");
		}

	}

}
