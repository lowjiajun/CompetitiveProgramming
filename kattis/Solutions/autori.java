import java.util.Scanner;

class Solution {
    public static void main(String[] args) throws java.lang.Exception {
    	Scanner sc = new Scanner(System.in);
    	
    	String s = sc.nextLine(); 
    	
    	for (int i = 0; i < s.length(); i++) {
    		
    		if (Character.isUpperCase(s.charAt(i))) {
    			System.out.print(s.charAt(i));
    		}
    	}
    	
    }
}
