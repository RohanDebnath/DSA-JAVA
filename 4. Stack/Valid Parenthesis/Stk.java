import java.util.Stack;

public class Stk {
    static void matchParenthesis(String str) {
        Stack<Character> stack = new Stack<>();
        char arr[] = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '(' || arr[i] == '{' || arr[i] == '[')
                stack.push(arr[i]);
            else {
                if (stack.isEmpty()) {
                    System.out.println("Not Balenced");
                    return;
                } else {
                    if ((arr[i] == ')' && stack.peek() == '(') ||
                            (arr[i] == '}' && stack.peek() == '{') ||
                            (arr[i] == ']' && stack.peek() == '[')) {
                        stack.pop();
                    } else {
                        System.out.println("Not Balenced");
                        return;
                    }
                }
            }
        }
        if (stack.isEmpty()) {
            System.out.println("Balenced");
        }
    }

    public static void main(String[] args) {
        matchParenthesis("[{()}]");
        matchParenthesis("[)}]");
    }
}
