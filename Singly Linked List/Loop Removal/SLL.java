public class SLL {
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
    void LoopDetection()
    {
        boolean detection=false;
        ListNode fastPointer=head;
        ListNode slowPointer=head;
        while (fastPointer!=null && fastPointer.next!=null) {
            fastPointer=fastPointer.next.next;
            slowPointer=slowPointer.next;
            if(fastPointer==slowPointer)
            {
                detection=true;
                break;
            }
        }
        System.out.println(detection);
    }
    void RemoveTheLoop(ListNode slowPointer)
    {
        ListNode temp=head;
        while (slowPointer!=temp) {
            temp=temp.next;
            slowPointer=slowPointer.next;
        }
        slowPointer.next=null;
    }
    void LoopRemoval()
    {
        ListNode fastPointer=head;
        ListNode slowPointer=head;
        while (fastPointer!=null && fastPointer.next!=null) {
            fastPointer=fastPointer.next.next;
            slowPointer=slowPointer.next;
            if(fastPointer==slowPointer){
                RemoveTheLoop(slowPointer);
            }
        }
    }

    public static void main(String[] args) {
        SLL sll=new SLL();
        sll.head=new ListNode(10);
        ListNode second=new ListNode(20);
        ListNode third=new ListNode(30);
        ListNode fourth=new ListNode(40);
        ListNode fifth=new ListNode(50);
        ListNode sixth=new ListNode(60);

        sll.head.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;
        fifth.next=sixth;
        sixth.next=third;

        sll.LoopDetection();
        sll.LoopRemoval();
        sll.LoopDetection();


    }    
}
