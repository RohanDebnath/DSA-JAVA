class MaxPQ {
    private Integer[] heap;
    private int index;

    public MaxPQ(int capacity) {
        heap = new Integer[capacity + 1]; // 0 index is kept as empty
        index = 0;
    }

    public boolean isEmpty() {
        return index == 0;
    }

    public int size() {
        return index;
    }
    void insert(int val)
    {
        if(index==heap.length-1){
            // resize(2*heap.length);
        }
        index++;
        heap[index]=val;
        swim(index);
    }
    void swim(int index)
    {
        if(index>1 && heap[index/2]<heap[index])
        {
            heap[index]=heap[index]^heap[index/2];
            heap[index/2]=heap[index]^heap[index/2];
            heap[index]=heap[index]^heap[index/2];
            index=index/2;
        }
    }
    public static void main(String[] args) {
        MaxPQ maxPQ= new MaxPQ(3);
        System.out.println(maxPQ.size());
        System.out.println(maxPQ.isEmpty());
    }
}