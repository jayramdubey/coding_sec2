package SCB_Mock;



public class ShiftZerosLeft {
	
	public static void main(String[] args) {
       
			int[] arr = {0,1,0,2,0,3,0,5,4,0,1,0};
			int[] array = shiftZeros(arr);
			printArray(array);
			
		}

	public static int[] shiftZeros(int[] arr) {
		
		int j=arr.length-1,  tmp=0;
		for(int i=arr.length-1;i>=0;i--){
			if(arr[i] !=0){
				tmp= arr[i];
				arr[i]=arr[j];
				arr[j]=tmp;
				j--;
			}
		}
		return arr;
	}

	public static void printArray(int[] array) {

    for(int a:array){
    	System.out.print(" "+a);
	  }

	}
	
}

