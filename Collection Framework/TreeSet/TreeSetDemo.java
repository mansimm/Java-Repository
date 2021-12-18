
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String args[])
	{
		//stores element in their natural order/ascending order
		// uses tree data structure internally to store elements, hence doesn't allow storing null
		TreeSet<String> set = new TreeSet();
		//add single element
		set.add("Z");
		set.add("J");
		set.add("C");
		//set.add(null);// doesn't allow null- gives java.lang.NullPointerException
		
		List<String> list = new LinkedList();
		list.add("A");
		list.add("B");
		list.add("X");
		list.add("Z");
		
		//add another collection
		set.addAll(list);
		
		System.out.println("Initial set : "+set);
		System.out.println("Set size : "+set.size());
		System.out.println("is set empty : "+set.isEmpty());
		System.out.println("is set contains Z : "+set.contains("Z"));
		
		//subsets
		System.out.println("set.subSet(\"B\", \"Z\") : "+set.subSet("B", "Z"));
		System.out.println("set.subSet(\"A\", true, \"X\", true) : "+set.subSet("A", true, "X", true));
		System.out.println("set.headSet(\"X\") : "+set.headSet("X"));
		System.out.println("set.headSet(\"X\",true) : "+set.headSet("X",true));
		
		System.out.println("set.headSet(\"X\") : "+set.tailSet("X"));
		System.out.println("set.headSet(\"X\",true) : "+set.tailSet("X",false));
		
		//iterator
		Iterator<String> it = set.iterator();
		System.out.println("Print using iterator in ascending order : ");
		while(it.hasNext())
		{
			System.out.print(" "+it.next());
		}
		System.out.println();
		
		// descending iterator
		Iterator<String> it2 = set.descendingIterator();
		System.out.println("Print using iterator in descending order : ");
		while(it2.hasNext())
		{
			System.out.print(" "+it2.next());
		}
		System.out.println();
		
		//remove an element
		set.remove("Z");
		System.out.println("After removing Z : "+set);
		
		//remove collection
		set.removeAll(list);
		System.out.println("After removing list from set : "+set);
		
		//removes all elements
		set.clear();
		System.out.println("Set size : "+set.size());
		System.out.println("is set empty : "+set.isEmpty());
		
		TreeSet<Integer> set2 = new TreeSet();
		//add single element
		set2.add(20);
		set2.add(10);
		set2.add(30);
		
		System.out.println("set2 : "+set2);
		//retrives and removes last element
		System.out.println("Max element : "+set2.pollLast());
		//retrives and removes first element
		System.out.println("Min element : "+set2.pollFirst());
		System.out.println("set2 : "+set2);
	}
}
