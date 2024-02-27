package com.demo.test.map;

import java.util.WeakHashMap;

public class WeakHashMap1 {
	public static void main(String[] args) {
        WeakHashMap<String, Integer> numbers = new WeakHashMap<>();

		 String two = new String("Two");
	        Integer twoValue = 2;
	        String four = new String("Four");
	        Integer fourValue = 4;

	        // Inserting elements
	        numbers.put(two, twoValue);
	        numbers.put(four, fourValue);
	        System.out.println("HashMap: " + numbers);

	        // Make the reference null
	        two = null;

	        // Perform garbage collection
	        System.gc();

	        System.out.println("HashMap after garbage collection: " + numbers);		
	
}
}