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

    public ListNode getStartinfNodePos(ListNode slowPointer)
    {
        ListNode temp=head;
        while (slowPointer!=temp) {
            slowPointer=slowPointer.next;
            temp=temp.next;
        }
        return temp;
    }
    ListNode startOfLoopFinder()
    {
        ListNode fastPoiner=head;
        ListNode slowPointer=head;
        while (fastPoiner!=null && fastPoiner.next!=null) {
            fastPoiner=fastPoiner.next.next; 
            slowPointer=slowPointer.next;
            if(fastPoiner==slowPointer)
            {
                System.out.println(getStartinfNodePos(slowPointer).data); //Both the process one by direct print
                return getStartinfNodePos(slowPointer);                    //Other by return
            }
        }
        return null;
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

        System.out.println(sll.startOfLoopFinder().data);

    }
}
