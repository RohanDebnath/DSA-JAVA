class MaxPQ {
    private Integer[] heap;
    private int n;

    public MaxPQ(int capacity) {
        heap = new Integer[capacity + 1]; // 0 index is kept as empty
        n = 0;
    }

    public boolean isEmpty() {
        return n == 0;
    }

    public int size() {
        return n;
    }

    public static void main(String[] args) {
        MaxPQ maxPQ= new MaxPQ(3);
        System.out.println(maxPQ.size());
        System.out.println(maxPQ.isEmpty());
    }
}