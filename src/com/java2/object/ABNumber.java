package com.java2.object;

public class ABNumber {
	String number;
	String secret;
	int a = 0;
	int b = 0;

	int result;
	public ABNumber(String number) {
		this.number = number;
	}

	public int validate(String secret) {
		this.secret = secret;
	
		int length = secret.length();
		for (int i = 0; i < length; i++) {
			char c = number.charAt(i);
			for (int j = 0; j < length; j++) {
				if (c == secret.charAt(j)) {
					if (i == j) {
						result = result+10;
					} else {
						result++;
					}
				}
			}
		}return result;
	}
}
