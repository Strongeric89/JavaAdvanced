package algorithmPractice;


//LIFO structure - LAST IN FIRST OUT
//implementation with an array

public class Stack {
	
	public static int top = -1;
	public static int stack[] = new int[10];
	
	public static void main(String[] args) {
		
		
		//lets add to the stack
		push(1);
		push(2);
		
		peek();
		pop();
		peek();
		pop();
		pop();
		
		push(1);
		push(2);
		push(3);
		
		printStack();
		
	
		
	}
	
	public static void push(int data) {
		
		if(top == stack.length) {
			System.out.println("stack is full!");
			return;
		}
		top ++;
		stack[top] = data;
		System.out.println(stack[top] + " has been added to the stack ");
		
		
	}
	
	public static void pop() {
		
		if(top == -1) {
			System.out.println("stack is empty");
			return;
		}
		System.out.println(stack[top] + " has been removed");
		top --;
		
	}
	
	public static void peek() {
		System.out.println(stack[top] + " is at the top of the stack");
		
	}
	
	public static void printStack() {
		
		if(top == -1) {
			System.out.println("The stack is empty");
			return;
		}
		System.out.print("starting from the top >> ");
		for(int i=top;i>-1;i--) {
			System.out.print(stack[i] + " , ");
		}
		
	}
}
