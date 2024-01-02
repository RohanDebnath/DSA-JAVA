
public class Stack {

    private int top = -1;
    private int arr[];

    public Stack(int capacity) {
        arr = new int[capacity];
    }

    public Stack() {
        this(10); // By deafult 10 if the capacity is not mentioned
    }

    boolean isFull() {
        return top == arr.length - 1;
    }

    void push(int val) {
        if (isFull())
            System.out.println("Nothing can be pushed");
        else {
            top++;
            arr[top] = val;
        }
    }
    boolean isEmpty()
    {
        return top==-1;
    }
    int pop()
    {
        if(isEmpty())
        System.out.println("Nothing to be popped");
        int result=arr[top];
        top--;
        return result;
    }
    void display()
    {
        int dummy=top;
        while (dummy!=-1) {
            System.out.println(arr[dummy]);
            dummy--;
        }
    }
    public static void main(String[] args) {
        Stack stack= new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.display();


    }
}
