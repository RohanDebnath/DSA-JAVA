import java.util.Scanner;

public class CLL {
    private ListNode last;
    private static int length = 0;

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

    void addNode(int val) {
        ListNode newListNode = new ListNode(val);
        if (last == null) {
            last = newListNode;
            last.next = last;
        } else {
            newListNode.next = last.next;
            last.next = newListNode;
            last = newListNode;
        }
        length++;
    }

    void display() {
        ListNode currentListNode = last.next;
        if (last == null) {
            return;
        } else {
            while (currentListNode != last) {
                System.out.print(currentListNode.data + "->");
                currentListNode = currentListNode.next;
            }
            System.out.print(currentListNode.data + "->Null");
        }
    }

    void insertAtBeginning(int val) {
        ListNode newListNode = new ListNode(val);
        if (last == null) {
            last = newListNode;
        } else {
            newListNode.next = last.next;
            last.next = newListNode;
        }
        length++;
    }

    public static void main(String[] args) {
        CLL cll = new CLL();
        boolean decision = true;
        while (decision) {
            System.out.println("Do you want to insert Data? Y/N");
            Scanner sc = new Scanner(System.in);
            char choice = sc.nextLine().charAt(0);
            if (choice == 'y' || choice == 'Y') {
                System.out.println("Please enter your value");
                int val = sc.nextInt();
                cll.addNode(val);
            } else if (choice == 'n' || choice == 'N') {
                break;
            }

        }
        cll.display();
        System.out.println();
        System.out.println(CLL.length);
        cll.insertAtBeginning(5);
        System.out.println();
        cll.display();
        System.out.println();
        System.out.println(cll.length);
    }
}
