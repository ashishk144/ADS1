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
     * Main function to handle inputs and deliver outputs.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        BinaryST<Student, Double> record = new BinaryST();
        for (int i = 0; i < n; i++) {
            String[] inp = scan.nextLine().split(",");
            record.put(new Student(inp[1], Integer.parseInt(inp[0])),
                Double.parseDouble(inp[2]));
        }
        int m = Integer.parseInt(scan.nextLine());
        Iterable<Student> keys = record.keys();
        for (int i = 0; i < m; i++) {
            String[] inp = scan.nextLine().split(" ");
            switch (inp[0]) {
            case "BE":
                Double a = Double.parseDouble(inp[1]);
                Double b = Double.parseDouble(inp[2]);
                for (Student s : keys) {
                    if (record.get(s) >= a && record.get(s) <= b) {
                        System.out.println(s.getName());
                    }
                }
                break;
            case "LE":
                a = Double.parseDouble(inp[1]);
                for (Student s : keys) {
                    if (record.get(s) <= a) {
                        System.out.println(s.getName());
                    }
                }
                break;
            case "GE":
                a = Double.parseDouble(inp[1]);
                for (Student s : keys) {
                    if (record.get(s) >= a) {
                        System.out.println(s.getName());
                    }
                }
                break;
            default:
                break;
            }
        }
    }
}