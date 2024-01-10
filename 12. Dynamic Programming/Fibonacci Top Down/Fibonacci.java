public class Fibonacci {
    static int result(int[] memo, int n)
    {
        if(n<2){
            memo[n]=n;
        }else{
            int left=result(memo,n-1);
            int right=result(memo, n-2);
            memo[n]=left+right;
        }
        return memo[n];
    }
 public static void main(String[] args) {
    System.out.println(result(new int[6+1], 6));
 }   
}
