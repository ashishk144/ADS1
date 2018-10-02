import java.util.Scanner;
/**
 * Class for solution.
 */
public final class Solution {
    /**
     * Magic.
     */
    private static final int TEN = 10;
    /**
     * Magic
     */
    private static final int THREE = 3;
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
        Team[] teams = new Team[TEN];
        int size = 0;
        Scanner scan = new Scanner(System.in);
        Table t = new Table();
        while (scan.hasNext()) {
            String[] line = scan.nextLine().split(",");
            teams[size++] = new Team(line[0], Integer.parseInt(line[1]),
                     Integer.parseInt(line[2]), Integer.parseInt(line[THREE]));
        }
        System.out.println(t.leaderboard(teams, size));
    }
}
