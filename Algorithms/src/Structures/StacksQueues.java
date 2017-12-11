package Structures;

import java.util.Stack;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.ArrayDeque;
import java.util.Queue;

public class StacksQueues {
	
	public static void main(String[] args) {
		
		//QUEUE FIFO
		//STACK LIFO
		
		Stack stack = new Stack();
		for(int i = 0; i<10; i ++) {
			stack.push(i);
		}
		
		System.out.println("Stack");
		System.out.println(stack);
		
		//pop from the top
		stack.pop();
		System.out.println(stack);
		
		Queue<Integer> queue = new ArrayBlockingQueue <Integer>(stack.size());
		queue.addAll(stack);
		
		
		System.out.println("Queue");
		System.out.println(queue);
		
		//pop off the stack
		//dequeue from the queue
		stack.pop();
		queue.poll();
		System.out.println(stack);
		System.out.println(queue);
		
		ArrayDeque<Integer> aDeque = new ArrayDeque<Integer>();
		aDeque.add(10); // adds from the tail
		aDeque.push(100); //adds from the head
		aDeque.add(200);
		aDeque.push(70);
		
		aDeque.pop();
		
		for(Integer i: aDeque) {
			System.out.println(i);
		}
		
		
	
	}

}
