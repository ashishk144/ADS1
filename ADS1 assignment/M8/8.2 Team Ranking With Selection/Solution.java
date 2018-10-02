import java.util.Scanner;
/**
 * Class for solution.
 */
public class Solution {
	/**
	 * Constructs the object.
	 */
	private Solution() {

	}
	/**
	 * Main function to handle test cases and deliver output.
	 *
	 * @param      args  The arguments
	 */
	public static void main(final String[] args) {
		Team[] teams = new Team[10];
		int size = 0;
		Scanner scan = new Scanner(System.in);
		Selection s = new Selection();
		while (scan.hasNext()) {
			String[] line = scan.nextLine().split(",");
			teams[size++] = new Team(line[0], Integer.parseInt(line[1]),
			      Integer.parseInt(line[2]), Integer.parseInt(line[3]));
		}
		System.out.println(s.winner(teams, size));
	}
}