package com.java2.oo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MazeMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileReader fr = new FileReader("maze.txt");
			BufferedReader in = new BufferedReader(fr);
			String line = in.readLine();
			String tokens[]= line.split(",");
			int col = Integer.parseInt(tokens[0]);
			int row = Integer.parseInt(tokens[1]);
			line = in.readLine();
			int trapCount = Integer.parseInt(line);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
