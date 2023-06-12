package com.learning.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsListDemo {
	
	
	static <X extends List> void duplicate(X list) {
		list.addAll(list);
	}

	public static void main(String[] args) {
		
		
		List<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(3);
		list.add(234);
		duplicate(list);
		System.out.println(list);

		 
	}

}
