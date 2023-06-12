package com.learning.generics;

import java.util.ArrayList;
import java.util.List;

public class CustomList<T> {

	
	List<T> list = new ArrayList<>();
	
	public void addElement(T element) {
		list.add(element);
		
	}
	
	public void removeElement(T element) {
		list.remove(element);
	}
	
	
	@Override
	public String toString() {
		return "CustomList [list=" + list + "]";
	}
	
}
