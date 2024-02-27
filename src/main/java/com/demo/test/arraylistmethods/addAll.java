package com.demo.test.arraylistmethods;

import java.util.ArrayList;

public class addAll {
public static void main(String[] args) {
	ArrayList<Integer> num = new ArrayList<>();
	num.add(1);
	num.add(2);
	System.out.println("number " + num);
	
	ArrayList<Integer> oddNum = new ArrayList<>();
	oddNum.add(3);
	oddNum.add(5);
	oddNum.addAll(num);
	System.err.println("oddNum :" + oddNum);

}
}
