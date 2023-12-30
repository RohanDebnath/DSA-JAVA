import java.util.Scanner;

public class SLL {

    private ListNode head;
    private static class ListNode{
        private ListNode next;
        private int data;
        public ListNode(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    void addNode(int val)
    {
        ListNode newNode= new ListNode(val);
        if(head==null)
        {
            head=newNode;
        }else{
            ListNode currentListNode= head;
            while (currentListNode.next!=null) {
                currentListNode=currentListNode.next;
            }
            currentListNode.next=newNode;
        }
    }
    void display()
    {
        ListNode currentListNode=head;
        while (currentListNode!=null) {
            System.out.print(currentListNode.data+"->");
            currentListNode=currentListNode.next;
        }
        System.out.print("NULL");
    }
    void insertAtPosition(int pos, int val)
    {
        ListNode newNode= new ListNode(val);
        if(head==null)
        {
            newNode.next=head;
            head=newNode;
        }
        else
        {
            ListNode prevListNode=head;
            int counter=0;
            while (counter<pos-1) {
                prevListNode=prevListNode.next;
                counter++;
            }
            ListNode currListNode=prevListNode.next;
            prevListNode.next=newNode;
            newNode.next=currListNode;
        }
    }
    public static void main(String[] args) {
        SLL sll= new SLL();
        boolean decision=true;
        while (decision) {
            Scanner sc= new Scanner(System.in);
            System.out.println("Do you want to add Node ? Y/N");
            char choice=sc.nextLine().charAt(0);
            if(choice=='Y' || choice=='y')
            {
                System.out.println("Please enter your value");
                int val=sc.nextInt();
                sll.addNode(val);
            }
            else if(choice=='n'||choice=='N'){
                break;
            }
        }
        sll.display();

        sll.insertAtPosition(2, 500);
        System.out.println();
        sll.display();
    }    
}
