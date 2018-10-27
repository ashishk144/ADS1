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
        LinearProbingHashST<Student, Double> record = new LinearProbingHashST();
        for (int i = 0; i < n; i++) {
            String[] inp = scan.nextLine().split(",");
            record.put(new Student(inp[1], Integer.parseInt(inp[0])), Double.parseDouble(inp[2]));
        }
        int m = Integer.parseInt(scan.nextLine());
        Iterable<Student> keys = record.keys();
        for (int i = 0; i < m; i++) {
            String[] inp = scan.nextLine().split(" ");
            switch (inp[0]) {
                case "BE":
                    Double a = Double.parseDouble(inp[1]);
                    Double b = Double.parseDouble(inp[2]);
                    for(Student key: keys) {
                        if(record.get(key) <= a && record.get(key) >= b) {
                            System.out.println(key.getName());
                        }
                    }
                    break;
                case "LE":
                    Double j = Double.parseDouble(inp[1]);
                    for(Student key: keys) {
                        if(record.get(key) <= j) {
                            System.out.println(key.getName());
                        }
                    }
                case "GE":
                    Double k = Double.parseDouble(inp[1]);
                    for(Student key: keys) {
                        if(record.get(key) >= k) {
                            System.out.println(key.getName());
                        }
                    }
                    break;
                default:
                    break;
            }
        }
    }
}