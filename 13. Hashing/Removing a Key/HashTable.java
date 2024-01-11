public class HashTable {
    private HashNode bucket[];
    private int numOfBuckets;
    private int size;

    public HashTable(int capacity) {
        this.bucket = new HashNode[capacity];
        this.numOfBuckets = capacity;
        this.size = 0;
    }

    private class HashNode {
        private int key;
        private String value;
        private HashNode next;

        public HashNode(int key, String value) {
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

    public int getBucketIndex(Integer val) {
        return val % numOfBuckets;
    }

    public void put(Integer key, String value) {
        int bucketIndex = getBucketIndex(key);
        HashNode head = bucket[bucketIndex];

        while (head != null) {
            if (head.key == key) {
                head.value = value;
                return;
            }
            head = head.next;
        }
        head = bucket[bucketIndex];
        size++;
        HashNode newNode = new HashNode(key, value);
        newNode.next = head;
        bucket[bucketIndex] = newNode;
    }

    public String get(Integer key) {
        int bucketIndex = getBucketIndex(key);
        HashNode head = bucket[bucketIndex];
        while (head != null) {
            if (head.key == key) {
                return head.value;
            }
            head = head.next;
        }
        return null;
    }

    public String remove(Integer key) {
        int bucketIndex = getBucketIndex(key);
        HashNode head = bucket[bucketIndex];
        HashNode previous = null;
        while (head != null) {
            if (head.key == key) {
                break;
            }
            previous = head;
            head = head.next;
        }
        if (head == null)
            return null;
        size--;
        if (previous != null) {
            previous.next = head.next;
        } else {
            bucket[bucketIndex] = head.next;
        }
        return head.value;
    }

    public static void main(String[] args) {
        HashTable table = new HashTable(10);
        table.put(101, "Rohan");
        table.put(101, "Debnath"); // It will be printed as it the updated value
        table.put(102, "Ayantika");
        System.out.println(table.size);
        System.out.println(table.get(101));
        System.out.println(table.remove(101));
        System.out.println(table.size);
    }
}
