import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Que {

    static String [] generationOfBinNum(int val)
    {
      String result[]= new String[val];
      Queue<String> queue= new LinkedList<>();
      queue.offer("1");
      for(int i=0;i<result.length;i++)
      {
        result[i]=queue.poll();
        String s1=result[i]+"0";
        String s2=result[i]+"1";
        queue.offer(s1);
        queue.offer(s2);
      }
      return result;
    }
    public static void main(String[] args) {
        Que que=new Que();
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String arr[]= new String[n];
        arr=generationOfBinNum(n);
        for (String string : arr) {
            System.out.println(string);
        }
    }
}
