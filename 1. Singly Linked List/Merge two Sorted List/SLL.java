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
        ListNode currentListNode = this.head;
        while (currentListNode!=null) {
            System.out.print(currentListNode.data+"->");
            currentListNode=currentListNode.next;
        }
        System.out.print("NULL");
    }
    static ListNode mergeList(ListNode a, ListNode b)
    {
       ListNode dummyNode=new ListNode(0);
       ListNode tail=dummyNode;
        while (a!=null && b!=null) {
            if(a.data<=b.data)
            {
                tail.next=a;
                a=a.next;
            }else{
                tail.next=b;
                b=b.next;
            }
            tail=tail.next;
        }
        if(a==null)
        {
            tail.next=b;
        }else
        tail.next=a;

        return dummyNode.next;
    }
    public static void main(String[] args) {
        SLL sll1=new SLL();
        SLL sll2=new SLL();

        sll1.head=new ListNode(10);
        ListNode LN1_second=new ListNode(40);
        ListNode LN1_third=new ListNode(60);

        sll1.head.next=LN1_second;
        LN1_second.next=LN1_third;

        sll2.head=new ListNode(20);
        ListNode LN2_second=new ListNode(30);
        ListNode LN3_third=new ListNode(50);

        sll2.head.next=LN2_second;
        LN2_second.next=LN3_third;

        sll1.display();
        System.out.println();
        sll2.display();
        
        SLL sll= new SLL();
        sll.head=mergeList(sll1.head, sll2.head);
        System.out.println();
        sll.display();
    }    
}
