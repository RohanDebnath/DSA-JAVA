public class QSort {
    static void display(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    void sort(int arr[], int low, int high) {
        if (low < high) {
            int p = partition(arr, low, high);
            sort(arr, low, p - 1);
            sort(arr, p + 1, high);
        }
    }
    // int partition(int arr[], int low, int high)
    // {
    //     int pivot=arr[high];
    //     int i=low;
    //     int j=low;
    //     while (i<=high) {
    //         if(arr[i]<=pivot){
    //             arr[i]=arr[i]^arr[j];
    //             arr[j]=arr[i]^arr[j];
    //             arr[i]=arr[i]^arr[j];
    //             j++;
    //         }
    //         i++;
    //     }
    //     return j-1;
    // }

    int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
    
        for (int j = low; j <= high - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    
        // Swap arr[i+1] and arr[high] to place pivot in its correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
    
        return i + 1;
    }
    
    public static void main(String[] args) {
        int arr[] = new int[] { 2, 0, 1, 3, 6, 5 };
        display(arr);
        QSort qs= new QSort();
        qs.sort(arr, 0, arr.length-1);
        display(arr);
        
    }
}
