package com.demo.test.arraylistmethods;

import java.util.ArrayList;
import java.util.List;

public class Iterator {
public static void main(String[] args) {
	 List<String> listOfData = new ArrayList<>();
	 listOfData.add("deepali");
	 listOfData.add("dd");
	 System.out.println("list of data:" + listOfData);
	 for(String data : listOfData) {
		 System.out.println(data);
	 }
}
}
