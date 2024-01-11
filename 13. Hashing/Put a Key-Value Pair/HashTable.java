public class HashTable {
    private HashNode bucket[];
    private int numOfBuckets;
    private int size;

    public HashTable(int capacity) {
        this.bucket = new HashNode[capacity];
        this.size = 0;
        this.numOfBuckets = capacity;
    }

    private class HashNode {
        private int key;
        private String value;
        private HashNode next;

        public HashNode(Integer key, String value) {
            this.key = key;
            this.value = value;
        }

    }

    int size() {
        return size;
    }

    boolean isEmpty() {
        return size == 0;
    }

    public int getBucketIndex(Integer key) {
        return key % numOfBuckets;
    }

    public void put(Integer key, String value) {
        int bucketIndex = getBucketIndex(key);
        HashNode head = bucket[bucketIndex];
        while (head != null) {
            if (head.key == (key)) {
                head.value = value; // For value updation if same key repeats
                return;
            }
            head = head.next;
        }
        size++;
        head = bucket[bucketIndex];
        HashNode newNode = new HashNode(key, value);
        newNode.next = head;
        bucket[bucketIndex] = newNode;

    }

    public static void main(String[] args) {
        HashTable ht = new HashTable(10);
        ht.put(101, "Rohan");
        ht.put(102, "Ayantika");
        System.out.println(ht.size);
    }
}
