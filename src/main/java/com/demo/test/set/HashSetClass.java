package com.demo.test.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetClass {
	/*
	 * 
	 * 
	 * The Set interface of the Java Collections framework provides the features of
	 * the mathematical set in Java. It extends the Collection interface.
	 * 
	 * Unlike the List interface, sets cannot contain duplicate elements.
	 * 
	 */
	public static void main(String[] args) {

		// Using add() method
		HashSet<Integer> evenNumber = new HashSet<>();
		evenNumber.add(2);
		evenNumber.add(6);
		evenNumber.add(4);
		System.out.println("evenNumber:" + evenNumber);

		// --- Using addAll() method SAME (UNION OF SET)
		HashSet<Integer> number = new HashSet<>();

		number.addAll(evenNumber);
		number.add(9);
		number.add(8);
		System.out.println("after adding all:" + number);

		// Using access method-->iterator
		// Calling iterator() method
		Iterator<Integer> iterate = number.iterator();
		System.out.print("HashSet using Iterator: ");

		// Accessing elements
		while (iterate.hasNext()) {
			System.out.print(iterate.next());
			System.out.print(", ");

			// Using remove() method
			//boolean remove = number.remove(4);
			//System.out.println("remove" + remove);
			// Intersection of two sets
			//number.retainAll(evenNumber);
			//System.out.println("retain all:" + number);
//union set samecode as add all
//Intersection of Sets      : create 2 set then use retainall it will show duplicate one [ number.retainAll(evenNumbers); ]
//Difference of Sets        : will give the count of duplicate set used        [ number.removeAll(evenumbers); ]
//Subset                    : To check if a set is a subset of another set or not, we can use the containsAll() method i.e if evenNumber contail the number some same as number then will return true
////Subset  linkedlist      : To check if a set is a subset of another set or not, we can use the containsAll()/removeall()	 method i.e if evenNumber contail the number some same as number then will return true


		}
	}
}