public class SLL {

    private ListNode head;
    private static class ListNode{
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
        ListNode currentListNode =head;
        while (currentListNode!=null) {
            System.out.print(currentListNode.data+"->");
            currentListNode=currentListNode.next;
        }
        System.out.print("NULL");
    }
    void deleteAtLast()
    {
        if(head.next==null || head.next.next==null)
        {
            System.out.println("Nothing to delete");
        }else
        {
            ListNode currentListNode=head;
            while (currentListNode.next.next!=null) {
                currentListNode=currentListNode.next;
            }
            currentListNode.next=null;
        }
    }
    public static void main(String[] args) {
        SLL sll= new SLL();
        sll.head=new ListNode(10);
        ListNode second= new ListNode(20);
        ListNode third= new ListNode(30);
        sll.head.next=second;
        second.next=third;

        sll.display();
        sll.deleteAtLast();
        System.out.println();
        sll.display();

    }
}
