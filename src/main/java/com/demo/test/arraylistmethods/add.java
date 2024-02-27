package com.demo.test.arraylistmethods;

import java.util.ArrayList;

public class add {
public static void main(String[] args) {
	 ArrayList<String> list1 = new ArrayList<>();
	 //add method
	 list1.add("depali");
	 list1.add("neha");
	 System.out.println("add data :" + list1);
	 
	 ArrayList<String> list2 = new ArrayList<>();
	 //addAll method
	 list2.addAll(list1);
	 System.out.println("addAll data : " +list2);
}
}
