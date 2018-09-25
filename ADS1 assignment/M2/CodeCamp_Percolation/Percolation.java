
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
    private int getpos(int row, int col) {
        return (row * size) + col + 1;
    }
    public boolean percolates() {
        return w.isConnected(top, bottom);
    }
}
