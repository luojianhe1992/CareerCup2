package StringPermutation;

public class StringPermutationPrint {
	public static void main(String []args){
		print (new char[]{'a','b','c','d'},new int []{1,1,1,1}, new StringBuilder());
		
		System.out.println("num = "+num);
	}
	
	public static int num = 0;
	
	public static void print(char[]chars, int[] count, StringBuilder sb){
		
		boolean stop = true;
		
		for(int i=0;i<count.length;i++){
			
			if(count[i]<=0){
				
				//you should learn how to use the continue
				continue;
			}
			
			int[] clone = count.clone();
			clone[i]--;
			StringBuilder newBuilder = new StringBuilder(sb);
			newBuilder.append(chars[i]);
			
			print(chars,clone, newBuilder);
			
			//all the chars have been added to the stringbuilder
			stop = false;
			
		}
		
		if(stop){
			System.out.println(sb.toString());
			
			num++;
			
		}
		
	}
	
	
	
	
}
