package com.java2.threading;

import java.awt.List;
import java.util.ArrayList;

public class Racing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Horse h1 = new Horse();
		h1.start();
		
		HorseRunable h2 = new HorseRunable();
		Thread thr = new Thread(h2);
		thr.start();
		try {
			h1.join();
			thr.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("main ended");
		
		
		
	}

}
