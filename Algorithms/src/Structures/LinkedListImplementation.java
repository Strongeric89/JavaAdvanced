package Structures;

class Node{
	Node next;
	int data;
	
	//constructor
	public Node(int data) {
		this.data = data;
		
	}
	

	
}

public class LinkedListImplementation {
	Node head;
	
	//append 
	public void append(int data) {
		if(head == null) {
			head = new Node(data);
			return;
		}
		//we need to append to the next pointer but check for null (tail)
		Node current = head; // gets the next node
		while(current.next != null) {
			current = current.next;
			
		}
		current.next = new Node(data);
			
	}//end append
	
	public void prepend(int data) {
		//add to the beginning
		Node newHead = new Node(data);
		newHead.next = head;
		head = newHead;
		
	}
	
	public void deleteWithValue(int data) {
		if (head == null)return;
		if(head.data == data) {
			head = head.next;
			return;
		}
		
		Node current = head;
		while(current.next != null) {
			if(current.next.data == data) {
				current.next = current.next.next;
				return;
			}
			current = current.next;
		}
		
	}


}

