package MockInterview;

// Java code for Josephus Problem 

import java.io.*;

public class JosephusProblem {

	public static void main(String[] args) {
		int n = 14;
		int k = 2;
		System.out.println("The chosen place is " + josephus(n, k));
		System.out.println("The chosen place is " + josephusItr(n, k));
	}
	
	
	
	 private static int josephusItr(int n, int k)  
	    { 
	        int sum = 0; 
	        for(int i = 2; i <= n; i++)  
	        { 
	            sum = (sum + k) % i; 
	        } 
	  
	        return sum+1; 
	    } 
	 
	 //recursion
	 static int josephus(int n, int k) {
			if (n == 1)
				return 1;
			else
				/*
				 * The position returned by josephus(n - 1, k) is adjusted because
				 * the recursive call josephus(n - 1, k) considers the original
				 * position k%n + 1 as position 1
				 */
				return (josephus(n - 1, k) + k - 1) % n + 1;
		}

}
