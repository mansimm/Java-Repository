package com.collection.practice;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Spliterator;

public class PriorityQueueDemo {

	public static void main(String args[])
	{
		PriorityQueue<Integer> p = new PriorityQueue();
		p.add(100);
		p.add(200);
		p.add(300);
		p.add(400);
		p.add(500);
		
		//check empty
		System.out.println("Empty check : "+p.isEmpty());
		
		System.out.println("Initial queue : "+p);
		//head
		System.out.println("Head : "+p.peek());
		System.out.println("Head : "+p.element());
		
		//deleting elements
		System.out.println("After remove() removes and returns head: "+p.remove());
		System.out.println("After poll() it removes and retrives head: "+p.poll());
		
		//iterator 
		System.out.println("Elements of queue are :");
		Iterator<Integer> it = p.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		//split iterator example
		System.out.println("Print que using spliterator :");
		Spliterator<Integer> sIt = p.spliterator();
		sIt.forEachRemaining(s->{System.out.println(s);});
		
		//deletes all the elements
		p.clear();
		//check empty
		System.out.println("Empty check : "+p.isEmpty());
		
	}
}
