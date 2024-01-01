import java.util.Scanner;

public class DLL {

    private ListNode head;
    private ListNode tail;
    private static int length = 0;

    private static class ListNode {
        private ListNode prev;
        private ListNode next;
        private int data;

        public ListNode(int data) {
            this.data = data;
        }
    }

    public boolean isEmpty() {
        return length == 0;
    }

    void addNodeFromBack(int val) {
        ListNode newNode = new ListNode(val);
        if (isEmpty()) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        newNode.prev = tail;
        tail = newNode;
        length++;
    }

    void displayForward() {
        ListNode currentListNode = head;
        while (currentListNode != null) {
            System.out.print(currentListNode.data + "->");
            currentListNode = currentListNode.next;
        }
        System.out.print("NULL");
    }

    void displayBackward() {
        ListNode currentListNode = tail;
        while (currentListNode != null) {
            System.out.print(currentListNode.data + "->");
            currentListNode = currentListNode.prev;
        }
        System.out.print("NULL");
    }
   void deleteAtLast()
   {
    if(isEmpty())
    System.out.println("Nothing to be deleted");
    else
    {
        if(head==null)
        {
            head.next=null;
        }
        tail.prev.next=null;
        tail=tail.prev;
        length--;
    }
   }
    public static void main(String[] args) {
        DLL dll = new DLL();
        boolean decison = true;
        while (decison) {
            System.out.println("Do you want to add a Node? Y/N");
            Scanner sc = new Scanner(System.in);
            char choice = sc.nextLine().charAt(0);
            if (choice == 'y' || choice == 'Y') {
                System.out.println("Enter the data to be added");
                int val = sc.nextInt();
                dll.addNodeFromBack(val);
            } else if (choice == 'n' || choice == 'N') {
                break;
            }
        }
        dll.displayForward();
        System.out.println();
        dll.displayBackward();
        System.out.println();
        System.out.println(DLL.length);
        System.out.println();
        dll.deleteAtLast();
        dll.displayForward();
        System.out.println();
        dll.displayBackward();
        System.out.println();
        System.out.println(DLL.length);
    }
}