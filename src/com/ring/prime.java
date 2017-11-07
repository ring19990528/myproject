package com.ring;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 49;
		boolean prime = true;
		for (int i = 2; i < n; i = i + 1) {
			if (n % i == 0) {
				// not prime
				prime = false;
				break;
				//break¸õ¥X°j°é
				//System.out.println("Not prime");
			}
		}
		if(prime){
			System.out.println(n+" is prime number!");
		}else{
			System.out.println(n+" is not prime number!");
		}
	}
}
