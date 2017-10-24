package com.ring;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   System.out.println("請輸入你的名字:");
   Scanner scanner = new Scanner(System.in);
  String line = scanner.nextLine();
  System.out.println("Hello,"+ line);
  
  System.out.println("你幾歲呢?");
  line = scanner.nextLine();
  int age = Integer.parseInt(line);
  
  System.out.println(age);
  System.out.println(age > 17);
  
  System.out.println("你多高?");
  line = scanner.nextLine();
  int len = Integer.parseInt(line);
  System.out.println(len);
  System.out.println(len == 166);
    
	}

}
