package mock3;

import java.io.*;

public class JosephusProblem {

	public static void main(String[] args) {
		int ar[] ={1,2,3,4,5};
		int n = ar.length;
		int k = 2;
		System.out.println("The chosen place is: " + circularArray(n, k));
	}

/*	static int circularArray(int n, int k) {
		int res = 0;
		for (int i = 1; i <= n; ++i)
			res = (res + k) % i;
		return res + 1;
	}*/
	

	static int circularArray(int n, int k) {
		if (n == 1)
			return 1;
		else

			return (circularArray(n - 1, k) + k - 1) % n + 1;
	}
	/*static int startFromPos(int n,int k){
		if (n == 1)
			return 1;
		else
		return startFromPos(n, k)+1;
	}*/

}
