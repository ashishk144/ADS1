import java.util.Scanner;
/**
 * Class for solution.
 */
public class Solution {
    /**
     * Default constructor for the object.
     */
    private Solution() {

    }
    /**
     * Main function to handle inputs and deliver output.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());
        int i = 0;
        boolean flag = true;
        String[] line;
        LinkedList<String> ll = new LinkedList<String>();
        while (i < num) {
            line = scan.nextLine().split("");
            for (int j = 0; j < line.length; j++) {
                // System.out.println(line[j]);
                if (line[j].equals("[") || line[j].equals("(") || line[j].equals("{")) {
                    ll.add(line[j]);
                } else if (line[j].equals("]")) {
                    if (ll.isEmpty() || !(ll.popHead().equals("["))) {
                        System.out.println("NO");
                        flag = false;
                        break;
                    }
                } else if (line[j].equals(")")) {
                    if (ll.isEmpty() || !(ll.popHead().equals("("))) {
                        System.out.println("NO");
                        flag = false;
                        break;
                    }
                } else if (line[j].equals("}")) {
                    if (ll.isEmpty() || !(ll.popHead().equals("{"))) {
                        System.out.println("NO");
                        flag = false;
                        break;
                    }
                }
            }
            if (ll.isEmpty()) {
                System.out.println("YES");
            } else if(flag) {
                System.out.println("NO");
                flag = true;
            }
            // System.out.println(ll.popHead());
            // System.out.println(ll.popTail());
            i++;
        }
    }
}