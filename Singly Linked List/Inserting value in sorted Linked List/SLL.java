import java.util.Scanner;

public class SLL {
    private ListNode head;

    private static class ListNode {
        private ListNode next;
        private int data;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }

    }

    void addNode(int data) {
        ListNode newNode = new ListNode(data);
        if (head == null) {
            head = newNode;
        } else {
            ListNode currentListNode = head;
            while (currentListNode.next != null) {
                currentListNode = currentListNode.next;
            }
            currentListNode.next = newNode;
        }
    }
    void display() {
        ListNode currentListNode = head;
        while (currentListNode != null) {
            System.out.print(currentListNode.data + "->");
            currentListNode = currentListNode.next;
        }
        System.out.print("NULL");
    }

    void insertionSortedValue(int val)
    {
        ListNode newNode= new ListNode(val);
        ListNode temp=null;
        ListNode currentListNode=head;
        while (currentListNode!=null && (currentListNode.data<newNode.data)) {
            temp=currentListNode;
            currentListNode=currentListNode.next;
        }
        newNode.next=currentListNode;
        temp.next=newNode;
    }
    public static void main(String[] args) {
        SLL sll = new SLL();
        boolean decision = true;
        while (decision) {
            System.out.println("Do you want to insert a Node? Y/N");
            Scanner sc = new Scanner(System.in);
            char choice = sc.nextLine().charAt(0);
            if (choice == 'y' || choice == 'Y') {
                System.out.println("Enter Your data");
                int data = sc.nextInt();
                sll.addNode(data);

            } else if (choice == 'n' || choice == 'N') {
                break;
            }
        }
        sll.display();
        System.out.println();
        sll.insertionSortedValue(12);
        sll.display();
    }
}
