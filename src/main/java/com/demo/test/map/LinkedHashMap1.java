package com.demo.test.map;

import java.util.LinkedHashMap;

public class LinkedHashMap1 {
public static void main(String[] args) {
	LinkedHashMap<String, Integer> linkedMap = new LinkedHashMap<>();
	linkedMap.put("levis", 1);
	linkedMap.put("ginger", 2);
	System.out.println("linkedHash Map: "+ linkedMap);
    // Creating a LinkedHashMap from other LinkedHashMap
	LinkedHashMap<String, Integer> data = new LinkedHashMap<>(linkedMap);
	data.put("kyrus", 3);
	System.out.println("linkedHash Map affter: "+ data);
	// Using entrySet()
    System.out.println("Key/Value mappings: " + data.entrySet());

    // Using keySet()
    System.out.println("Keys: " + data.keySet());

    // Using values()	
    System.out.println("Values: " + data.values());
    
 // Using get()
    int value1 = data.get("ginger");
    System.out.println("Returned Number: " + value1);
    
 // remove method with single parameter
    int value = data.remove("levis");
    System.out.println("Removed value: " + value);

    // remove method with two parameters
    boolean result = data.remove("ginger", 3);
    System.out.println("Is the entry Three removed? " + result);

}
}
