package com.demo.test.set;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet1 {
	public static void main(String[] args) {
		
	
	// Creating an arrayList of even numbers
		LinkedHashSet<Integer> evenNumbers = new LinkedHashSet<>();
    evenNumbers.add(2);
    evenNumbers.add(4);
    System.out.println("use using arraylist also: " + evenNumbers);

    // Creating a LinkedHashSet from an ArrayList
    LinkedHashSet<Integer> numbers = new LinkedHashSet<>(evenNumbers);
    System.out.println("LinkedHashSet: " + numbers);

    //addall
    numbers.addAll(evenNumbers);
    numbers.add(9);
    System.out.println("after: " + numbers);
    
 // Calling the iterator() method
    Iterator<Integer> iterate = numbers.iterator();
    System.out.print("LinkedHashSet using Iterator: ");

    // Accessing elements
    while(iterate.hasNext()) {
        System.out.print("iterate:" + iterate.next());
        System.out.print(", ");
    }

}
}