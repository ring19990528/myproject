package com.ring;

import java.util.Random;

public class VariableTester {
	public static void main(String[] args){
		int age = 0;
		float weight = 69.5f;
		char c = 65;
		char c2 = 'Z';
		int i = c2;
		System.out.println(i);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
		//System.out.println((int)c2);
		boolean pass = true;
		System.out.println(pass);
		
		Random r = new Random();
		int n1 = r.nextInt(6)+1;
		int n2 = r.nextInt(6)+1;
		int n3 = r.nextInt(6)+1;
		int n4 = r.nextInt(6)+1;
		System.out.println(3>=2);
		
		String s = new String("Hello");
		int len = s.length();
		System.out.println("len:"+len);
		System.out.println(s.charAt(0));
		 
		float f = 11.0f;
		int x = 12;
		int y = 5;
		float z = f / y;
		System.out.println(z);
		System.out.println(x <=3 || x >=5);
		System.out.println(x >> 2);
		System.out.println(x <<99);
		x = x + 1;
		//x++;
		
		System.out.println(x);
		//字串轉整數
		String data = "123";
		int n = Integer.parseInt(data);
		
		//整數轉字串
		String mydata = String.valueOf(n);
		
				
		
		
		
	}
}
