import java.util.Scanner;

public class SLL {

    private ListNode head;
    private static class ListNode {
        private int data;
        private ListNode next;
        public ListNode(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public void display()
    {
        ListNode currentListNode=head;
        while (currentListNode!=null) {
            System.out.print(currentListNode.data+"->");
            currentListNode=currentListNode.next;
        }
        System.out.print("Null");
    }

    void insetAtlast(int val)
    {
        ListNode newNode= new ListNode(val);
        if(head==null)
        {
            head=newNode;
        }
        ListNode currentListNode= head;
        while (currentListNode.next!=null) {
            currentListNode=currentListNode.next;
        }
        currentListNode.next=newNode;
    }
    public static void main(String[] args) {
        SLL sll= new SLL();
        sll.head= new ListNode(10);
        ListNode second= new ListNode(20);
        ListNode third= new ListNode(20);

        sll.head.next=second;
        second.next=third;
        third.next=null;
        sll.display();
        boolean choice=true;
        System.out.println();
        while (choice) {
            Scanner sc = new Scanner(System.in);
            char decision=' ';
            System.out.println("Do you want to insert node? Press Y/N");
            decision=sc.nextLine().charAt(0);
            if(decision=='n'||decision=='N')
                choice=false;
            else{
            System.out.println("Enter your value");
            int val=sc.nextInt();
            sll.insetAtlast(val);
            }
        }
        sll.display();
    }
}
