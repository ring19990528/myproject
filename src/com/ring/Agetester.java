package com.ring;

import java.util.Scanner;

public class Agetester {

	public static void main(String[] args) {
		System.out.println("請輸入你的年齡:");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int age = Integer.parseInt(line);
		if (age < 7){
			System.out.println("幼稚園?");
		}else{
			if(age < 13){
				System.out.println("小學嗎?");
			}else{
				if(age <16){
					System.out.println("國中嗎?");
			}else{
				if(age <19){
					System.out.println("高中?");
			}else
				{
					System.out.println("......");
					for(int i = 1;i <=5;i = i+1){
						System.out.println("哈哈哈哈哈");
					}
				}
			}
				
		}

	}

}
	}
	
