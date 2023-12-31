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
        boolean detected=false;
        ListNode fastPointer=head;
        ListNode slowPointer=head;
        while (fastPointer!=null && fastPointer.next!=null) {
            fastPointer=fastPointer.next.next;
            slowPointer=slowPointer.next;
            if(fastPointer==slowPointer){
                 detected=true;
                 break;
            }
        }
        System.out.println("Loop detection "+ detected);
    }
    public static void main(String[] args) {
        SLL sll=new SLL();
        sll.head=new ListNode(10);
        ListNode second= new ListNode(20);
        ListNode third= new ListNode(30);
        ListNode fourth= new ListNode(40);
        ListNode fifth= new ListNode(50);
        ListNode sixth= new ListNode(60);

        sll.head.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;
        fifth.next=sixth;
        sixth.next=second;

        sll.LoopDetection();

    }
}
