package tookMock;

/*Length of the longest substring without repeating characters
Given a string str, find the length of the longest substring without repeating characters.

For “ABDEFGABEF”, the longest substring are “BDEFGA” and “DEFGAB”, with length 6.
For “BBBB” the longest substring is “B”, with length 1.
For “GEEKSFORGEEKS”, there are two longest substrings shown in the below diagrams, with length 7*/

import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstring {

	public static void main(String[] args) {
		String s = "abcabcbb";
        int result= lengthOfLongestSubstring(s);
        System.out.println(result);
	}

	private static int lengthOfLongestSubstring(String s) {
		 int i=0,j=0, masLen=0;
	        int len=s.length();
	        Set<Character> set= new HashSet<>();
	        while(i<len && j<len){
	            if(!set.contains(s.charAt(j))){
	                set.add(s.charAt(j++));
	                masLen=Math.max(masLen, j-i);
	            }else{
	                set.remove(s.charAt(i++));
	            }
	        }
	       return  masLen;
	}

}
