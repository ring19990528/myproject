package com.java2.schedule;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2 {
	public void readcourses() {
		FileReader fr;
		
		try {
			fr = new FileReader("schedule.txt");
			BufferedReader in = new BufferedReader(fr);
			String line = in.readLine();
			List<Course> c = new ArrayList<>();
			String[] token = line.split(",");
			for(int i = 0;i<token.length;i++) {
				String id = token[0];
				String name = token[1];
				int weekday = Integer.parseInt(token[2]);
				int hour = Integer.parseInt(token[3]);
				int duration = Integer.parseInt(token[4]);
				line = in.readLine();
				c.add(new Course(id, name, weekday, hour, duration));		
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

public void main2() {
	Scanner scanner = new Scanner(System.in);
	int function = 0;
	while (function != 2) {
		System.out.println("請輸入星期(1~7):");
		int weekday1 = scanner.nextInt();
		System.out.println("請輸入時(0~24):");
		int hour1 = scanner.nextInt();
		List<Course> courses = new ArrayList<>(); 
		readcourses();
		boolean avail = true;
		for (Course c : courses) {
			if (!c.isAvailable(weekday1, hour1)) {
				System.out.print(
						"[有課:" + c.getId() + " " + c.getName() + " 到" + (c.getHour() + c.getDuration()) + "時]");
				avail = false;
				break;
			}
		}
		if (avail) {
			System.out.println("[有空檔]");
		}
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main2 m = new Main2();
		m.main2();
	}

}
