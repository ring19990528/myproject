package com.ring;

public class ScoreArray {

	public static void main(String[] args) {
		int scores[][] = new int [5][3];
		scores [0][0] = 10;
		scores [0][1] = 20;
		scores [0][2] = 30;
		scores [1][0] = 40;
		scores [1][1] = 50;
		scores [1][2] = 60;
		scores [2][0] = 70;
		scores [2][1] = 80;
		scores [2][2] = 90;
		scores [3][0] = 11;
		scores [3][1] = 22;
		scores [3][2] = 33;
		scores [4][0] = 44;
		scores [4][1] = 55;
		scores [4][2] = 66;
		
		for( int i = 0;i<5;i = i+1){
		System.out.print(scores [i][0] + "\t" 
		+ scores [i][1]+ "\t" + scores [i][2] + "\t");
		int average = (scores [i][0]  
				+ scores [i][1]+scores [i][2])/3;
		if( average <60){
			System.out.println(average + "*");
		}else{
			System.out.println(average);
		}
		} 
	}

}
