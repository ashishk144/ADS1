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
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        SeparateChainingHashST<Integer, Student> record
        = new SeparateChainingHashST();
        for (int i = 0; i < n; i++) {
            String[] inp = scan.nextLine().split(",");
            record.put(Integer.parseInt(inp[0]),
                new Student(inp[1], Double.parseDouble(inp[2])));
        }
        int m = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < m; i++) {
            String[] inp = scan.nextLine().split(" ");
            int roll = Integer.parseInt(inp[1]);
            if (record.contains(roll)) {
                Student s = record.get(roll);
                if (Integer.parseInt(inp[1]) == 1) {
                    System.out.println(s.getName());
                } else {
                    System.out.println(s.getMark());
                }
            } else {
                System.out.println("Student doesn't exists...");
            }
        }
    }
}
