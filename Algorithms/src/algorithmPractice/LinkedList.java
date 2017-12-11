package algorithmPractice;

class Node {
	private Node nextNode;
	private int data;
	
	
	// node constructor
	public Node(int data) {
		this.data = data;
	}
	
	public Node getNextNode() {
		return nextNode;
	}
	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	
	public String toString() {
		return "Data: " + this.data;
	}
	
	
	
}

class LinkedList {
	//creating the head node
	private Node head;
	
	//insert in sorted form
	public void insertInSortedForm(int data) {
		Node newNode = new Node(data);
		
		Node current = this.head;
		
		while(current != null) {
			
			if(current.getNextNode().getData() < newNode.getData()) {
				//insert at this point
				newNode.setNextNode(current.getNextNode());
				current.setNextNode(newNode);
			}
			current = current.getNextNode();
			
		}
		
	}
	
	//append to the end of the list
	public void append(int data) {
		Node newNode = new Node(data);
	
		
		//get to end
		Node current = head;
		
		while(current.getNextNode() != null) {
			current = current.getNextNode();
			
		}
		current.setNextNode(newNode);
		
	}
	
	//search for an item in linkedlist O(n)
	public int searchForItem(int key) {
		//iterate through the list
		Node current = this.head;
		int index = 0;
		while(current != null) {
			if(current.getData() == key) {				
				return index;
			}
			current = current.getNextNode();
			index ++;
		}
	
		return -1;
	}
	
	
	//remove from the head O(1)
	public void deleteFromHead() {
		this.head = this.head.getNextNode();
	
	}
	
	//count the amount of nodes in the linkedlist
	public int length() {
		int length = 0;
		Node current = this.head;
		
		while(current != null) {
			length ++;
			current = current.getNextNode();
			
		}
		return length;
	}
	
	public void insertAtHead(int data) {
		Node newNode = new Node(data);
		newNode.setNextNode(head);
		this.head = newNode;
	}
	
	public String toString() {
		
		String result = "{";
		Node current = this.head;
		
		while(current != null) {
			result += current.toString() + "->";
			current = current.getNextNode();
		}
		
		result += "}";
		return result;
	}

}


