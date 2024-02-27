package com.demo.test.linkedlistmethods;

import java.util.LinkedList;

public class AllMethods {
	public static void main(String[] args) {

		// create linkedlist
		LinkedList<String> animals = new LinkedList<>();

		// Add elements to LinkedList
		animals.add("Dog");
		animals.add("Cat");
		animals.add("Cow");
		System.out.println("LinkedList: " + animals);

		// -----add----------
		animals.add(1, "Horse");
		System.out.println("add : " + animals);

		// -----get----------
		String string = animals.get(3);
		System.out.println("get : " + string);

		// -----set----------
		animals.set(2, "kafka");
		System.out.println("set : " + animals);
		
		// -----remove----------
		animals.remove(0);
		System.out.println("remove : " + animals);

/*
 
 
 Methods	Description
contains()	checks if the LinkedList contains the element
indexOf()	returns the index of the first occurrence of the element
lastIndexOf()	returns the index of the last occurrence of the element
clear()	removes all the elements of the LinkedList
iterator()	returns an iterator to iterate over LinkedList
 
 
 
 Since the LinkedList class also implements the Queue and the Deque interface, 
 it can implement methods of these interfaces as well. Here are some of the commonly used methods:
 */

	}

}
