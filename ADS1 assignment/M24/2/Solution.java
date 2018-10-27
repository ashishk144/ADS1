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
        BinaryST<Double, Student> record = new BinaryST();
        for (int i = 0; i < n; i++) {
            String[] inp = scan.nextLine().split(",");
            record.put(Double.parseDouble(inp[2]),
                       new Student(inp[1], Integer.parseInt(inp[0])));
        }
        int m = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < m; i++) {
            String[] inp = scan.nextLine().split(" ");
            switch (inp[0]) {
                case "BE":
                Double l = Double.parseDouble(inp[1]);
                System.out.println(l);
                    while (l >= Double.parseDouble(inp[1])
                        && l <= Double.parseDouble(inp[2]));
                        if(record.ceil(l)!= null && record.ceil(l) <=  Double.parseDouble(inp[2])) {
                            System.out.println(record.get(record.ceil(l)).getName());
                            l = record.ceil(l) + 0.01;
                        } else {
                            break;
                        }
                    break;
                case "LE":
                    Double j = Double.parseDouble(inp[1]);
                    while (j <= Double.parseDouble(inp[1]))
                        if (record.floor(j) != null) {
                            System.out.println(record.get(record.floor(j)).getName());
                            j = record.floor(j) - 0.01;
                        } else {
                            break;
                        }
                    break;
                case "GE":
                    Double k = Double.parseDouble(inp[1]);
                    while (k >= Double.parseDouble(inp[1]))
                        if (record.ceil(k) != null) {
                            System.out.println(record.get(record.ceil(k)).getName());
                            k = record.ceil(k) - 0.01;
                        } else {
                            break;
                        }
                    break;
                default:
                    break;
            }
        }
    }
}