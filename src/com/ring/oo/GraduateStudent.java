package com.ring.oo;

public class GraduateStudent extends Student {
	int thesis;

	public GraduateStudent() {
		super();
	//super�u��b�Ĥ@��᭱()�ŪŪ��O�I�s�����O���غc�l
	}

	@Override
	//@ annotation�Х�
	public void print() {
		super.print();
	//super.�᭱�I�s�����O��print()
		System.out.println(pass);
		System.out.println(english + "\t" + math + "\t" + chinese + "\t" + thesis);
	}
	
	public int getAverage() {
		return (english + math + chinese + thesis) / 4;
	}
}
