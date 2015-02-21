package test6;

import java.util.Stack;

public class MyStack extends Stack<NodeWithMin> {
	
	public void pushElement(int value) {
		
		int minInStack = findMin() < value ? findMin():value;
		
		NodeWithMin newNode = new NodeWithMin(value, minInStack);
		
		super.push(newNode);
		
	}
	
	public int popElement() {
		
		int value = super.pop().getValue();
		
		return value;
	}
	
	public int findMin(){
		if(this.isEmpty()){
			return Integer.MAX_VALUE;
		}
		else{
			return peek().getMin();
		}
	}
	
}
