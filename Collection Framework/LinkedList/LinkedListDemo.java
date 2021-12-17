
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
	
	public static void main(String args[])
	{
		//create list
		List<String> myList = new LinkedList();
		
		//add single element
		myList.add("Tom");
		myList.add("Jerry");
		
		System.out.println(myList);
		
		//add collection
		List<String> nameList = new LinkedList();
		nameList.add("Mini");
		nameList.add("Mickey");
		
		myList.addAll(nameList);
		System.out.println(myList);
		
		//update
		myList.set(1, "Jerry Brown");
		System.out.println("List after update : "+myList);
		
		//sorting by Collections.sort
		Collections.sort(myList);
		System.out.println("List after sorting : "+myList);
		
		//sub list 
		System.out.println("Sublist 0 to 2 : "+myList.subList(0, 2));
		
		//delete element
		myList.remove("Tom");
		System.out.println("List after deleting Tom : "+myList);
		
		//delete element
		myList.removeAll(nameList);
		System.out.println("List after deleting collection from list : "+myList);
	}
}
