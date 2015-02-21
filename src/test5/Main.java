package test5;

public class Main {
	public static void main(String [] args){
		Stacks stacks = new Stacks();
		
		for(int i=0;i<10;i++){
			stacks.push(0, i);
			stacks.push(1, i + 10);
			stacks.push(2, i + 20);
		}
		
		System.out.println(stacks.isEmpty(0));
		System.out.println(stacks.isEmpty(1));
		System.out.println(stacks.isEmpty(2));
		
		for(int i=0;i<10;i++){
			System.out.print(stacks.pop(0)+" ");
			System.out.print(stacks.pop(1)+" ");
			System.out.print(stacks.pop(2)+" ");
			System.out.println();
		}
		
		System.out.println(stacks.isEmpty(0));
		System.out.println(stacks.isEmpty(1));
		System.out.println(stacks.isEmpty(2));
		
	}
}
