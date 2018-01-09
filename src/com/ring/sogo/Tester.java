package com.ring.sogo;

import java.util.ArrayList;

public class Tester {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		// <>範型與法標明 集合裡面的資料型態，如果沒有標明資料就不被限制
		list.add(31);
		list.add(47);
		// list.add("jay");
		list.add(13);
		list.add(37);
		// list.add(0.13);
		int n = list.get(1);
		// int n = list.get(2);
		// 要加(int)轉型
		System.out.println(list.size());
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();

		ArrayList<Customer> customers = new ArrayList<>();
		// Customer c1 = new Customer(10000);
		// SilverCustomer c2 = new SilverCustomer(10000);
		// GoldenCustomer c3 = new GoldenCustomer(10000);
		customers.add(new Customer(10000));
		customers.add(new SilverCustomer(10000));
		customers.add(new GoldenCustomer(10000));
		for (int j = 0; j < customers.size(); j++) {
			Customer c = customers.get(j);
			c.print();
		}

		// Customer c1 = new Customer(1000);
		// c1.print();
		// SilverCustomer c2 = new SilverCustomer(1000);
		// c2.print();
		// GoldenCustomer c3 = new GoldenCustomer(2000);
		// c3.print();

	}
		
		
	

}
