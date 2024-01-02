import java.util.*;
public class Stk {
    static String result(String str)
    {
        Stack<Character> stack=new Stack<>();
        char[] charArr=str.toCharArray();
        for(char ch:charArr){
            stack.push(ch); // Sab thik ha 
        }
        for(int i=0;i<charArr.length;i++)
        {
            charArr[i]=stack.pop();
        }
        return new String(charArr);
    }
    public static void main(String[] args) {
        Stk obj= new Stk();
        System.out.println("Please enter your string");
        Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(result(str));
    }    
}
