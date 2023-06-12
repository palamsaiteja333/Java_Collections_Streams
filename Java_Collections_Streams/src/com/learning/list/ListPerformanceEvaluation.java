package com.learning.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListPerformanceEvaluation {
	
	public static void addIntegers(List<Integer> list, int number) {
		
		for(int i=0; i<number; i++) {
			list.add(i);
		}
		
		
	}

	public static void main(String[] args) {
		
		
		List<Integer> arrayList = new ArrayList<>();
		List<Integer> linkedList = new LinkedList<>();
		
		addIntegers(arrayList, 100);
		addIntegers(linkedList, 100);
		
		
	}
	
	
	

}
