package com.demo.test.map;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMap1 {
	public static void main(String[] args) {

		// create a hashmap
		HashMap<String, Integer> alldata = new HashMap<>();

// add elements to hashmap/put
		alldata.put("java", 1);
		alldata.put("kafka", 2);
		System.out.println("hashmap:" + alldata);
//add element with duplicate key
		Integer value = alldata.put("java", 3);
		System.out.println("pu method " + alldata);

//create another HashMap
		HashMap<String, Integer> numbers = new HashMap<>();
		numbers.put("One", 1);
		numbers.put("Two", 4);

// Add all mappings from primeNumbers to numbers
		numbers.putAll(alldata);
		System.out.println("put all " + numbers);
		if (numbers.containsKey("java")) {
			System.out.println("java name is present in the Hashmap.");
		}

// check if key python is present
		if (!numbers.containsKey("Spain")) {
			// add entry if key already not present
			numbers.put("python", 5);
		}

		System.out.println("Updated HashMap:\n" + numbers);
		// check if value Java is present
	    if(numbers.containsValue(2)) {
	      System.out.println("2 is present on the list.");
	    }
	    
	    // check if the value Spain is present
	    if(!numbers.containsValue(7)) {
	      // add entry if Value already not present
	      numbers.put("kothlin", 7);
	    }

	    System.out.println("Updated HashMap:\n" + numbers);

	    // get the value with key 1
	    Integer value1 = numbers.get("java");
	    System.out.println("--> " + value1);
	    System.out.println("Key/Value mappings: " + numbers.entrySet());

	    // iterate through keys only
	    for (String key : numbers.keySet()) {
	      System.out.print(" " + key);
	      System.out.print(", ");
	    }
	 // iterate through values only
	    System.out.print("\nValues: ");
	    for (Integer value2 : numbers.values()) {
	      System.out.print(value2);
	      System.out.print(", ");
	    }
	    // iterate through key/value entries
	    System.out.print("\nEntries: ");
	    for (Entry<String, Integer> entry : numbers.entrySet()) {
	      System.out.print(entry);
	      System.out.print(", ");
	    }
	    

	  }
	
	}
	
