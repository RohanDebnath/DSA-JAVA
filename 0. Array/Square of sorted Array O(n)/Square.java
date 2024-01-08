public class Square {

    static void display(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    int[] result(int arr[])
    {
        int i=0;
        int j=arr.length-1;
        int k=arr.length-1;
        int res[]= new int[arr.length];
        while (k>0) {
            if(Math.abs(arr[i])>Math.abs(arr[j])){
                res[k]=arr[i]*arr[i];
                i++;
            }else{
                res[k]=arr[j]*arr[j];
                j--;
            }
            k--;
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[]=new int[]{-4,-1,0,3,10};
        display(arr);
        Square square= new Square();
        arr=square.result(arr);
        display(arr);
    }
}
