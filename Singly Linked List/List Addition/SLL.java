public class SLL {

    private ListNode head;
    private static class  ListNode {
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
        System.out.print("Null");
    }
    static ListNode additon(ListNode a, ListNode b)
    {
        ListNode dummListNode= new ListNode(0);
        ListNode tail=dummListNode;
        int carry=0;
        while (a!=null || b!=null) {
            int x=(a!=null)?a.data:0;
            int y=(b!=null)?b.data:0;
            int sum=carry+x+y;
            carry=sum/10;
            tail.next=new ListNode(sum%10);
            if(a!=null)
            a=a.next;
            if(b!=null)
            b=b.next;
            tail=tail.next;
        }
        if(carry>0)
        tail.next=new ListNode(carry);
        return dummListNode.next;
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
        ListNode LN2_third=new ListNode(50);
        ListNode LN2_fourth=new ListNode(60);

        sll2.head.next=LN2_second;
        LN2_second.next=LN2_third;
        LN2_third.next=LN2_fourth;

        sll1.display();
        System.out.println();
        sll2.display();
        System.out.println();
        SLL sll=new SLL();
        sll.head=additon(sll1.head, sll2.head);
        sll.display();
    }
}
