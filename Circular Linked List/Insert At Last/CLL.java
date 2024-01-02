public class CLL {
    private ListNode last;
    private int length=0;
    private static class ListNode {
        private ListNode next;
        private int data;

        public ListNode(int data) {
            this.data = data;
        }
    }
    boolean isEmpty()
    {
        return length==0;
    }
    void insertAtEnd(int val)
    {
        ListNode newNode=new ListNode(val);
        if(last==null)
        {
            last=newNode;
        }else{
            newNode.next=last.next;
            last.next=newNode;
            last=newNode;
        }
        length++;
    }
    void display()
    {
        ListNode currentListNode = last.next;
        while (currentListNode!=last) {
            System.out.print(currentListNode.data+"->");
            currentListNode=currentListNode.next;
        }
        System.out.print("Null");
    }
    
}
