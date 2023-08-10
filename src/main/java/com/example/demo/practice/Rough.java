package com.example.demo.practice;

public class Rough {

	public static void main(String[] args) {
		try {
			int result = divide(10, 0);
			System.out.println("try block:" + result);
		} catch (ArithmeticException e) {
			System.out.println("Error: Cannot divide by zero.");
		}

	}

	public static int divide(int dividend, int divisor) {
		return dividend / divisor;
	}
}
