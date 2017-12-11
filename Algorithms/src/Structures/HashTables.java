package Structures;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;


public class HashTables {
	
	public static void main(String[] args) {
		//quick and easy implementations of Hash Tables
		
		//I am pointing to map as they all extend Map interface and makes it easier to iterate
		Map <Integer, String> hashmap = new ConcurrentHashMap<Integer, String>(); // can be stored in any order
		Map <Integer, String> linkedhashmap = new LinkedHashMap<Integer, String>(); // stored in the order you put them in
		Map <Integer, String> treemap = new TreeMap<Integer, String>(); // stored in natural order
		
		populateMap(hashmap);
		populateMap(linkedhashmap);
		populateMap(treemap);
		
		//using iterators
		Iterator it = hashmap.entrySet().iterator();
		while(it.hasNext()) {
		//System.out.println(it.next()); // this works

		Map.Entry pair = (Map.Entry) it.next(); // does the same thing
		System.out.println(pair);
		}
		
	}
	
	public static void populateMap(Map<Integer, String> map) {
		
		map.put(1, "eric strong");
		map.put(3, "gerard strong");
		map.put(2, "mairead strong");
		map.put(4, "princess strong");
		
		
		//using ConcurrentHashMap you can return the set just like in python
		for (Map.Entry<Integer,String> entry : map.entrySet()) {
			Integer key = entry.getKey();
		    String value = entry.getValue();
		    System.out.println("key, " + key + " value " + value);
		}
		
		
		//iterate over the map - get values
		for(String i: map.values()) {
			System.out.println(i);
			
		}
		
		//iterate over the map - get keys
		for(Integer i: map.keySet()) {
			System.out.println(i);
			
		}
		
		

				
	}


}


