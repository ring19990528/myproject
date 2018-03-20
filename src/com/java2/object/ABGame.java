package com.java2.object;

import java.util.Scanner;

public class ABGame {

	public static void main(String[] args) {
		String secret = "4231";
		//String nums = "1684";
		//String nums = "2587";
		//String nums = "8594";
		//String nums = "4218";
		//String nums = "4231";
		
		int a = 0;
		int b = 0;
		int length = secret.length();
		for(int k = 0;k>=0;k++){
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		for (int i = 0; i < length; i++) {
			char c = line.charAt(i);
		for(int j = 0;j < length;j++){
			if(c==secret.charAt(j)){
				if(i==j){
					a++;
				}else{
					b++;
				}
			}
		}
		}
		}
System.out.println(a+"A"+b+"B");
	}

}
