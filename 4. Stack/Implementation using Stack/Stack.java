public class Stack {

    private ListNode top = null;
    private static int length = 0;

    private static class ListNode {
        private ListNode next;
        private int data;

        public ListNode(int data) {
            this.data = data;
        }
    }

    public int length() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }
     
    public void push(int val)
    {
        ListNode newNode=new ListNode(val);
        newNode.next=top;
        top=newNode;
        length++;
    }

    public int pop()
    {
        int popped_element=0;
        if(isEmpty())
        System.out.println("Nothing to be popped");
        else{
            popped_element=top.data;
            top=top.next;
            length--;
        }
        return popped_element;
    }
    public int peek()
    {
        if(isEmpty())
        System.out.println("No element present in the stack");
        return top.data; 
    }
    void display()
    {
        ListNode currentListNode=top;
        while (currentListNode!=null) {
            System.out.println(currentListNode.data);
            currentListNode=currentListNode.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        Stack stack= new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
        System.out.println("Printing the stack elements");
        stack.display();
    }
}
