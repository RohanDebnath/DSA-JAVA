public class SelctnSort {
    static int arr[];
    static void solution(int arr[])
    {
        int n=arr.length;
        for (int i = 0; i<n-1; i++) {
            int min=i;
            for (int j = i+1; j<n; j++) {
                if(arr[j]<arr[min])
                min=j;
            }
            arr[i]=arr[i]^arr[min];
            arr[min]=arr[i]^arr[min];
            arr[i]=arr[i]^arr[min];
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        arr=new int[]{5,1,10,2,9};
        solution(arr);
      
    }
}
