import java.util.Scanner;
class AddLargeNumbers {
    /**
     * Returns Linked list of numbers.
     *
     * @param      number  The number
     *
     * @return     { Linked list of numbers }
     */
    public static LinkedList numberToDigits(final String number) {
        LinkedList l = new LinkedList();
        String[] numbers = number.split("");
        for (int i = 0; i < numbers.length; i++) {
            l.push(Integer.parseInt(numbers[i]));
        }
        return l;
    }
    /**
     * Returns string of linked list.
     *
     * @param      list  The list
     *
     * @return     { string of link list }
     */
    public static String digitsToNumber(final LinkedList list) {
        return list.toString();
    }
    /**
     * Adds large numbers.
     *
     * @param      list1  The list 1
     * @param      list2  The list 2
     *
     * @return     { linkedlist of sum }
     */
    public static LinkedList addLargeNumbers(LinkedList list1, LinkedList list2) {
        LinkedList sum = new LinkedList();
        LinkedList carry = new LinkedList();
        if (list2.getSize() > list1.getSize()) {
        LinkedList temp = new LinkedList();
        temp = list1;
        list1 = list2;
        list2 = temp;
        }
        int c = 0;
        while(!(list2.isEmpty())) {
            if(carry.isEmpty()) {
                c = list1.pop() + list2.pop();
            } else {
                c = list1.pop() + list2.pop() + carry.pop();
            }
            if (c < 10) {
                sum.push(c);
            } else {
                String[] temp = Integer.toString(c).split("");
                sum.push(Integer.parseInt(temp[1]));
                carry.push(Integer.parseInt(temp[0]));
            }
        }
        while (list1.isEmpty()) {
            sum.push(list1.pop());
        }
        return sum;
    }
}
/**
 * Class for solution.
 */
public class Solution {
    /**
     * Main method to take inputs and return outputs.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String p = sc.nextLine();
        String q = sc.nextLine();
        switch (input) {
        case "numberToDigits":
            LinkedList pDigits = AddLargeNumbers.numberToDigits(p);
            LinkedList qDigits = AddLargeNumbers.numberToDigits(q);
            System.out.println(AddLargeNumbers.digitsToNumber(pDigits));
            System.out.println(AddLargeNumbers.digitsToNumber(qDigits));
            break;

        case "addLargeNumbers":
            pDigits = AddLargeNumbers.numberToDigits(p);
            qDigits = AddLargeNumbers.numberToDigits(q);
            LinkedList result = AddLargeNumbers.addLargeNumbers(pDigits, qDigits);
            System.out.println(AddLargeNumbers.digitsToNumber(result));
            break;
        }
    }

}
