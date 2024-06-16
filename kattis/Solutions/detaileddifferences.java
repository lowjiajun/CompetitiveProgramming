import java.util.Scanner;

class Solution {
    public static void main(String[] args) throws java.lang.Exception {
    	Scanner sc = new Scanner(System.in);
    	
    	int n = sc.nextInt();
    	sc.nextLine();
    	
    	while (n-- > 0) {
    		String s = sc.nextLine();
    		String t = sc.nextLine();
    		
    		StringBuilder ans = new StringBuilder();
    		
    		for (int i = 0; i < s.length(); i++) {
    			if (s.charAt(i) == t.charAt(i)) {
    				ans.append(".");
    			} else {
    				ans.append("*");
    			}
    		}
    		
    		System.out.println(s);
    		System.out.println(t);
    		System.out.println(ans);
    		System.out.println();
    		
    	}
    	
    }
}
