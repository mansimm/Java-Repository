

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LinkedHashMapDemo {
	
	public static void main(String arg[])
	{
		Map<Integer,String> map = new LinkedHashMap();
		map.put(1,"Harry Potter");
		map.put(2, "Ronald Wiseley");
		map.put(3,"Harminea Grengers");
		
		//map allows null key and values, all keys should be unique, values can be duplicate
		//Java LinkedHashMap may have one null key and multiple null values
		//maintain oreder of insertion
		
		//get keys
		System.out.println("KeySet : "+map.keySet());
		//get values
		System.out.println("Values : "+map.values());
		//update
		map.put(3,"Harminy Grengers");
		//print map
		System.out.println(map);
		
		//iterate map using Entry.set
		for(Entry<Integer, String> x: map.entrySet())
		{
			System.out.println("Key : "+x.getKey()+"  Value : "+x.getValue());
		}
		//replace
		map.replace(1, "Tom");
		//print map
		System.out.println("\nAfter replacement (1, Tom) : "+map);
		
		//replace
		map.replace(1, "Tom","Harry Potter");
		//print map
		System.out.println("\nAfter map.replace(1, \"Tom\",\"Harry Potter\")"+map);
		//put if absent , don't update existing
		map.putIfAbsent(4, "Bellatrix listrange");
		System.out.println("\nAfter putIfAbsent : "+map);
		
		//contains
		System.out.println("\nDoes map contains key 1 : "+map.containsKey(1));
		System.out.println("Does map contains value Tom : "+map.containsValue("Tom"));
		
		//Map.Entry methods for sorting based on keys
		System.out.println("\nSorting based on keys :");
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		
		//Map.Entry methods for sorting based on values
		System.out.println("\nSorting based on values :");
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

		//Map.Entry methods for sorting based on keys in descending order
		System.out.println("\nSorting based on keys in descending order:");
		map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);
				
		//Map.Entry methods for sorting based on values in descending order
		System.out.println("\nSorting based on values in descending order:");
		map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);

		//traversing using forEach
		System.out.println("\ntraversing using forEach :");
		map.forEach((k,v)->{System.out.println("[ Key:"+k+" value:"+v+" ]");});
	}
}
