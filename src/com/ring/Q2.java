package com.ring;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//輸入數字
		//ex.輸入三
		//出現
		//***
		//***
		//***
		System.out.println("請輸入一個數字:");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int n = Integer.parseInt(line);
		for (int i = 1;i <= n;i = i+1){ 
			for (int j = 1;j<= n;j=j+1) {
			System.out.print("*");
			
		}
			System.out.println();
			
		}	
		
	}
}
