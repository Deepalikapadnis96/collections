package com.demo.test.map;

import java.util.EnumMap;

public class EnumMap1 {
enum Size{
	SMALL,MEDIUM,LARGE
}
public static void main(String[] args) {
    // Creating an EnumMap of the Size enum

	EnumMap<Size, Integer> data = new EnumMap<>(Size.class);
	data.put(Size.SMALL, 1);
	System.out.println("data:" + data);
	
	EnumMap<Size, Integer> data2 = new EnumMap<>(Size.class);
	data2.put(Size.MEDIUM, 2);
	data2.put(Size.LARGE, 3);
	data2.putAll(data);
	System.err.println("data2:" + data2);
	 // Using the get() Method
    int value = data2.get(Size.MEDIUM);
    System.out.println("Value of MEDIUM: " + value);
}
}
