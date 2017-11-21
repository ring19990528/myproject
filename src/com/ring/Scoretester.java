package com.ring;

public class Scoretester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 100;
		System.out.println(score/10);
		int level = score/10;
		switch(level){
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("Failed");
			break;
		case 6:
			System.out.println("Passed");
			break;
		case 7:
			System.out.println("good");
			break;
		case 8:
			System.out.println("Great");
			break;
		case 9:
			System.out.println("Excellent");
			break;
		case 10:
			System.out.println("Excellent");
			break;
		}
	}

}
