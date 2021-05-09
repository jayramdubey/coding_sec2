package MockInterview;
//Given a chessboard find the maximum number of squares present?

public class ProgramToFindNumberOfSquaresInAChessboard {

	public static void main(String[] args) {
		int n = 8; 
		System.out.println("Count of squares is "+countSquares(n)); 
	}

	private static int countSquares(int n) {
		
		return ((n * (n + 1)) * (2 * n + 1)) / 6; 
	}

}
