public class CLL {

    private ListNode last;
    private int length = 0;

    private static class ListNode {
        private ListNode next;
        private int data;

        public ListNode(int data) {
            this.data = data;
        }
    }

    boolean isEmpty() {
        return length == 0;
    }

    void createList() {
        ListNode first = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);
        ListNode fourth = new ListNode(40);
        ListNode fifth = new ListNode(50);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = first;

        last = fifth;
    }

    void display()
    {
        if(last==null)
        {
            System.out.println("Nothing to print");
        }else
        {
            ListNode currentListNode=last.next;
            while (currentListNode!=last) {
                System.out.print(currentListNode.data+"->");
                currentListNode=currentListNode.next;
            }
            System.out.print("NULL");
        }
      
    }

    public static void main(String[] args) {
        CLL cll = new CLL();
        cll.createList();
        cll.display();
    }
}
