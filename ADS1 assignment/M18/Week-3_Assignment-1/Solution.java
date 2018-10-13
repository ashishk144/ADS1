import java.util.Scanner;
import java.util.Arrays;
/**
 * Class for order pq.
 */
class OrderPQ {
    /**
     *the object to access of minheap.
     */
    private MinPQ<Stock> min;
    /**
     *the object to access of maxheap.
     */
    private MaxPQ<Stock> max;
    /**
     *the constructor for initializing.
     */
    OrderPQ() {
        min = new MinPQ<Stock>();
        max = new MaxPQ<Stock>();
    }
    /**
     *the method will insert the element
     *to minheap.
     * @param      item  The item
     */
    public void insertAtMin(final Stock item) {
        min.insert(item);
    }
    /**
     *the method will insert the element
     *to maxheap.
     * @param      item  The item
     */
    public void insertAtMax(final Stock item) {
        max.insert(item);
    }
    /**
     *this method gets the minimum element.
     * from minheap.
     * @return     The minimum.
     */
    public Stock getMin() {
        return min.min();
    }
    /**
     *this method gets the maximum element.
     * from maxheap.
     * @return     The minimum.
     */
    public Stock getMax() {
        return max.max();
    }
    /**
     *this method delete the maximum element.
     * from maxheap.
     * @return     The minimum.
     */
    public Stock delMax() {
        return max.delMax();
    }
    /**
     *this method delete the minimum element.
     * from maxheap.
     * @return     The minimum.
     */
    public Stock delMin() {
        return min.delMin();
    }
}
/**
 * Class for solution.
 */
public final class Solution {
    /**
     * MAGIC.
     */
    private static final int FIVE = 5;
    /**
     * MAGIC
     */
    private static final int SIX = 6;
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
        BinarySearchST<String, Integer> best = new BinarySearchST();
        BinarySearchST<String, Integer> worst = new BinarySearchST();
        Stock stock;
        for (int i = 0; i < SIX; i++) {
            OrderPQ obj = new OrderPQ();
            int j = 0;
            while (j < n) {
                String[] line = scan.nextLine().split(",");
                Stock st = new Stock(line[0], Double.parseDouble(line[1]));
                obj.insertAtMin(st);
                obj.insertAtMax(st);
                j++;
            }
            for (int k = 0; k < FIVE; k++) {
                stock = obj.delMax();
                if (best.contains(stock.getName())) {
                    best.put(stock.getName(), best.get(stock.getName()) + 1);
                } else {
                    best.put(stock.getName(), 1);
                }
                System.out.println(stock);
            }
            System.out.println();
            for (int l = 0; l < FIVE; l++) {
                stock = obj.delMin();
                if (worst.contains(stock.getName())) {
                    worst.put(stock.getName(), worst.get(stock.getName()) + 1);
                } else {
                    worst.put(stock.getName(), 1);
                }
                System.out.println(stock);
            }
            System.out.println();
        }
        int m = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < m; i++) {
            String[] inp = scan.nextLine().split(",");
            switch (inp[0]) {
            case "get":
                switch (inp[1]) {
                case "minST":
                    if (worst.contains(inp[2])) {
                        System.out.println(worst.get(inp[2]));
                    } else {
                        System.out.println("0");
                    }
                    break;
                case "maxST":
                    if (best.contains(inp[2])) {
                        System.out.println(best.get(inp[2]));
                    } else {
                        System.out.println("0");
                    }
                    break;
                }
                break;
            case "intersection":
                Object[] key = best.getKeys();
                String str = "";
                for (int l = 0; l < key.length; l++) {
                    if (key[l] != null) {
                        str = (String) key[l];
                    }
                    if (worst.contains(str) && !(str.equals(""))) {
                        System.out.println(str);
                        str = "";
                    }
                }
                break;
            default:
                break;
            }
        }
    }
}
