

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String args[])
	{
		// Stores elements in ascending order of keys
		// does not allow null keys but can have multiple null values
		TreeMap<Integer,String> tmap = new TreeMap();
		//insert
		tmap.put(1, "Yara");
		tmap.put(2,"Ron");
		tmap.put(3,"Aarya");
		tmap.put(4,"Sansa");
		
		System.out.println("Initial treemap : "+tmap);
		//replace
		tmap.replace(1, "Bran");
		System.out.println("After replacement treemap : "+tmap);
		
		//size
		System.out.println("Size of treemap : "+tmap.size());
		
		//traversing
		System.out.println("\nTraversing treemap :");
		for(Map.Entry<Integer,String> m: tmap.entrySet())
		{
			System.out.println("[ Key= "+m.getKey()+" Value= "+m.getValue()+" ]");
		}
		//submap
		System.out.println("\nSubmap from 1 to 3 - tmap.subMap(1, 4) : "+tmap.subMap(1, 4));
		System.out.println("Submap from 2 to 4 - tmap.subMap(1, 4) : "+tmap.subMap(1,false, 4,true));
		
		//headmap
		System.out.println("\nHeadmap from start to 3 - tmap.headMap(3) : "+tmap.headMap(3));
		System.out.println("Headmap from start to 2 - tmap.headMap(3,false) : "+tmap.headMap(3,false));
		
		//tailmap
		System.out.println("\nTailmap from 3 to end - tmap.tailMap(3) : "+tmap.tailMap(3));
		System.out.println("Tailmap from 4 to end - tmap.headMap(3,false) : "+tmap.tailMap(3,false));
	
		//remove
		tmap.remove(1);
		System.out.println("\nAfter removing key 1 : "+tmap);
		
		//poll
		tmap.pollFirstEntry();
		System.out.println("\nPoll first entry : "+tmap);
		
		tmap.pollLastEntry();
		System.out.println("\nPoll last entry : "+tmap);
		
		//deleting all entries
		tmap.clear();
		System.out.println("\nIs map empty : "+tmap.isEmpty());
		
	}
}
