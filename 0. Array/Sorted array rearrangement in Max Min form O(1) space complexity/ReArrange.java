public class ReArrange {
 
    void display(int arr[])
    {
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    int[] reArrange_SortMaxMin(int arr[])
    {
        int minIn=0;
        int maxIn=arr.length-1;
        int max=arr[arr.length-1]+1;
        for (int i = 0; i < arr.length; i++) {
            if(i%2==0){
                arr[i]=arr[i]+(arr[maxIn]%max)*max;
                maxIn--;
            }else{
                arr[i]=arr[i]+(arr[minIn]%max)*max;
                minIn++;
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=arr[i]/max;
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[]=new int[]{2,3,5,6,8,9};
        ReArrange reArrange=new ReArrange();
        reArrange.display(arr);
        arr=reArrange.reArrange_SortMaxMin(arr);
        System.out.println("After Sorting");
        reArrange.display(arr);
    }
}
