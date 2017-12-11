package algorithmPractice;

//FIFO first in first out
public class Queue {


	public static int queue[] = new int[5];
	public static int top = -1;
	public static int tail= -1;
	
	public static void main(String[] args) {
		
		//add to the queue
		enqueue(1);
		enqueue(2);
		enqueue(3);
		enqueue(4);
		enqueue(5);
		enqueue(6);
		enqueue(6);
		
		printQueue();
		
		dequeue();
		dequeue();
		dequeue();
		dequeue();
		printQueue();
		poll();
		

		
	}
	
	public static void enqueue(int data) {
		if((tail + 1) == queue.length) {
			System.out.println("The queue is full");
			return;
		}
		
		if(tail > -1) {
			tail ++;
			//System.out.println(tail);
			queue[tail] = data;	
			System.out.println(queue[tail] + " added to the queue");
			
			//logic to fix holes in a queue
			
			return;
		}
		
	
		//for the first element
		top++;
		tail ++;
		queue[top] = data;
		//System.out.println(tail);
		System.out.println(queue[tail] + " added to the queue");
		
		

	}
	
	public static void dequeue() {
		if(tail == -1) {
			System.out.println("The queue is empty");
			return;
		}
		
		//remove from the top
		
		System.out.println(queue[top] + " has been removed from the queue");
		queue[top] = 0;
		top++;
		
	
		
	}
	
	public static void poll() {
		if(tail == -1) {
			System.out.println("The queue is empty");
			return;
		}
		System.out.println(queue[top] + " is at the top of the queue");
	}
	
	public static void printQueue() {
		if(tail == -1) {
			System.out.println("The queue is empty");
			return;
		}
		for(int i=0; i<=tail;i++) {
			System.out.print(queue[i] + " , ");
		}
	}
	
	
	
		
		
}
