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

    void addNode(int val)
    {
        ListNode newNode=new ListNode(val);
        if(head==null)
        {
            head=newNode;
        }else{
            ListNode currentNode=head;
            while (currentNode.next!=null) {
                currentNode=currentNode.next;
            }
            currentNode.next=newNode;
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
    void inserAtFirst(int val)
    {
        ListNode newNode=new ListNode(val);
        newNode.next=head;
        head=newNode;
    }
    
    public static void main(String[] args) {
        SLL sll = new SLL();
        boolean decision=true;
        while (decision) {
            System.out.println("Do you want to add node? Y/N");
            Scanner sc = new Scanner(System.in);
            char choice=sc.nextLine().charAt(0);
            if(choice=='Y' || choice=='y')
            {
                System.out.println("Please add your value");
                int val=sc.nextInt();
                sll.addNode(val);
            }
            else if(choice=='n'||choice=='N')
            {
                break;
            }
        }
        sll.display();
        sll.inserAtFirst(1);
        System.out.println();
        sll.display();

    }
}
