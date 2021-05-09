package MockInterview;

public class ShiftZeros {

	public static void main(String[] args) {
		int arr[] = { 0, 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9 };
		int n = arr.length;

		System.out.print("Original array: ");
		printArray(arr);

		moveZerosToEnd(arr, n);

		System.out.print("\nModified array: ");
		printArray(arr);

	}

	private static void moveZerosToEnd(int[] arr, int n) {
		int j=0,tmp=0;
		for(int i=0;i<n;i++){
			if(arr[i]!=0){
			tmp=arr[i];
			arr[i]=arr[j];
			arr[j]=tmp;
			j++;
		}
	}
	}

	private static void printArray(int[] arr) {
		for (int a : arr)
			System.out.print(a + " ");

	}

}
