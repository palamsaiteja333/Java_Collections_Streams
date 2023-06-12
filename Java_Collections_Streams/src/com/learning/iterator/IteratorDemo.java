package com.learning.iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {

		Collection<Integer> list = new ArrayList<>();
		
		list.add(3);
		list.add(23);
		list.add(32);
		
		Iterator<Integer> it = list.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
		
		
	}

}
