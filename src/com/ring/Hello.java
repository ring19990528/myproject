package com.ring;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   System.out.println("�п�J�A���W�r:");
   Scanner scanner = new Scanner(System.in);
  String line = scanner.nextLine();
  System.out.println("Hello,"+ line);
  
  System.out.println("�A�X���O?");
  line = scanner.nextLine();
  int age = Integer.parseInt(line);
  
  System.out.println(age);
  System.out.println(age > 17);
  
  System.out.println("�A�h��?");
  line = scanner.nextLine();
  int len = Integer.parseInt(line);
  System.out.println(len);
  System.out.println(len == 166);
    
	}

}
