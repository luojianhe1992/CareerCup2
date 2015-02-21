package test6;

import java.util.Stack;

public class Main {
	public static void main(String [] args){
		
		MyStack myStack = new MyStack();
		
		myStack.pushElement(5);
		myStack.pushElement(4);
		myStack.pushElement(2);
		myStack.pushElement(7);
		myStack.pushElement(9);
		myStack.pushElement(1);
		
		System.out.println("Min = "+ myStack.findMin());
		
		System.out.println("*************");
		
		System.out.println("pop() = " + myStack.popElement());
		
		System.out.println("*************");
		
		System.out.println("Min = "+ myStack.findMin());
		
		System.out.println("*************");
		
		System.out.println("pop() = " + myStack.popElement());
		
		System.out.println("*************");
		
		System.out.println("Min = "+ myStack.findMin());
		
		
	}
	
	
}
