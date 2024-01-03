import java.util.Scanner;

public class Queu {

    private ListNode front;
    private ListNode rear;
    private static int length = 0;

    private static class ListNode {
        private ListNode next;
        private int data;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private int length() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    void EnQueue(int val)
    {
        ListNode newNode=new ListNode(val);
        if(front==null)
        {
            front=newNode;
        }else{
            rear.next=newNode;
        }
        rear=newNode;
        length++;
    }
    void DeQueue()
    {
        if(isEmpty()){
            System.out.println("Nothing left in the Queue");
        }else{
            front=front.next;
            length--;
        }
    }
    void display()
    {
        ListNode currentListNode=front;
        if(front==null)
        {
            System.out.println("Nothing to print");
            return;
        }
        while (currentListNode!=rear) {
            System.out.print(currentListNode.data+"->");
            currentListNode=currentListNode.next;
        }
        System.out.println(currentListNode.data+"->NULL");
    }
    public static void main(String[] args) {
        Queu queu=new Queu();
        boolean decision=true;
        while (decision) {
            System.out.println("DO you want to add data? Y/N");
            Scanner sc= new Scanner(System.in);
            char choice=sc.nextLine().charAt(0);
            if(choice=='y'||choice=='Y')
            {
                System.out.println("Please enter your value");
                int val=sc.nextInt();
                queu.EnQueue(val);
            }else if(choice=='n'||choice=='N'){
                break;
            }
        }
        queu.display();
        System.out.println(queu.length());
        queu.DeQueue();
        System.out.println();
        queu.display();
        System.out.println(queu.length());
    }
}
