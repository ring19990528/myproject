package com.java2.io;

public class Tester {

	class Animal {

		public void say() {
			
		}
	}
	
	class Cat extends Animal {
		@Override
		public void say(){
			System.out.println("meow-meow");
		}
		
	}

	class Dog extends Animal {
		@Override
		public void say(){
			System.out.println("arf-arf");
		}

	}

	class Duck extends Animal {
		@Override
		public void say(){
			System.out.println("quack-quack");
		}

	}
}