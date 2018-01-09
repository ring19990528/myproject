package com.ring.sogo;

public class Ticket {
	String date;
	String time;
	String start;
	String end;
	int price;

	public Ticket(String date, String time, String start, String end, int price) {
		this.date = date;
		this.time = time;
		this.start = start;
		this.end = end;
		this.price = price;
	}

	public void print() {
		System.out.print(date + "\t" + time + "\t" + start + "\t" + end + "\t" + price);
	}
}
