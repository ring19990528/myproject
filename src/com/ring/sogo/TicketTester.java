package com.ring.sogo;

public class TicketTester {

	public static void main(String[] args) {
		Ticket t1 = new Ticket("2018-01-08", "18:30", "ªQ¤s", "¤K°ô", 65);
		t1.print();
		int n[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		for (int i = 0; i < 30; i++) {
			for (int j = 0; j < n.length; i++) {
				System.out.print("*"+"\t");
			}

		}
	}
}
