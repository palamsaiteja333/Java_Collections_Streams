package com.learning.functionalprogramming;

import java.util.Arrays;
import java.util.List;

public class FunctionalProgramming {

	public static void main(String[] args) {

		printNumbers(Arrays.asList(3, 2, 2354, 234));

	}

	private static void printNumbers(List<Integer> numbers) {

		System.out.println("*******print using Enhance for loop");
		for (int number : numbers) {
			System.out.print(number + ",");
		}

		System.out.println("\n *******print in the traditional way");
		for (int i = 0; i < numbers.size(); i++) {
			System.out.print(numbers.get(i) + ",");
		}

		System.out.println("\n*******printing in the Functional Programming way");
		numbers.stream().forEach(FunctionalProgramming::print); // Method Reference

		System.out.println("\n*******printing in the Functional Programming way using System.out");
		numbers.stream().forEach(System.out::print);

		System.out.println("\n\n####### Filtering using Streams ########");
		numbers.stream().filter(n -> n % 2 == 0).forEach(System.out::println);

	}

	private static void print(int number) {
		System.out.println(number);
	}
}