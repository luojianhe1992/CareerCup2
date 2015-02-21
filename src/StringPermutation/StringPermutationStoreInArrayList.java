package StringPermutation;

import java.util.ArrayList;

public class StringPermutationStoreInArrayList {
	public static void main(String [] args){
		
		ArrayList<Character> result = new ArrayList<Character>();
		
		ArrayList<ArrayList> finalResult = new ArrayList<ArrayList>();
		
		stringPermutation(new char[]{'a','b','c' ,'d'} ,new int []{1,1,1,1}, result,finalResult);
	
		System.out.println("num = "+num);
		
		System.out.println("********************");
		
		System.out.println("result = "+result);
		
		System.out.println("length = "+ result.size());
		
		int countA = 0;
		int countB = 0;
		int countC = 0;
		int countD = 0;
		
		for(char c:result){
			if(c == 'a'){
				countA++;
			}
			else if(c == 'b'){
				countB++;
			}
			else if(c == 'c'){
				countC++;
			}
			else{
				countD++;
			}
		}
		
		System.out.println("countA = "+countA);
		System.out.println("countB = "+countB);
		System.out.println("countC = "+countC);
		System.out.println("countC = "+countD);
		
		System.out.println("********************");
		
		System.out.println("finalResult = "+finalResult);
		
		
	}
	
	public static int num = 0;
	
	public static void stringPermutation(char [] chars,int []count, ArrayList<Character> result, ArrayList<ArrayList> finalResult){
		
		boolean stop = true;
		
		for(int i=0;i<count.length;i++){
			
			if(count[i]<=0){
				continue;
			}
			
			int[] clone = count.clone();
			ArrayList<Character> newResult = (ArrayList<Character>) result.clone();
			clone[i]--;
			
			newResult.add(chars[i]);
			
			stringPermutation(chars, clone, newResult, finalResult);
			
			stop = false;
		}
		
		if(stop == true){
			System.out.println(result);
			
			finalResult.add(result);
			
			num++;
		}
		
		
	}
	
	
}
