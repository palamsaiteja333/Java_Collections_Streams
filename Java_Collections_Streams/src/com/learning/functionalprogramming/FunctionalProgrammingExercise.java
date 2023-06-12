package com.learning.functionalprogramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FunctionalProgrammingExercise {

	public static void main(String[] args) {

		printNumbers(Arrays.asList(3, 2, 2354, 234, 5, 7, 23, 33, 44, 46, 8));
		
		List<String> courses = new ArrayList<>(Arrays.asList("Spring", "Spring Boot", "Even", "numbers:" , "Filtering", "using", "Streams"));
		
		stringExercise(courses);

	}

	private static void stringExercise(List<String> courses) {
		
		System.out.println("\n\n####### Printing courses ########");
		courses.stream()
		.forEach(System.out::println);
		
		System.out.println("\n\n####### Printing courses containing Spring ########");
		courses.stream()
		.filter(c -> c.contains("Spring"))
		.forEach(System.out::println);
		
		System.out.println("\n\n####### Printing courses with min 6 characters ########");
		courses.stream()
		.filter(c -> c.length() >=6)
		.forEach(System.out::println);
		
		System.out.println("\n\n####### Printing the number of characters in each course name ########");
		courses.stream()
		.map(n -> n +  " " + n.length())
		.forEach(System.out::println);
		
	}

	private static void printNumbers(List<Integer> numbers) {

		System.out.println("\n\n####### Even numbers: Filtering using Streams ########");
		numbers.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
		
		System.out.println("\n\n####### Odd numbers: Filtering using Streams ########");
		numbers.stream().filter(n -> n % 2 == 1).forEach(System.out::println);
		

		System.out.println("\n\n####### Odd numbers: Filtering using Streams ########");
		numbers.stream().filter(n -> n % 2 == 1).forEach(System.out::println);
		
		System.out.println("\n\n####### cube of Odd numbers ########");
		numbers.stream()
		.filter(n -> n % 2 == 1)
		.map(n -> n * n * n)
		.forEach(System.out::println);

		
	}

}