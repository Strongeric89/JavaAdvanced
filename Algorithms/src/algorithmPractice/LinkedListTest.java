package algorithmPractice;

public class LinkedListTest {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		list.insertAtHead(10);
		list.insertAtHead(20);
		list.insertAtHead(30);
		list.insertAtHead(40);
		
		System.out.println(list);
		System.out.println(list.length());
		
		list.deleteFromHead();
		System.out.println(list);
		
		System.out.println(list.searchForItem(30));
		
		
		//append an item to the end
		list.append(10000);
		System.out.println(list);
		
		LinkedList list2 = new LinkedList();
		list2.append(10);
		list2.append(30);
		System.out.println(list2);

		
		
		
		
	}
	

}
