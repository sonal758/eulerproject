package codex;

public class Problem9 {
	 public static void main(String[] args) {
	        
	        for (int a = 3; a <= 1000; a++) {
	            for (int b = a + 1; b < 1000; b++) {          
	                double cSquared = Math.pow(a, 2) + Math.pow(b, 2);
	                double c = Math.pow(cSquared, 0.5);    
	                              
	                if (a + b + c == 1000) {
	                	int d= (int)c;
	                	System.out.println(a+","+b+","+d);        	
	                    System.out.println(a * b * d);
	                    break;
	                }
	            }
	        }
	    }
	}

