package com.ring.sogo;

public class Customer implements Destroyable{
	int amount;
	float discount = 0.05f;

	public Customer(int amount) {
		this.amount = amount;

	}

	public void print() {
		int total = (int) (amount * (1 - discount));
		System.out.println(amount + "\t" + total);
	}
	public void Customer(){
		
	}
	@Override
	public void destroy(){
		
	}
}
