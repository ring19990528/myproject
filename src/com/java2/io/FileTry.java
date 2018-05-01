package com.java2.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOutputStream out;
		try {
			out = new FileOutputStream("data.text");
			out.write(65);
			out.write(66);
			out.write(67);
			out.flush();
			out.close();
		} catch (FileNotFoundException e) {
			System.out.print("FILE NOT FOUND!");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.print("FILE OUTPUT ERROR!");
			e.printStackTrace();
		}
		
	}

}
