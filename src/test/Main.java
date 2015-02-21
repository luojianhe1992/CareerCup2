package test;

public class Main {
	public static void main(String []args){
		
		System.out.println(hasAllUnique("abcdefg"));
		
		System.out.println(hasAllUnique("abcdea"));
		
	}
	
	//check the string according to the ascii
	public static boolean hasAllUnique(String s){
		
		char [] arrayString = s.toCharArray();
		
		boolean [] ascii = new boolean [256];
		
		for(int i=0;i<256;i++){
			ascii[i] = false;
		}
		
		for(int i=0;i<arrayString.length;i++){
			
			if(ascii[arrayString[i]] == true){
				return false;
			}
			
			ascii[arrayString[i]] = true;
		}
		
		return true;
		
	}
}
