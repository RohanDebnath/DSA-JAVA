public class DLL {
    private ListNode head;
    private ListNode tail;
    private static int length=0;
    private static class  ListNode {
        private int data;
        private ListNode next;
        private ListNode prev;
        public ListNode(int data)
        {
            this.data=data;
        }
    }
    public boolean isEmpty()
    {
        return length==0;
    }
    void addNodeFromBack(int val)
    {
        ListNode newNode=new ListNode(val);
        if(isEmpty())
        head=newNode;
        else{
            tail.next=newNode;
        }
        newNode.prev=tail;
        tail=newNode;
        length++;
    }
    
    void displayForward()
    {
        ListNode currentListNode=head;
        while (currentListNode!=null) {
            System.out.print(currentListNode.data+"->");
            currentListNode=currentListNode.next;
        }
        System.out.print("NULL");
    }
    void displayBackward()
    {
        ListNode currentListNode=tail;
        while (currentListNode!=null) {
            System.out.print(currentListNode.data+"->");
            currentListNode=currentListNode.prev;
        }
        System.out.print("NULL");
    }
    public static void main(String[] args) {
        DLL dll=new DLL();
        dll.addNodeFromBack(10);
        dll.addNodeFromBack(20);
        dll.addNodeFromBack(30);
        dll.displayForward();
        System.out.println();
        dll.displayBackward();
        System.out.println();
        System.out.println(dll.length);
    }    
}
