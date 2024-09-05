package com.sajjan.arrayproject;

public class ArrayGraterThanInteger {

	public static void main(String[] args) {
		int[] numbers = { 2, 4, 6, 8, 10, 12, 14, 16 };
		System.out.println("Numbers greater than 8: ");
		for (int x = 0; x < numbers.length; x++) {
			if (numbers[x] > 8) {
				System.out.println(numbers[x]);
			}
		}

	}

}
