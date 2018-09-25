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
            // uf[p] = uf[uf[p]];
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
