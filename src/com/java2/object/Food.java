package com.java2.object;

public class Food {

	private int strawberry;
	private int peach;
	private int apple;
	int price;
	
	public Food(int strawberry,int peach,int apple){
		this.strawberry = strawberry;
		this.peach = peach;
	}
	public Food(int price){
		this.price = price;
		
	}
	public void print(){
		System.out.println();
	}
	public int total() {
		return(strawberry + peach + apple);
	}
	

}
