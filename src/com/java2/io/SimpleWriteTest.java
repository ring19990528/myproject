package com.java2.io;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class SimpleWriteTest {

	public static void main(String[] args) {
		PrintStream out;
		try {
			out = new PrintStream("data.txt");
			out.println("ring");
			out.flush();
//			確認本機緩衝區內的資料將送出至對方
			out.close();
//			關閉資料流
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		
		}
		

	}

}
