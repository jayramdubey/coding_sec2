package SCB_Mock;

public class ReverseWordOfString {

	public static void main(String[] args) {
		String str = "jayram dhar dubey";
		ReverseStrM1(str);
	}

	private static void ReverseStrM1(String str) {
		String arr[] = str.split(" ");
		String word="";
		
		String resultVal="";
		for(int i=0;i<arr.length;i++){
			String rev="";
			word= arr[i];
		  for(int j=word.length()-1;j>=0;j--){
			  rev= rev+word.charAt(j);
		  }
		  resultVal +=rev+" ";
		}
		System.out.println(resultVal);
		
	}

}
