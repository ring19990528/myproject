package com.ring;

public class DateOfYear {

	public static void main(String[] args) {
		int n = 32;
		int m[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		for (int i = 0; i < m.length; i = i + 1) {
			if (n < m[i]) {
				System.out.print((i + 1) + "��" + n + "��");
				break;
			} else{
				n = n - m[i];
			}
		}
		// switch (n%30){
		// case 1:
		// System.out.print("1��");
		// break;
		// case 2:
		// System.out.print("2��");
		// break;
		// case 3:
		// System.out.print("3��");
		// break;
		// case 4:
		// System.out.print("4��");
		// break;
		// }

	}

}
