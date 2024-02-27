package com.demo.test.list;

import java.util.Enumeration;
import java.util.*;

public class VectorList {
	public static void main(String args[]) {
		Vector<String> names = new Vector<String>();
		names.add("dd");
		names.add("ii");
		names.add("ss");

		System.out.println("Vector elements: " + names);
		Vector<String> data = new Vector<String>();
		data.add("sa");
		data.addAll(names);
		System.out.println("data:" + data);

		// Access Vector Elements --> Using get()
		String element = names.get(2);
		System.out.println("Element at index 2: " + element);

		// Using remove()
		String remove = names.remove(0);
		System.out.println("remove:" + remove);

		// Iterating vector using Enumeration
		Enumeration e = names.elements();
		while (e.hasMoreElements()) {
			System.out.println("itr : " + e.nextElement());
		}

	}
}
