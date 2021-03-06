package com.ring.oo;

public class Student {
	int english;
	//加上private只有student才能用
	protected int math;
	//加上protected不同package繼承此類別的也能使用
 	int chinese;
	String name;
	static int pass = 60;
	// 屬性 instance variable(Field)
	// static 類別層級的變數XX
	// static 只取static層級的用 instance v不能一起用
	// public 可以供所有package使用 沒有public只能給同一個package使用
	public Student() {
	// 空的建構子才可以繼承(extends)
	}

	public Student(String name, int english, int chinese, int math) {
		this.english = english;
		this.math = math;
		this.chinese = chinese;
		this.name = name;
	// 區域變數local variable
	}

	public Student(String name) {
		this.name = name;
	}

	public static void println() {
		System.out.println("hello");
	//System.out.println("hello" + name);
	//上一句不能用因為name是instance variable
	// static 只取static層級的用 instance v不能一起用
	}

	public void print() {
		System.out.println(pass);
		System.out.println(english + "\t" + math + "\t" + chinese);
	}

	public int getAverage() {
		return (english + math + chinese) / 3;
	}
}
