package com.demo.test.list;

import java.util.Stack;

public class StackList {
	public static void main(String[] args) {
        Stack<String> animals= new Stack<>();

        // Add elements to Stack
        animals.push("Dog");
        animals.push("Horse");
        animals.push("Cat");
        System.out.println("Stack: " + animals);
        
        //pop/remove
        String pop = animals.pop();
        System.out.println("pop/remove:" + pop);
        
        //peak() : it will give last element horse cz we removecat above
        String peek = animals.peek();
        System.out.println("peak:" + peek);
        
     // Search an element : it will give the index position
        int position = animals.search("Horse");
        System.out.println("Position of Horse: " + position);
    }
}
