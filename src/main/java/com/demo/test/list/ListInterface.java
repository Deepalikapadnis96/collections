package com.demo.test.list;

import java.util.ArrayList;
import java.util.List;

public class ListInterface {
 public static void main(String[] args) {
	List<Integer> list = new ArrayList<>();
	list.add(1);
	list.add(2);
	list.add(3);
	System.out.println("list " + list);
	Integer integer = list.get(2);
	System.out.println("get num " + integer);
	Integer remove = list.remove(1);
	System.out.println("removed num " + remove);
}
}
