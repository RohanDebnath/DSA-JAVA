class Solution {
    public static boolean isHappy(int n) {
        int sum=0;
        while(n>0){
            sum+=Math.pow(n%10,2);;
            n/=10;
            System.out.println(sum+" "+n);
        }
        System.out.println("The sum out: "+ sum);
        if(sum==1){
            return true;
        }else if(sum>10){
           return isHappy(sum);
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }
}