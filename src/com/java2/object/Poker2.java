package com.java2.object;

import java.util.ArrayList;
import java.util.Random;

public class Poker2 {
	Random random = new Random();
	ArrayList<Integer> cards = new ArrayList<>();
	String flowers = "♠♥♦♣";

	public Poker2() {
		for (int i = 0; i < 52; i++) {
			cards.add(i+1);
		}
	}

	public void shuffle2() {
		for (int i = 0; i < cards.size(); i++) {
			int r = random.nextInt(52);
			cards.set(i, r);
		}
	}
	public void show2(){
		for(int i = 0;i< cards.size();i++){
			int c = cards.get(i);
			System.out.print((c % 13) + 1 + "" + (flowers.charAt(c / 13)) + " ");
			if ((i % 13) == 0) {
				System.out.println();
			}
		}
	}
}
