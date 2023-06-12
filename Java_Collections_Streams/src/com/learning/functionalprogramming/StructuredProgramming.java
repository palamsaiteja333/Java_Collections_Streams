package com.learning.functionalprogramming;

import java.util.Arrays;
import java.util.List;

public class StructuredProgramming {

	public static void main(String[] args) {

		printNumbers(Arrays.asList(3, 2, 2354, 234));

	}

	private static void printNumbers(List<Integer> numbers) {

		for(int number: numbers) {
			System.out.println(number);
		}
		
		System.out.println("print in the traditional way");
		
		for(int i=0; i<numbers.size();i++) {
			System.out.println(numbers.get(i));
		}
		
	}

}
