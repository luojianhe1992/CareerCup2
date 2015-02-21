package test8;

public class StringCompress {
	public static void main(String[] args) {

		String sc = "aabbccccaabbb";
		
		
		
		System.out.println(checker(sc));
		
		System.out.println("size = "+size);
		
		System.out.println(compresser(sc));
		
	}
	public static String checker(String str){
		int size = checkcompress(str);
		if(size <= str.length()){
			return str;
		}
		return null;
		
	}
	static int size = 0;
	
	//
	public static int checkcompress(String str){
		
		int count = 0;
		char strchar = str.charAt(0);
		
		for(int i=0; i<str.length(); i++){
			if(str.charAt(i)==strchar){
				count++;
			}
			else{
				strchar=str.charAt(i);
				size=size+2;
				count++;
			}
			
		}
		if(size==0){
			size = str.length();
		}
		
		size = size + 2;
		
		return size;
		
	}
	public static String compresser(String str){
		char[] newstr = new char[size];
		int count = 0;
		char strchar1 = str.charAt(0);
		newstr[0] = strchar1;
		int k = 0;
		for(int i=1; i<str.length(); i++){
			
			//
			if(str.charAt(i)==strchar1){
				count++;
			}
			
			else{
				
				newstr[++k] = (char) (count + '1');
				
				newstr[++k]=str.charAt(i);
				
				strchar1=str.charAt(i);
				count=0;
			}
			
		}
		
		newstr[newstr.length - 1] = (char) (count + '1');
		
//		for(int i=0;i<newstr.length;i++){
//			System.out.print(newstr[i]);
//		}
		
		String result = "";
		
		for(char c:newstr){
			result = result + c;
		}
		
		
		return result;
		
	}
}
