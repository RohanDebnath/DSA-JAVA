public class SLL {
    private ListNode head;

    private static class ListNode {
        private ListNode next;
        private int data;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    void display() {
        ListNode currentListNode = head;
        while (currentListNode != null) {
            System.out.print(currentListNode.data + "->");
            currentListNode = currentListNode.next;
        }
        System.out.print("NULL");
    }

    void reverseList() {
        if (head == null) {
            System.out.println("Nothing to reverse");
        } else {
            ListNode currentListNode=head;
            ListNode prevListNode=null;
            ListNode nexListNode=null;
            while (currentListNode!=null) {
                nexListNode=currentListNode.next;
                currentListNode.next=prevListNode;
                prevListNode=currentListNode;
                currentListNode=nexListNode;
            }
            head=prevListNode;
        }
    }

    public static void main(String[] args) {
        SLL sll = new SLL();
        sll.head = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode thrid = new ListNode(30);

        sll.head.next = second;
        second.next = thrid;
        sll.display();
        sll.reverseList();
        System.out.println();
        sll.display();
    }
}
