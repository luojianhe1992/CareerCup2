package test7;

//find the max length of palindrome
public class Main {
	public static void main(String [] args){
		String x = "axabcbabcbacaxds";
		String maxString = null;
		int maxLength = 0;
		for (int i = 0; i < x.length(); i++) {
			for (int j = (x.length() - i + 1) / 2; j > 0; j--) {
				int length = 2 * j - 1;
				if (length <= maxLength)
					break;
				boolean identical = true;
				for (int k = 0; k < j; k++) {
					if (x.charAt(i + k) != x.charAt(i + length - 1 - k)) {
						identical = false;
						break;
					}
				}
				if (identical) {
					maxLength = length;
					maxString = x.substring(i, i + length);
				}
			}
			for (int j = (x.length() - i) / 2; j > 0; j--) {
				int length = 2 * j;
				if (length <= maxLength)
					break;
				boolean identical = true;
				for (int k = 0; k < j; k++) {
					if (x.charAt(i + k) != x.charAt(i + length - 1 - k)) {
						identical = false;
						break;
					}
				}
				if (identical) {
					maxLength = length;
					maxString = x.substring(i, i + length);
				}
			}
			System.out.println(maxString + "\t" + maxLength);
		}
	}
	
}
	
