public class BinarySearch {
    static int solution(int arr[], int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key)
                return mid;
            else if (arr[low] < key)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 10, 20, 47, 59, 65, 75, 88, 99 };
        int var = solution(arr, 59); //47 dile kaj korche na
        if (var == -1)
            System.out.println("No not found");
        else
            System.out.println("Yes the value has been found at index: " + var);
    }
}
