package algorithmPractice;

class DoublyNode{
	private DoublyNode next;
	private DoublyNode previous;
	private int data;
	
	public DoublyNode(int data) {
		this.data = data;
	}
	//getters and setters
	

	
	
	public String toString() {
		return "Data: " + this.data;
	}




	public DoublyNode getNext() {
		return next;
	}




	public void setNext(DoublyNode next) {
		this.next = next;
	}




	public DoublyNode getPrevious() {
		return previous;
	}




	public void setPrevious(DoublyNode previous) {
		this.previous = previous;
	}




	public int getData() {
		return data;
	}




	public void setData(int data) {
		this.data = data;
	}
	

}

public class DoublyLinkedList {
	
	private DoublyNode head;
	
	//insert at head
	public void insertAtHead(int data) {
		DoublyNode newNode = new DoublyNode(data);
		
	
		newNode.setNext(this.head);
		
		if(this.head != null) {
			this.head.setPrevious(newNode);
		}
		this.head = newNode;
		
	}
	
	public int length() {
		DoublyNode current = this.head;
		int length = 0;
		
		while(current != null) {
			current = current.getNext();
			length ++;
		}
		
		return length;
	}
	
	public String toString() {
		StringBuilder result = new StringBuilder();
		DoublyNode current = this.head;
		
		while(current != null) {
			result.append("data:");
			result.append(current);
			result.append("\n");
			current = current.getNext();
		}
		return result.toString();
	}
	
	
	

}
