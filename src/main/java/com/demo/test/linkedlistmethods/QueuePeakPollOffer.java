package com.demo.test.linkedlistmethods;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class QueuePeakPollOffer{
	public static void main(String[] args) {
		
	
Queue<String> ListOfData = new LinkedList<>();
ListOfData.add("deepali");
ListOfData.add("neha ");
System.out.println("list of data:" + ListOfData);
System.out.println("peak: " + ListOfData.peek());
System.out.println("poll:" + ListOfData.poll());
System.out.println("list of data:" + ListOfData);

System.out.println("offer:" + ListOfData.offer("monal"));
System.out.println("list of data:" + ListOfData);



	}
}
