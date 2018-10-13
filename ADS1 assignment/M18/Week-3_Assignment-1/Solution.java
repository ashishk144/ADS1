import java.util.Scanner;

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
    /**
     *gets the size of minheap.
     *
     * @return     The minimum size.
     */
    public int getMinSize() {
        return min.size();
    }
    /**
     * Gets the maximum size of maxheap.
     *
     * @return     The maximum size.
     */
    public int getMaxSize() {
        return max.size();
    }
}

public class Solution {
    private Solution() {

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        BinarySearchST<Stock, Integer> best = new BinarySearchST();
        BinarySearchST<Stock, Integer> worst = new BinarySearchST();
        Stock stock;
        for (int i = 0; i < 6; i++) {
            OrderPQ obj = new OrderPQ();
            int j = 0;
            while (j < n) {
            String[] line = scan.nextLine().split(",");
            Stock st = new Stock(line[0], Double.parseDouble(line[1]));
            obj.insertAtMin(st);
            obj.insertAtMax(st);
            j++;
            }
            for (int k = 0; k < 5; k++) {
                stock = obj.delMax();
                System.out.println(stock);
            }
            System.out.println();
            for (int l = 0; l < 5; l++) {
                stock = obj.delMin();
                System.out.println(stock);
            }
            System.out.println();
        }
    }
}