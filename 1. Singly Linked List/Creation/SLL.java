public class SLL {

    private ListNode head;
    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void display() {
        ListNode currentListNode = head;
        while (currentListNode != null) {
            System.out.print(currentListNode.data+"->");
            currentListNode=currentListNode.next;
        }
        System.out.print("NULL");
    }

    public static void main(String[] args) {
        SLL sll = new SLL();
        sll.head = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);

        // Lets connect the data with each other
        sll.head.next = second;
        second.next = third;
        third.next = null; // if not written then it will be treated as Null only

        sll.display();
    }

}
