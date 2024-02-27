package com.demo.test.set;

import java.util.EnumSet;

public class EnumSet1 {
	class Main {
	    // an enum named Size
	    enum Size {
	        SMALL, MEDIUM, LARGE, EXTRALARGE
	    }
	    
	    public static void main(String[] args) {

	        // Creating an EnumSet using allOf()
	        EnumSet<Size> sizes = EnumSet.allOf(Size.class);
	        System.out.println("EnumSet: " + sizes);
	        
	        // Creating an EnumSet using noneOf()
	        EnumSet<Size> sizes1 = EnumSet.noneOf(Size.class);
	        System.out.println("EnumSet: " + sizes1);
	        
	     // Creating an EnumSet using range()
	        EnumSet<Size> sizes2 = EnumSet.range(Size.MEDIUM, Size.EXTRALARGE);
	        System.out.println("EnumSet: " + sizes2);
	        
	     // Using of() with a single parameter
	        EnumSet<Size> sizes4 = EnumSet.of(Size.MEDIUM);
	        System.out.println("EnumSet1: " + sizes4);

	    }
	}
}
