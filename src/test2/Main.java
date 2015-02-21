package test2;

public class Main {
	public static void main(String [] args){
		System.out.println(checkPermutation2("abcac", "cbaab"));
		
		System.out.println();
		
		System.out.println(checkPermutation("abcdefg", "accdefg"));
		
		System.out.println();
		
		System.out.println(checkPermutation("abcdefg", "gfedcba"));
		
	}
	
	public static boolean checkPermutation(String s1, String s2){
		
		if(s1.length()!=s2.length()){
			return false;
		}
		
		char[] arrayString1 = s1.toCharArray();
		char[] arrayString2 = s2.toCharArray();
		
		int [] ascii1 = new int[256];
		int [] ascii2 = new int[256];
		
		for(int i=0;i<256;i++){
			ascii1[i] = 0;
		}
		
		for(int i=0;i<256;i++){
			ascii2[i] = 0;
		}
		
		for(int i=0;i<arrayString1.length;i++){
			ascii1[arrayString1[i]]++;
		}
		
		for(int i=0;i<arrayString2.length;i++){
			ascii2[arrayString2[i]]++;
		}
		
		for(int i=0;i<256;i++){
			if((ascii1[i]-ascii2[i])!=0){
				return false;
			}
		}
		
		return true;
	}
	
	public static boolean checkPermutation2(String s1,String s2){
		
		if(s1.length()!=s2.length()){
			return false;
		}
		
		char[] arrayString1 = s1.toCharArray();
		
		char[] arrayString2 = s2.toCharArray();
		
		sortCharArray(arrayString1);
		sortCharArray(arrayString2);
		
		return compareCharArray(arrayString1, arrayString2);
		
	}
	
	public static void sortCharArray(char[] array){
		
		int len = array.length;
		
		for(int i=0;i<len;i++){
			for(int j=i+1;j<len;j++){
				if(array[i]>array[j]){
					char temp;
					
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		
	}
	
	public static boolean compareCharArray(char[]array1, char[]array2){
		
		int len = array1.length;
		
		for(int i=0;i<len;i++){
			
			if((array1[i]-array2[i])!=0){
				return false;
			}
		}
		
		return true;
		
	}
}
