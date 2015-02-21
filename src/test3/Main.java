package test3;

public class Main {
	public static void main(String [] args){
		
		System.out.println(replaceTheSpace("hi, jianhe, how are you doing today", 35));
		
		System.out.println();
		
		
		System.out.println(replaceTheSpace("abc def ghi jkl", 15));
		
		System.out.println();
		
	}
	
	public static String replaceTheSpace(String s, int len){
		
		char [] str = s.toCharArray();
		
		char [] newStr = new char[len*3];
		
		int end = len-1;
		
		for(int i=len-1;i>=0;i--){
			if(str[i]!=' '){
				newStr[i] = str[i];
			}
			
			//str[i]==" "
			else{
				for(int j=end;j>=i;j--){
					newStr[j+2] = newStr[j];
				}
				newStr[i] = '%';
				newStr[i+1] = '2';
				newStr[i+2] = '0';
				
				//the variable end must change
				end = end + 2;
			}
		}
		
		String strNew = "";
		
		for(int i=0;i<newStr.length;i++){
			strNew = strNew + newStr[i];
		}
		
		return strNew;
		
	}
}
