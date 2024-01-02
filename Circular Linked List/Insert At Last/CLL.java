import java.util.Scanner;

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

    void insertAtEnd(int val) {
        ListNode newNode = new ListNode(val);
        if (last == null) {
            last = newNode;
            last.next = last;
        } else {
            newNode.next = last.next;
            last.next = newNode;
            last = newNode;
        }
        length++;
    }

    void display() {
        if (last == null) {
            return;
        }
        ListNode currentListNode = last.next;
        while (currentListNode != last) {
            System.out.print(currentListNode.data + "->");
            currentListNode = currentListNode.next;
        }
        System.out.print(currentListNode.data + "->Null");
    }

    public static void main(String[] args) {
        CLL cll = new CLL();
        boolean decision = true;
        while (decision) {
            System.out.println("DO you want to insert data? Y/N");
            Scanner sc = new Scanner(System.in);
            char choice = sc.nextLine().charAt(0);
            if (choice == 'Y' || choice == 'y') {
                System.out.println("Enter your value");
                int val = sc.nextInt();
                cll.insertAtEnd(val);
            } else if (choice == 'n' || choice == 'N') {
                break;
            }
        }
        cll.display();
    }
}
