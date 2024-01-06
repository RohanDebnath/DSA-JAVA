public class InsertAtPos {

    static int search(int arr[], int val) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (high + low) / 2;
            if (val == arr[mid])
                return mid;
            else if (val < arr[mid])
                high = mid - 1;
            else
                low = mid + 1;
        }
        return low;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 10, 20, 47, 59, 65, 75, 88, 99 };
        int res=search(arr, 66);
        System.out.println(res);
    }
}
