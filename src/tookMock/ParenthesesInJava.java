package tookMock;

import java.util.Stack;

public class ParenthesesInJava {

	public static void main(String[] args) {

		System.out.println(isValid("( [ { } ] )(".toCharArray())); // valid
		System.out.println(isValid("([{}])".toCharArray())); // valid
		System.out.println(isValid("([)]".toCharArray())); // invalid
		System.out.println(isValid("(}".toCharArray())); // invalid

	}

	public static boolean isValid(char[] charArray) {
		
		Stack<Character> container = new Stack<Character>();

		for (char c : charArray) {

			if (c == ' ') {
				continue;
			}

			if (c == '(' || c == '{' || c == '[') {
				container.push(c);
			} 
			else if (c == ')' && container.contains('(')  || c == '}' && container.contains('{')
					|| c == ']' && container.contains('[')) {
				container.pop();
			} else {
				return false;
			}

		}

		return container.isEmpty();
	}
}