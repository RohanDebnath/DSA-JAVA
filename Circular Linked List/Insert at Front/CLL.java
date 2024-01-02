public class CLL {
    private ListNode last;
    private static int length=0;
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

    void addNode(int val) {
        ListNode newListNode = new ListNode(val);
        if (last == null)
            last = newListNode;
        else {
            newListNode.next=last.next;
            last.next=newListNode;
            last=newListNode;
        }
        length++;
    }

    public static void main(String[] args) {
        CLL cll = new CLL();
    }
}
