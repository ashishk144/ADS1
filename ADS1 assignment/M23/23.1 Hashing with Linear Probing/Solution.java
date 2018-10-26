import java.util.Scanner;

/**
 * Class for solution.
 */
public final class Solution {
  /**
   * Constructs the object.
   */
  private Solution() {
  }
  /**
   * Main function.
   *
   * @param      args  The arguments
   */
  public static void main(final String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = Integer.parseInt(scan.nextLine());
    LinearProbingHashST<String, Integer> linearprobe =
      new LinearProbingHashST<>();
    for (int i = 0; i < n; i++) {
      String[] tokens = scan.nextLine().split(" ");
      switch (tokens[0]) {
      case "put":
        linearprobe.put(tokens[1],
                  Integer.parseInt(tokens[2]));
        break;
      case "get":
        System.out.println(linearprobe.get(tokens[0]));
        break;
      case "delete":
        linearprobe.delete(tokens[1]);
        break;
      case "display":
        System.out.println(linearprobe);
        break;
      default:
        break;
      }
    }
  }
}
