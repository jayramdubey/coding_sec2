package MockInterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrangeLargestNumber {

	public static void main(String[] args) {
		int arr[] = { 54, 546, 548, 60 };
		
		printLargest(arr);
		printLargest2(arr);
	}

	private static void printLargest(int arr[]) {
		int len = arr.length;
		String ar2[] = new String[len];
		for (int i = 0; i < len; i++) {
			ar2[i] =String.valueOf(arr[i]);
		}
		
		List<String> numbers = Arrays.asList(ar2);

		// sort using a custom function object
		Collections.sort(numbers, (a, b) -> (b + a).compareTo(a + b));

		// print the sorted sequence
		numbers.stream().forEach(System.out::print);

	}
	
	private static void printLargest2(int arr[]) {
		int len = arr.length;
		String ar2[] = new String[len];
		for (int i = 0; i < len; i++) {
			ar2[i] =String.valueOf(arr[i]);
		}
		


		// sort using a custom function object
		Arrays.sort(ar2, new Comparator<String>(){

			@Override
			public int compare(String x, String y) {
				String xy=x+y;
				String yx=y+x;
				return xy.compareTo(yx)>0?-1:1;
			}
			
		});
		System.out.println();
		// print the sorted sequence
		for(String s:ar2){
			System.out.print(s);
			
		}

	}

}
