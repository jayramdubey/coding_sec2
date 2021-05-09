package test;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(0);
		arr.add(0);
		arr.add(1);
		arr.add(1);
		arr.add(0);
		arr.add(1);
		arr.add(1);
		arr.add(1);
		arr.add(0);
		int n = minMoves(arr);
		System.out.println(n);
	}

	private static int minMoves(ArrayList<Integer> arr1) {

	
		Integer[] arr = arr1.toArray(new Integer[arr1.size()]);
		int n = arr1.size();
		
		
		int noOfOnes = 0; 

		// find total number of all in the array 
		for (int i = 0; i < n; i++) { 
			if (arr[i] == 1) 
			noOfOnes++; 
		} 

		// length of subarray to check for 
		int x = noOfOnes; 

		int maxOnes = Integer.MIN_VALUE; 

		// array to store number of 1's upto 
		// ith index 
		int preCompute[] = new int[n]; 

		// calculate number of 1's upto ith 
		// index and store in the array preCompute[] 
		if (arr[0] == 1) 
			preCompute[0] = 1; 
		for (int i = 1; i < n; i++) { 
			if (arr[i] == 1) { 
			preCompute[i] = preCompute[i - 1] + 1; 
			} else
			preCompute[i] = preCompute[i - 1]; 
		} 

		// using sliding window technique to find 
		// max number of ones in subarray of length x 
		for (int i = x - 1; i < n; i++) { 
			if (i == (x - 1)) 
			noOfOnes = preCompute[i]; 
			else
			noOfOnes = preCompute[i] - preCompute[i - x]; 
			
			if (maxOnes < noOfOnes) 
			maxOnes = noOfOnes; 
		} 

		// calculate number of zeros in subarray 
		// of length x with maximum number of 1's 
		int noOfZeroes = x - maxOnes; 

		return noOfZeroes; 
		} 

}