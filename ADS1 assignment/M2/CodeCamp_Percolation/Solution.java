// public class Percolation {
//    public Percolation(int n)                // create n-by-n grid, with all sites blocked
//    public    void open(int row, int col)    // open site (row, col) if it is not open already
//    public boolean isOpen(int row, int col)  // is site (row, col) open?
//    public boolean isFull(int row, int col)  // is site (row, col) full?
//    public     int numberOfOpenSites()       // number of open sites
//    public boolean percolates()              // does the system percolate?
// }


// You can implement the above API to solve the problem
import java.util.Scanner;
class WeightedUnion {
    private int[] uf;
    private int[] size;
    public WeightedUnion(int n) {
        uf = new int[n];
        size = new int[n];
        for (int i = 0; i < n; i++) {
            uf[i] = i;
            size[i] = 1;
        }
    }
    public boolean isConnected(int p, int q) {
        return root(p) == root(q);
    }
    public int root(int p) {
        while (p != uf[p]) {
            p = uf[p];
        }
        return p;
    }
    public void union(int p, int q) {
        int i = root(p);
        int j = root(q);
        if (i == j) {
            return;
        } else {
            if (size[i] > size[j]) {
                uf[j] = i;
                size[i] += size[j];
            } else {
                uf[i] = j;
                size[j] += size[i];
            }
        }
    }
}

class Percolation {
    private int[][] grid;
    // private int count;
    private WeightedUnion w;
    private int size;
    private int top;
    private int bottom;
    public Percolation(int n) {
        top = 0;
        bottom = (n * n) + 1;
        grid = new int[n][n];
        w = new WeightedUnion((n * n) + 2);
        size = n;
    }
    public void open(int row, int col) {
        if (!(isOpen(row, col))) {
            grid[row][col] = 1;
            // count++;
        }
        if (row == 0) {
            w.union(getpos(row, col), top);
        }
        if (row == size - 1) {
            w.union(getpos(row, col), bottom);
        }
        if (row > 0 && isOpen(row - 1, col)) {
            w.union(getpos(row - 1, col), getpos(row, col));
        }
        if (col > 0 && isOpen(row, col - 1)) {
            w.union(getpos(row, col - 1), getpos(row, col));
        }
        if (col < size - 1 && isOpen(row, col + 1)) {
            w.union(getpos(row, col + 1), getpos(row, col));
        }
        if (row < size - 1 && isOpen(row + 1, col)) {
            w.union(getpos(row + 1, col), getpos(row, col));
        }
    }
    public boolean isOpen(int row, int col) {
        if (grid[row][col] == 1) {
            return true;
        }
        return false;
    }
    // public boolean isFull(int row, int col) {

    // }
    // public int numberOfOpenSites() {
    //     int c = 0;
    //     for (int i = 0; i < grid.length; i++) {
    //         for (int j = 0; j < grid.length; j++) {
    //             if (int[i][j] == 1) {
    //                 c++;
    //             }
    //         }
    //     }
    //     return c;
    // }
    private int getpos(int row, int col) {
        return (row * size) + col + 1;
    }
    public boolean percolates() {
        return w.isConnected(top, bottom);
    }
}

public class Solution {
    private Solution() {

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Percolation percolate = new Percolation(n);
        int p, q;
        while (scan.hasNext()) {
            p = scan.nextInt();
            q = scan.nextInt();
            percolate.open(p - 1 , q - 1);
        }
        System.out.println(percolate.percolates());
    }
}