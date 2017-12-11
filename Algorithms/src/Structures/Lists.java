package Structures;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;
import java.util.Collections;
import java.util.Random;

public class Lists {
	public static void main(String[] args) {
		
		List<String> arraylist = new ArrayList<String>();
		List<String> linkedlist = new LinkedList<String>();
		List<Integer> linkedlistNumbers = new LinkedList<Integer>();
		
		//populate the lists
		populate(arraylist);
		System.out.println("using linked lists");
		populate(linkedlist);
		
		
		
		//populate the numbers Linked List and sort
		Random random = new Random();
		for(int i =0; i<50; i ++) {
			int r = random.nextInt(100);
			
			linkedlistNumbers.add(r);
			
		}
		System.out.println("before sorting....");
		System.out.println(linkedlistNumbers);
		//lets sort the Linked List using Collections
		Collections.sort(linkedlistNumbers);
		System.out.println("after sorting...");
		System.out.println(linkedlistNumbers);
		
		
	}
	
	public static void populate(List<String> list ) {
		
		list.add("eric strong");
		list.add("laura bermingham");
		list.add("bruce wayne");
		
		//iterate through lists
		for(String s: list) {
			System.out.println(s);
		}
		
		System.out.println("using iterators");
		
		//using iterators
		Iterator it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
