class SLL
{
    private ListNode head;
    private static class ListNode {
        private ListNode next;
        private int data;

        public ListNode(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    void display()
    {
        ListNode currentListNode=head;
        while (currentListNode!=null) {
            System.out.print(currentListNode.data+"->");
            currentListNode=currentListNode.next;
        }
        System.err.print("NULL");
    }
    void deleteAtFirst()
    {
        head=head.next;
    }
    public static void main(String[] args) {
        SLL sll=new SLL();
        sll.head=new ListNode(10);
        ListNode second=new ListNode(20);
        ListNode third=new ListNode(30);

        sll.head.next=second;
        second.next=third;
        sll.display();
        sll.deleteAtFirst();
        System.out.println();
        sll.display();
    }
}