package com.ring.oo;

public class Student {
	int english;
	int math;
	int chinese;
	String name;

	// �ݩ� instance variable
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

	public void print() {
		System.out.println(english + "\t" + math + "\t" + chinese);
	}

	public int getAverage() {
		return (english + math + chinese) / 3;
	}
}
