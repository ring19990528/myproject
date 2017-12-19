package com.ibm;

public class NineLazy {

	public static void main(String[] args) {
		for (int j = 1; j < 10; j = j + 1) {
			for (int i = 2; i < 10; i = i + 1) {
				if ((i * j) < 10) {
					System.out.print(i + "*" + j + "=" + " " + (i * j)+" ");
			}else{
				System.out.print(i + "*" + j + "=" + (i * j)+" ");
			}
		}System.out.println();

	}
		
	}
}
