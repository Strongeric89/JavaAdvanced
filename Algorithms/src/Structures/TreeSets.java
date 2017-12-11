package Structures;

import java.util.TreeSet;



import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

public class TreeSets {
	
	public static void main(String[] args) {
		
		Set<String> set = new TreeSet<String>(); // using a binary search tree
		Set<Integer> bst = new TreeSet<Integer>(); // using a binary search tree
		
	
		addElements(set);
		showElements(set);
		
		addElementsInt(bst);
		showElementsInt(bst);
		

		
		
	
	}
	
	//using collection as list, set and queue all implement the collection interface
	public static void addElements(Collection<String> col) {
		
		col.add("eric");
		col.add("laura");
		col.add("dave");		
		col.add("annie");
		
	}
	
public static void addElementsInt(Collection<Integer> col) {
		
		col.add(10);
		col.add(12);
		col.add(1);		
		col.add(4);
		
	}
	
	
	
	public static void showElements(Collection<String> col) {
		
		
		for(String s: col) {
			System.out.println(s);
		}
		
		
	}
	
	public static void showElementsInt(Collection<Integer> col) {
		
		
		for(Integer s: col) {
			System.out.println(s);
		}
		
		
	}

}
