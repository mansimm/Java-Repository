package com.collection.practice;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;

public class ArrayDequeDemo {

	public static void main(String args[])
	{
		Deque<String> d = new ArrayDeque();
		//adds from rear
		d.add("A");
		d.add("C");
		d.add("D");
		System.out.println("Deque initially : "+d);
		
		//add from front end
		d.offerFirst("E");
		//add from rear end
		d.offerLast("X");
		
		System.out.println("Deque after adding from front and rear : "+d);
		//head
		System.out.println("Head : "+d.peek());
		System.out.println("Head : "+d.element());
		
		d.addFirst("S");
		d.addLast("B");
		System.out.println("After addFirst and addLast : "+d);
		
		System.out.println("poll first : "+d.peekFirst()+" poll last : "+d.pollLast());
		
		//deletion
		System.out.println("remove : "+d.remove());
		System.out.println("Current list : "+d);
		System.out.println("removeFirst : "+d.removeFirst());
		System.out.println("removeLast : "+d.removeLast());
		
		//delete all
		d.clear();
		System.out.println("isEmpty : "+d.isEmpty());
	
	}
}
