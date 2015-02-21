package test5;

public class Stacks {
	
	int stackSize = 100;
	int [] wholeBuffer = new int [stackSize*3];
	int [] pointer = new int []{-1,-1,-1};
	
	
	public void push(int stackNum, int value){
		if(pointer[stackNum] + 1 > stackSize){
			System.out.println("the stack is full");
			return;
		}
		
		pointer[stackNum]++;
		
		wholeBuffer[stackNum * stackSize + pointer[stackNum]] = value;
		
	}
	
	public int pop(int stackNum){
		if(pointer[stackNum] < 0){
			System.out.println("the stack is empty.");
			return -1;
		}
		
		int value = wholeBuffer[stackNum * stackSize + pointer[stackNum]];
		
		pointer[stackNum]--;
		
		return value;
		
	}
	
	public int peek (int stackNum){
		if(pointer[stackNum] <= 0){
			System.out.println("the stack is empty.");
			return -1;
		}
		
		int value = wholeBuffer[stackNum * stackSize + pointer[stackNum]];
		
		return value;
	}
	
	public boolean isEmpty(int stackNum){
		boolean check;
		
		if(pointer[stackNum]<0){
			check = true;
		}
		else{
			check = false;
		}
		
		return check;
	}
	
	
	
}
