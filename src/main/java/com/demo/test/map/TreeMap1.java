package com.demo.test.map;

import java.util.TreeMap;

public class TreeMap1 {
public static void main(String[] args) {
	TreeMap<String, Integer> data = new TreeMap<>();
	//alphabeticall order
	data.put("money Plant", 2);
	data.put("bamboo", 7);

	System.out.println("data:" +  data);
	
	// Using entrySet()
    System.out.println("Key/Value mappings: " + data.entrySet());

    // Using keySet()
    System.out.println("Keys: " + data.keySet());

    // Using values()
    System.out.println("Values: " + data.values());
    
    // Using get()
    int value1 = data.get("bamboo");
    System.out.println("Using get(): " + value1);
}
}
