package mock3;

public class MovesForARobotIsCircularOrNot {

	public static void main(String[] args) {
		String pathArr = "GLGLGLG";
		char path[] = pathArr.toCharArray();

		if (isCircular(path))
			System.out.println("Given sequence" + " of moves is circular");
		else
			System.out.println("Given sequence" + " of moves is NOT circular");
	}

	private static boolean isCircular(char[] path) {
		int x = 0, y = 0, dir = 0;
		for (int i = 0; i < path.length; i++) {
			char move = path[i];
			if (move == 'R')
				dir = (dir + 1) % 4;
			else if (move == 'L')
				dir = (4 + dir - 1) % 4;
			else {
				if (dir == 0)
					y++;
				else if (dir == 1)
					x++;
				else if (dir == 2)
					y--;
				else
					x--;
			}
		}
		return (x == 0 && y == 0);
	}

}
