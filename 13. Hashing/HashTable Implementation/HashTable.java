public class HashTable {
    private HashNode[] buckets;
    private int numOfBuckets;
    private int size;

    public HashTable(int capacity) {
        this.buckets = new HashNode[capacity];
        this.numOfBuckets = capacity;
    }

    private class HashNode {
        private int key; // can be generic
        private String value;// can be generic
        private HashNode next;

        public HashNode(Integer key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getBucketIndex(Integer key) {
        return key % numOfBuckets;
    }

    public void put(Integer key, String value) {

    }

    public static void main(String[] args) {
        HashTable hashTable = new HashTable(10);

    }
}
