class MaxHeap {
    int size = 0;
    int a[] = new int[1000];

    void add(int x) {
        a[size] = x;
        int ci = size;
        size++;
        while (ci > 0) {
            int pi = (ci - 1) / 2;
            if (a[pi] < a[ci]) {
                int t = a[pi];
                a[pi] = a[ci];
                a[ci] = t;
            }
            ci = pi;
        }
    }

    void printHeap() {
        for (int i = 0; i < size; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }
}
