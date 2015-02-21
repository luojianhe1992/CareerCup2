package StringPermutation;

import java.util.ArrayList;
import java.util.List;

public class StringPermutationStoreInCharArray {
	public static void main(String [] args){
		
		char [] way = new char[4];
		
		ArrayList<char[]> input = new ArrayList<char[]>();
		ArrayList<char[]> result = new ArrayList<char[]>();
		
		result = (ArrayList<char[]>) stringPermutation(new char[]{'a','b','c','d'}, new int []{1,1,1,1}, way ,0, input);
		
		System.out.println(result);
		
		System.out.println("****************");
		
		for(char [] method : result){
			for(char c:method){
				System.out.print(c+" ");
			}
			System.out.println();
		}
		
		System.out.println("****************");
		
	}
	
	public static List<char[]> stringPermutation(char[] chars, int[] count,char[] builder, int index, List<char[]>result){
		
		boolean stop = true;
		
		for(int i=0;i<count.length;i++){
			
			if(count[i]<=0){
				continue;
			}
			
			int [] clone = count.clone();
			char [] sb = builder.clone();
			
			clone[i]--;
			sb[index] = chars[i];
			
			//recursive
			stringPermutation(chars,clone,sb,index + 1,result);
			
			stop = false;
			
		}
		
		if(stop){
			result.add(builder);
			
			for(char c:builder){
				System.out.print(c+" ");
			}
			
			System.out.println();
			
		}
		
		return result;
		
	}
	
}
