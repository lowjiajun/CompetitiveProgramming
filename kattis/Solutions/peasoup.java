import java.util.Scanner;

class Solution {
    public static void main(String[] args) throws java.lang.Exception {
    	Scanner sc = new Scanner(System.in);
    	
    	int n = sc.nextInt(); 
    	sc.nextLine();
    	
    	boolean flag = false; 
    	
    	StringBuilder out = new StringBuilder();
    	
    	for (int i = 0; i < n; i++) {
    		int k = sc.nextInt();
    		sc.nextLine();
    		String r = sc.nextLine(); // restaurant name 
    		int c = 0; int d = 0;
    		for (int j = 0; j < k; j++) {
    			String s = sc.nextLine(); 
    			if (s.equals("pea soup")) {
    				c++;
    			} else if (s.equals("pancakes")) {
    				d++;
    			}
    		}
    		
    		if ((c >= 1 && d >=1)) {
    			flag = true; 
    			out.append(r);
    			break;
    		}
    	}
    	
    	System.out.println(flag ? out.toString() : "Anywhere is fine I guess");
    }
}
