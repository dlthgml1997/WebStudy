package com.basic;

public class OperatorTest {

	public static void main(String[] args) {
		int a = 3, b = 5, y = 7;
		int x = ++a + b++ + y++; //16
		int z = ++a + ++b + y++; //20
		System.out.println(x);
		System.out.println(z);
	
		int c = ++a; 
		int d = b--;

	}

}