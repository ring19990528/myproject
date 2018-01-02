package com.ring.oo;

public class GraduateStudent extends Student {
	int thesis;

	public GraduateStudent() {
		super();
	//super只能在第一行後面()空空的是呼叫副類別的建構子
	}

	@Override
	//@ annotation標示
	public void print() {
		super.print();
	//super.後面呼叫副類別的print()
		System.out.println(pass);
		System.out.println(english + "\t" + math + "\t" + chinese + "\t" + thesis);
	}
	
	public int getAverage() {
		return (english + math + chinese + thesis) / 4;
	}
}
