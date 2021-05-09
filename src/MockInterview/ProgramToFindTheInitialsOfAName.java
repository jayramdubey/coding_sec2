package MockInterview;

/*Program to find the initials of a name.
Given a string name, we have to find the initials of the name*/


public class ProgramToFindTheInitialsOfAName {

	public static void main(String[] args) {
		   String name = "prabhat kumar singh"; 
	        printInitials(name); 
	}

	private static void printInitials(String name) {
		String arr[]= name.split(" ");
		StringBuilder sb= new StringBuilder();
		for(String s: arr){
			sb.append(s.toUpperCase().charAt(0)+" ");
		}
		System.out.println(sb);
	}

}
