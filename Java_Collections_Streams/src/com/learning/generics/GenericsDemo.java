package com.learning.generics;

public class GenericsDemo {

	public static void main(String[] args) {

		CustomList<String> c = new CustomList<>();

		c.addElement("Sai");
		c.addElement("Teja");

		CustomList<Integer> c1 = new CustomList<>();

		c1.addElement(2);
		c1.addElement(5);
		
		System.out.println(c);

		System.out.println(c1);
	}

}
