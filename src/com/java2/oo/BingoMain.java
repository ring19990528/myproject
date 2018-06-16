package com.java2.oo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import com.ring.Numbers;

//讀取bingo.txt，資料如下:
//	25
//	8,4,7,18,21,3,5,1,9,10
//	25表5X5共25顆球，產生時就給亂數排列並列印出來
//	如下:
//	 5 10 11  8 25
//	13  6 21  4  1 
//	22 15 23 19  7 
//	 2 20 18  3 14
//	17  9 12 24 16
public class BingoMain {
	List<Integer> numbers = new ArrayList<>();
	// int numbers[][] = new int [5] [5];
	int count = 25;
	int row = 5;
	int col = 5;

	public BingoMain(int count) {
		for (int i = 0; i < count; i++) {
			numbers.add(i + 1);
		}
		Collections.shuffle(numbers);
	}

	public void print() {
		for (int i = 0; i < count; i++) {
			int n = numbers.get(i);
			if (n < 10) {
				System.out.print(" ");
			}
			System.out.print(n < 10 ? " " : " ");
			System.out.print(n);

			if (i % 5 == 4) {
				System.out.println();
			}

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FileReader fr = new FileReader("bingo.txt");
			BufferedReader in = new BufferedReader(fr);
			String line = in.readLine();
			String tokens[] = line.split(",");

			BingoMain bm = new BingoMain(25);
			bm.print();
			for (int i = 0; i < 25; i++) {
				int num = Integer.parseInt(tokens[i]);

			
			for (int n : bm.numbers) {

				if (n < 10) {
					System.out.print(" ");
				}
				System.out.print(n < 10 ? " " : " ");
				System.out.print(n);

				if (i % 5 == 4) {
					System.out.println();
				}
				if (n == num) {
					System.out.print("*");
				}
			}
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
