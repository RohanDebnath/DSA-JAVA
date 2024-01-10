public class Kadane {
    public static int maxSubArraySum(int []arr){
        int maxSoFar=arr[0];
        int curentMax=arr[0];
        for (int i = 1; i < arr.length; i++) {
            curentMax=curentMax+arr[i];
            if(curentMax<arr[i]){
                curentMax=arr[i];
            }
            if(maxSoFar<curentMax){
                maxSoFar=curentMax;
            }
        }
        return maxSoFar;
    }
    public static void main(String[] args) {
        int arr[]=new int[]{4,3,-2,6,-12,7,-1,6};
        System.out.println(maxSubArraySum(arr));
    }
}
