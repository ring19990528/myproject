package com.java2.object;

import java.util.Random;

public class PokerTester {

	public static void main(String[] args) {
		Random random = new Random();
		int[] cards = new int[52];
		String flowers = "♠♥♦♣";
		for(int i = 0;i<cards.length;i++){
			cards[i] = i;
			System.out.println((i%13)+1+""+(flowers.charAt(i/13)));
		}
		for(int i = 0;i<cards.length;i++){
			int r = random.nextInt(52);
			int temp = cards[i];
			cards[i] = cards[r];
			cards[r] = temp;
		}
		for(int i = 0;i<cards.length;i++){
			int c = cards[i];
			System.out.print((c%13)+1+""+(flowers.charAt(c/13))+" ");
		}
	}

}
