import java.util.Scanner;
public final class Solution {
    private Solution() {

    }
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] line = scan.nextLine().split(" ");
        List<String> obj = new List<String>();
        System.out.println(obj.evaluate(line));
    }
}