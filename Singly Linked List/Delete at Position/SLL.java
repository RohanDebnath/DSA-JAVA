public class SLL {

    private ListNode head;
    private static class ListNode
    {
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
    void deleteAtPos(int pos)
    {
        if(pos==1)
        {
            head=head.next;
        }else{
            int count=1;
            ListNode prevListNode=head;
            while (count<pos-1) {
                prevListNode=prevListNode.next;
            }
            ListNode currListNode=prevListNode.next;
            prevListNode.next=currListNode.next;
        }

    }
    public static void main(String[] args) {
        SLL sll=new SLL();
        sll.head=new ListNode(10);
        ListNode second= new ListNode(20);
        ListNode third= new ListNode(30);
        ListNode fourth= new ListNode(40);
        ListNode fifth= new ListNode(50);

        sll.head.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;
        sll.display();

        sll.deleteAtPos(2);
        System.out.println();
        sll.display();
    }    
}
