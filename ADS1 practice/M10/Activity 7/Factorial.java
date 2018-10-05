import java.util.Scanner;
/**
 * Class for factorial.
 */
public class Factorial {
    /**
     * Constructs the object.
     */
    Factorial() {

    }
    /**
     * Finds the factorial of the number
     *
     * @param      n     { parameter_description }
     *
     * @return     Factorial value.
     */
    public static int fact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }
    /**
     * Main function to handle inputs and deliver output.
     *
     * @param      args  The arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(fact(n));
    }
}