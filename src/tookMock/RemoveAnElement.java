package tookMock;
/*Remove an Element at specific index from an Array in Java
Given an array of fixed length. The task is to remove an element at a specific index from the array.

Examples:

Input: arr[] = { 1, 2, 3, 4, 5 }, index = 2
Output: arr[] = { 1, 2, 4, 5 }

Input: arr[] = { 4, 5, 9, 8, 1 }, index = 3
Output: arr[] = { 4, 5, 9, 1 }*/

// Java program to remove an element 
// from a specific index from an array 

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RemoveAnElement {

	public static int[] removeTheElement(int[] arr, int index) {

		if (arr == null || index < 0 || index >= arr.length)
			return arr;

		return IntStream.range(0, arr.length).filter(i -> i != index).map(i -> arr[i]).toArray();
		
	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };

		System.out.println("Original Array: " + Arrays.toString(arr));
		int index = 2;
		System.out.println("Index to be removed: " + index);
		arr = removeTheElement(arr, index);
		System.out.println("Resultant Array: " + Arrays.toString(arr));
	}
}
