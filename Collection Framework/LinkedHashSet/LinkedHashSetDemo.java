package com.collection.practice;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class LinkedHashSetDemo {
	public static void main(String args[])
	{
		Set<String> mySet = new LinkedHashSet<String>();
		mySet.add("A");
		mySet.add("B");
		mySet.add("C");
		mySet.add("Zebra");
		
		System.out.println(mySet);
		System.out.println("Set is empty or not : "+mySet.isEmpty());
		
		List<String> list = new LinkedList<String>();
		list.add("A");//set won't take duplicate elements
		list.add("E");
		list.add("F");
		
		mySet.addAll(list);
		System.out.println("Set after adding another collection : "+mySet);
		
		//size
		System.out.println("Size of set: "+mySet.size());
		
		//iterate using iterator
		Iterator<String> iterator = mySet.iterator();
		System.out.println("Iterating using iterator, order of insertion will be followed : ");
		while(iterator.hasNext())
		{
			System.out.print(" "+iterator.next());
		}
		System.out.println();
		
		//delete element
		mySet.remove("F");
		System.out.println("After deleting F : "+mySet);
		
		//delete collection
		mySet.removeAll(list);
		System.out.println("After deleting list : "+mySet);
		
		//remove on condition
		mySet.removeIf(x->x.contains("a"));
		System.out.println("After deleting based on condition : "+mySet);
		
		//delete all elements
		mySet.clear();
		System.out.println("After deleting all elements : "+mySet);
		
		System.out.println("Set is empty or not : "+mySet.isEmpty());
	}
}
