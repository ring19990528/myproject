package com.java2.schedule;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

//有一文字檔儲存了課表資料(schedule.txt)
//請讀取資料後，設計程式可檢查是否有空檔?
//如:
//	請輸入星期(1~7):2
//	請輸入時(0~24):11
//	[有空檔]
//	請輸入星期(1~7):4
//	請輸入時(0~24):14
//	[有課:C004 English 到16時]


public class Main {
	Scanner scanner = new Scanner(System.in);
	
		public void study() {
			int function = 0;
			while(function!=2) {
				showFuctions();
				function = scanner.nextInt();
			switch(function) {
			case 1:
				System.out.println("請輸入星期(1~7):");
				int day = scanner.nextInt();
				System.out.println("請輸入時(0~24):");
				int time = scanner.nextInt();
		try {
			FileReader fr = new FileReader("schedule.txt");
			BufferedReader in = new BufferedReader(fr);
			String line = in.readLine();
			
				String[] tokens = line.split(",");
				
				String classroom = tokens[0];
				String name = tokens[1];
				int day1 = Integer.parseInt(tokens[2]);
				int time1 = Integer.parseInt(tokens[3]);
				int due1 = Integer.parseInt(tokens[4]);
				
				switch(day) {
				case 1:
					if(time>=time1||time<=(time1+due1)) {
						System.out.println("[有課:C003 Physical 到10時]");
						break;
					}else {
						System.out.println("[有空檔]");
						break;
					}
					
				case 2:
					if(time>=time1||time<=(time1+due1)) {
						System.out.println("[有課:C001 Java 到16時]");
					}
					else {
						System.out.println("[有空檔]");
					}
				
				}
				
			}
		 catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			case 2:
				return;
		}
		}
		}
		public static void main(String[] args) {
			Main main = new Main();
			main.study();
			
	}
		public void showFuctions() {
			System.out.println("請輸入功能(1or2)");
			System.out.println("1)查詢空檔時間");
			System.out.println("2)結束程式");
		}
	public void question() {
		System.out.println("請輸入星期(1~7):");
		int day = scanner.nextInt();
		System.out.println("請輸入時(0~24):");
		int time = scanner.nextInt();
	}

}
