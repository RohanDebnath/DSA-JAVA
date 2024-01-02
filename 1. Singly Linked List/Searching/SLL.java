import java.util.Scanner;

public class SLL {

    private ListNode head;
    private static class ListNode
    {
        private ListNode next;
        private int data;

        public ListNode(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    void createNode(int val)
    {
        ListNode newNode=new ListNode(val);
        if(head==null)
        {
            head=newNode;
        }else
        {
            ListNode currentListNode=head;
            while (currentListNode.next!=null) {
                currentListNode=currentListNode.next;
                
            }
            currentListNode.next=newNode;
        }
    }
    void display()
    {
        ListNode currentListNode =head;
        while (currentListNode!=null) {
            System.out.print(currentListNode.data+"->");
            currentListNode=currentListNode.next;
        }
        System.out.print("NULL");
        System.out.println();
    }    
    void search(int val)
    {
        ListNode currentListNode=head;
        int count=1;
        while (currentListNode!=null) {
            if(currentListNode.data==val)
            {
                System.out.println("The value "+val+" was found at position "+count);
                break;
            }
            currentListNode=currentListNode.next;
            count++;
        }
        System.out.println("Sorry your entered value us not present");
    }
    public static void main(String[] args) {
        SLL sll=new SLL();
        boolean decision=true;
        while (decision) {
            System.out.println("DO you want to add node? Y/N");
            Scanner sc =new Scanner(System.in);
            char choice=sc.nextLine().charAt(0);
            if(choice=='y'||choice=='Y')
            {
                System.out.println("Enter the value to be added");
                int val=sc.nextInt();
                sll.createNode(val);
            }
            else if(choice=='n' || choice=='N')
            {
                break;
            }
        }
        sll.display();
        sll.search(30);
        

    }    
}
