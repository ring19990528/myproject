package com.ring.oo;

public class Student {
	int english;
	int math;
	int chinese;
	String name;
	static int pass = 60;
	// �ݩ� instance variable(Field)
	// static ���O�h�Ū��ܼ�XX
	// static �u��static�h�Ū��� instance v����@�_��

	public Student() {
	// �Ū��غc�l�~�i�H�~��(extends)
	}

	public Student(String name, int english, int chinese, int math) {
		this.english = english;
		this.math = math;
		this.chinese = chinese;
		this.name = name;
	// �ϰ��ܼ�local variable
	}

	public Student(String name) {
		this.name = name;
	}

	public static void println() {
		System.out.println("hello");
	//System.out.println("hello" + name);
	//�W�@�y����Φ]��name�Oinstance variable
	// static �u��static�h�Ū��� instance v����@�_��
	}

	public void print() {
		System.out.println(pass);
		System.out.println(english + "\t" + math + "\t" + chinese);
	}

	public int getAverage() {
		return (english + math + chinese) / 3;
	}
}
