package com.ring.oo;

public class Tester {

	public static void main(String[] args) {
		Student stu = new Student("���p��", 55, 66, 90);
		//Student stu = new Student("���p��");
		// stu.english = 55;
		// stu.math = 90;
		// stu.chinese = 66;
		
		stu.println();
		stu.print();
		int avg = stu.getAverage();
		System.out.println(stu.name + ":" + avg);
		GraduateStudent gstu = new GraduateStudent();
		gstu.print();
	}

}
