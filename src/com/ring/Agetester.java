package com.ring;

import java.util.Scanner;

public class Agetester {

	public static void main(String[] args) {
		System.out.println("�п�J�A���~��:");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int age = Integer.parseInt(line);
		if (age < 7){
			System.out.println("���X��?");
		}else{
			if(age < 13){
				System.out.println("�p�Ƕ�?");
			}else{
				if(age <16){
					System.out.println("�ꤤ��?");
			}else{
				if(age <19){
					System.out.println("����?");
			}else
				{
					System.out.println("......");
					for(int i = 1;i <=5;i = i+1){
						System.out.println("����������");
					}
				}
			}
				
		}

	}

}
	}
	
