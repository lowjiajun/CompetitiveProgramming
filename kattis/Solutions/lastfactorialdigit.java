import java.util.Scanner;

class Solution {
    public static void main(String[] args) throws java.lang.Exception {
    	Scanner sc = new Scanner(System.in);
    	
    	int t = sc.nextInt();
    	
    	while (t-- > 0) {
    		int n = sc.nextInt();
    		int fact = 1; 
    		
    		while (n > 0) {
    		    fact *= n;
    		    n--;
    		}
    		
    		int ans = fact % 10;
    		System.out.println(ans);
    		
    		
    	}
    	
    }
}
