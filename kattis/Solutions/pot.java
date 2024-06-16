import java.util.Scanner;

class Solution {
    public static void main(String[] args) throws java.lang.Exception {
    	Scanner sc = new Scanner(System.in);
    	
    	int n = sc.nextInt();
    	
    	long output = 0;
    	
    	while (n-- > 0) {
    		
    		long p = sc.nextLong();
    		
    		long l = p % 10; 
    		
    		long r = p / 10; 
    		
    		output += Math.pow(r,l);
    	}
    	
    	System.out.println(output);
    	
    }
}
