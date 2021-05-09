package SCB_Mock;

import java.util.Scanner;
import java.util.Stack;

public class ParenthesesInJava {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the parenthesis: ");
		String str = sc.nextLine();
		char arr[] = str.toCharArray();
		validateParenthesis(arr);

	}

	private static void validateParenthesis(char[] arr) {
		Stack<Character> ch = new Stack<>();
		

	}

}
