public class MaxPQ {
    private Integer[] heap;
    private int index;

    MaxPQ(int capacity) {
        heap = new Integer[capacity];
        index = 0;
    }

    boolean isEmpty() {
        return index == 0;
    }

    int size() {
        return index;
    }

    void insert(int val) {
        if (index == heap.length - 1) {
            resize(2 * heap.length);
        }
        index++;
        heap[index] = val;
        swim(index);
    }

    void resize(int capacity) {
        Integer[] temp = new Integer[capacity];
        for (int i = 1; i <= index; i++) {
            temp[i] = heap[i];
        }
        heap = temp;
    }

    void swim(int index) {
        while (index > 1 && heap[index / 2] < heap[index]) {
            heap[index] = heap[index] ^ heap[index / 2];
            heap[index / 2] = heap[index] ^ heap[index / 2];
            heap[index] = heap[index] ^ heap[index / 2];
            index = index / 2;
        }
    }

    void print() {
        for (int i = 1; i <= index; i++) {
            System.out.print(heap[i] + " ");
        }
    }

    public int deleteMax() {
        int max = heap[1];
        swap(1, index);
        index--;
        sink(1);
        heap[index + 1] = null;
        if (index > 0 && (index == (heap.length - 1) / 4)) {
            resize(heap.length / 2);
        }
        return max;
    }

    void swap(int a, int b) {
        heap[a] = heap[a] ^ heap[b];
        heap[b] = heap[a] ^ heap[b];
        heap[a] = heap[a] ^ heap[b];
    }

    void sink(int k) {
        while (2 * k <= index) { // mane child acche
            int j = 2 * k;
            if (j < index && heap[j] < heap[j + 1]) {
                j++;
            }
            if (heap[k] >= heap[j]) {
                break;
            }
            swap(k, j);
            k = j;
        }
    }

    public static void main(String[] args) {
        MaxPQ maxPQ = new MaxPQ(3);
        maxPQ.insert(4);
        maxPQ.insert(5);
        maxPQ.insert(2);
        maxPQ.insert(6);
        maxPQ.insert(1);
        maxPQ.insert(3);
        System.out.println(maxPQ.size());
        System.out.println(maxPQ.isEmpty());
        maxPQ.print();
        maxPQ.deleteMax();
        System.out.println();
        maxPQ.print();

    }
}
